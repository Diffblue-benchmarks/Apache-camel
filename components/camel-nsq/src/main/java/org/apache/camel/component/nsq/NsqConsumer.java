package org.apache.camel.component.nsq;

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.NSQMessage;
import com.github.brainlag.nsq.ServerAddress;
import com.github.brainlag.nsq.callbacks.NSQMessageCallback;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

/**
 * The nsq consumer.
 */
public class NsqConsumer extends DefaultConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(NsqConsumer.class);

    private final Processor processor;
    private ExecutorService executor;
    private boolean active;
    NSQConsumer consumer;
    private final NsqConfiguration configuration;

    public NsqConsumer(NsqEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        this.processor = processor;
        this.configuration = getEndpoint().getNsqConfiguration();
    }

    @Override
    public NsqEndpoint getEndpoint() {
        return (NsqEndpoint) super.getEndpoint();
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        LOG.debug("Starting NSQ Consumer");
        executor = getEndpoint().createExecutor();

        LOG.debug("Getting NSQ Connection");
        NSQLookup lookup = new DefaultNSQLookup();

        for(ServerAddress server : configuration.getServerAddresses()) {
            lookup.addLookupAddress(server.getHost(),
                    server.getPort() == 0 ? configuration.getLookupServerPort() : server.getPort());
        }

        consumer = new NSQConsumer(lookup, configuration.getTopic(),
                configuration.getChannel(), new CamelNsqMessageHandler(), getEndpoint().getNsqConfig());
        consumer.setLookupPeriod(configuration.getLookupInterval());
        consumer.setExecutor(getEndpoint().createExecutor());
        consumer.start();
    }

    @Override
    protected void doStop() throws Exception {

        LOG.debug("Stopping NSQ Consumer");
        if (consumer != null) {
            consumer.shutdown();
        }
        if (executor != null) {
            if (getEndpoint() != null && getEndpoint().getCamelContext() != null) {
                getEndpoint().getCamelContext().getExecutorServiceManager().shutdownNow(executor);
            } else {
                executor.shutdownNow();
            }
        }

        executor = null;

        super.doStop();
    }

        class CamelNsqMessageHandler implements NSQMessageCallback {

            @Override
            public void message(NSQMessage msg) {
                LOG.debug("Received Message: {}", msg);
                Exchange exchange = getEndpoint().createExchange(ExchangePattern.InOnly);
                exchange.getIn().setBody(msg.getMessage());
                exchange.getIn().setHeader(NsqConstants.NSQ_MESSAGE_ID, msg.getId());
                exchange.getIn().setHeader(NsqConstants.NSQ_MESSAGE_ATTEMPTS, msg.getAttempts());
                exchange.getIn().setHeader(NsqConstants.NSQ_MESSAGE_TIMESTAMP, msg.getTimestamp());
                try {
                    if (configuration.getAutoFinish()) {
                        msg.finished();
                    } else {
                        exchange.addOnCompletion(new NsqSynchronization(msg, (int) configuration.getRequeueInterval()));
                    }
                    processor.process(exchange);
                } catch (Exception e) {
                    if (!configuration.getAutoFinish()) {
                        msg.requeue((int) configuration.getRequeueInterval());
                    }
                    getExceptionHandler().handleException("Error during processing", exchange, e);
                }
            }
        }
}