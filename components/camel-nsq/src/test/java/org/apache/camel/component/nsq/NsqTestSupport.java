package org.apache.camel.component.nsq;

import org.apache.camel.test.testcontainers.ContainerAwareTestSupport;
import org.testcontainers.containers.FixedHostPortGenericContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NsqTestSupport extends ContainerAwareTestSupport {

    public static final String CONTAINER_NSQLOOKUPD_IMAGE = "nsqio/nsq";
    public static final String CONTAINER_NSQLOOKUPD_NAME = "nsqlookupd";

    public static final String CONTAINER_NSQD_IMAGE = "nsqio/nsq";
    public static final String CONTAINER_NSQD_NAME = "nsqd";

    Network network;

    @Override
    protected List<GenericContainer<?>> createContainers() {
        network = Network.newNetwork();
        return new ArrayList<GenericContainer<?>>(
                Arrays.asList(
                        nsqlookupdContainer(network),
                        nsqdContainer(network)
                ));
    }

    public static GenericContainer<?> nsqlookupdContainer(Network network) {
        return new FixedHostPortGenericContainer<>(CONTAINER_NSQLOOKUPD_IMAGE)
                .withFixedExposedPort(4160, 4160)
                .withFixedExposedPort(4161, 4161)
                .withNetworkAliases(CONTAINER_NSQLOOKUPD_NAME)
                .withCommand("/nsqlookupd").withNetwork(network);
    }

    public static GenericContainer<?> nsqdContainer(Network network) {
        return new FixedHostPortGenericContainer<>(CONTAINER_NSQD_IMAGE)
                .withFixedExposedPort(4150, 4150)
                .withFixedExposedPort(4151, 4151)
                .withNetworkAliases(CONTAINER_NSQD_NAME)
                .withCommand(String.format("/nsqd --broadcast-address=%s --lookupd-tcp-address=%s:4160",
                        "localhost", CONTAINER_NSQLOOKUPD_NAME)).withNetwork(network);
    }

    public String getNsqConsumerUrl() {
        return String.format("%s:%d", "localhost", 4161);
    }

    public String getNsqProducerUrl() {
        return String.format("%s:%d", "localhost", 4150);
    }
}