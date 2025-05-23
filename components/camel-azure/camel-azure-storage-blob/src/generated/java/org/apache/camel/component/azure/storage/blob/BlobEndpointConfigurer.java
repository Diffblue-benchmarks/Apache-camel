/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.storage.blob;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class BlobEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BlobEndpoint target = (BlobEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "blobname":
        case "blobName": target.getConfiguration().setBlobName(property(camelContext, java.lang.String.class, value)); return true;
        case "bloboffset":
        case "blobOffset": target.getConfiguration().setBlobOffset(property(camelContext, long.class, value)); return true;
        case "blobsequencenumber":
        case "blobSequenceNumber": target.getConfiguration().setBlobSequenceNumber(property(camelContext, java.lang.Long.class, value)); return true;
        case "blobserviceclient":
        case "blobServiceClient": target.setBlobServiceClient(property(camelContext, com.azure.storage.blob.BlobServiceClient.class, value)); return true;
        case "blobtype":
        case "blobType": target.getConfiguration().setBlobType(property(camelContext, org.apache.camel.component.azure.storage.blob.BlobType.class, value)); return true;
        case "blocklisttype":
        case "blockListType": target.getConfiguration().setBlockListType(property(camelContext, com.azure.storage.blob.models.BlockListType.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "changefeedcontext":
        case "changeFeedContext": target.getConfiguration().setChangeFeedContext(property(camelContext, com.azure.core.util.Context.class, value)); return true;
        case "changefeedendtime":
        case "changeFeedEndTime": target.getConfiguration().setChangeFeedEndTime(property(camelContext, java.time.OffsetDateTime.class, value)); return true;
        case "changefeedstarttime":
        case "changeFeedStartTime": target.getConfiguration().setChangeFeedStartTime(property(camelContext, java.time.OffsetDateTime.class, value)); return true;
        case "closestreamafterread":
        case "closeStreamAfterRead": target.getConfiguration().setCloseStreamAfterRead(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": target.getConfiguration().setCloseStreamAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "commitblocklistlater":
        case "commitBlockListLater": target.getConfiguration().setCommitBlockListLater(property(camelContext, boolean.class, value)); return true;
        case "createappendblob":
        case "createAppendBlob": target.getConfiguration().setCreateAppendBlob(property(camelContext, boolean.class, value)); return true;
        case "createpageblob":
        case "createPageBlob": target.getConfiguration().setCreatePageBlob(property(camelContext, boolean.class, value)); return true;
        case "credentialtype":
        case "credentialType": target.getConfiguration().setCredentialType(property(camelContext, org.apache.camel.component.azure.storage.blob.CredentialType.class, value)); return true;
        case "credentials": target.getConfiguration().setCredentials(property(camelContext, com.azure.storage.common.StorageSharedKeyCredential.class, value)); return true;
        case "datacount":
        case "dataCount": target.getConfiguration().setDataCount(property(camelContext, java.lang.Long.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "downloadlinkexpiration":
        case "downloadLinkExpiration": target.getConfiguration().setDownloadLinkExpiration(property(camelContext, java.lang.Long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filedir":
        case "fileDir": target.getConfiguration().setFileDir(property(camelContext, java.lang.String.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "leaseblob":
        case "leaseBlob": target.getConfiguration().setLeaseBlob(property(camelContext, boolean.class, value)); return true;
        case "leasedurationinseconds":
        case "leaseDurationInSeconds": target.getConfiguration().setLeaseDurationInSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxresultsperpage":
        case "maxResultsPerPage": target.getConfiguration().setMaxResultsPerPage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxretryrequests":
        case "maxRetryRequests": target.getConfiguration().setMaxRetryRequests(property(camelContext, int.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition.class, value)); return true;
        case "pageblobsize":
        case "pageBlobSize": target.getConfiguration().setPageBlobSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "regex": target.getConfiguration().setRegex(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "sastoken":
        case "sasToken": target.getConfiguration().setSasToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serviceclient":
        case "serviceClient": target.getConfiguration().setServiceClient(property(camelContext, com.azure.storage.blob.BlobServiceClient.class, value)); return true;
        case "sourceblobaccesskey":
        case "sourceBlobAccessKey": target.getConfiguration().setSourceBlobAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"credentials", "serviceClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "blobname":
        case "blobName": return java.lang.String.class;
        case "bloboffset":
        case "blobOffset": return long.class;
        case "blobsequencenumber":
        case "blobSequenceNumber": return java.lang.Long.class;
        case "blobserviceclient":
        case "blobServiceClient": return com.azure.storage.blob.BlobServiceClient.class;
        case "blobtype":
        case "blobType": return org.apache.camel.component.azure.storage.blob.BlobType.class;
        case "blocklisttype":
        case "blockListType": return com.azure.storage.blob.models.BlockListType.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "changefeedcontext":
        case "changeFeedContext": return com.azure.core.util.Context.class;
        case "changefeedendtime":
        case "changeFeedEndTime": return java.time.OffsetDateTime.class;
        case "changefeedstarttime":
        case "changeFeedStartTime": return java.time.OffsetDateTime.class;
        case "closestreamafterread":
        case "closeStreamAfterRead": return boolean.class;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return boolean.class;
        case "commitblocklistlater":
        case "commitBlockListLater": return boolean.class;
        case "createappendblob":
        case "createAppendBlob": return boolean.class;
        case "createpageblob":
        case "createPageBlob": return boolean.class;
        case "credentialtype":
        case "credentialType": return org.apache.camel.component.azure.storage.blob.CredentialType.class;
        case "credentials": return com.azure.storage.common.StorageSharedKeyCredential.class;
        case "datacount":
        case "dataCount": return java.lang.Long.class;
        case "delay": return long.class;
        case "downloadlinkexpiration":
        case "downloadLinkExpiration": return java.lang.Long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "filedir":
        case "fileDir": return java.lang.String.class;
        case "greedy": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "leaseblob":
        case "leaseBlob": return boolean.class;
        case "leasedurationinseconds":
        case "leaseDurationInSeconds": return java.lang.Integer.class;
        case "maxresultsperpage":
        case "maxResultsPerPage": return java.lang.Integer.class;
        case "maxretryrequests":
        case "maxRetryRequests": return int.class;
        case "operation": return org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition.class;
        case "pageblobsize":
        case "pageBlobSize": return java.lang.Long.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "prefix": return java.lang.String.class;
        case "regex": return java.lang.String.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "sastoken":
        case "sasToken": return java.lang.String.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "serviceclient":
        case "serviceClient": return com.azure.storage.blob.BlobServiceClient.class;
        case "sourceblobaccesskey":
        case "sourceBlobAccessKey": return java.lang.String.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "timeout": return java.time.Duration.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BlobEndpoint target = (BlobEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "blobname":
        case "blobName": return target.getConfiguration().getBlobName();
        case "bloboffset":
        case "blobOffset": return target.getConfiguration().getBlobOffset();
        case "blobsequencenumber":
        case "blobSequenceNumber": return target.getConfiguration().getBlobSequenceNumber();
        case "blobserviceclient":
        case "blobServiceClient": return target.getBlobServiceClient();
        case "blobtype":
        case "blobType": return target.getConfiguration().getBlobType();
        case "blocklisttype":
        case "blockListType": return target.getConfiguration().getBlockListType();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "changefeedcontext":
        case "changeFeedContext": return target.getConfiguration().getChangeFeedContext();
        case "changefeedendtime":
        case "changeFeedEndTime": return target.getConfiguration().getChangeFeedEndTime();
        case "changefeedstarttime":
        case "changeFeedStartTime": return target.getConfiguration().getChangeFeedStartTime();
        case "closestreamafterread":
        case "closeStreamAfterRead": return target.getConfiguration().isCloseStreamAfterRead();
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return target.getConfiguration().isCloseStreamAfterWrite();
        case "commitblocklistlater":
        case "commitBlockListLater": return target.getConfiguration().isCommitBlockListLater();
        case "createappendblob":
        case "createAppendBlob": return target.getConfiguration().isCreateAppendBlob();
        case "createpageblob":
        case "createPageBlob": return target.getConfiguration().isCreatePageBlob();
        case "credentialtype":
        case "credentialType": return target.getConfiguration().getCredentialType();
        case "credentials": return target.getConfiguration().getCredentials();
        case "datacount":
        case "dataCount": return target.getConfiguration().getDataCount();
        case "delay": return target.getDelay();
        case "downloadlinkexpiration":
        case "downloadLinkExpiration": return target.getConfiguration().getDownloadLinkExpiration();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filedir":
        case "fileDir": return target.getConfiguration().getFileDir();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "leaseblob":
        case "leaseBlob": return target.getConfiguration().isLeaseBlob();
        case "leasedurationinseconds":
        case "leaseDurationInSeconds": return target.getConfiguration().getLeaseDurationInSeconds();
        case "maxresultsperpage":
        case "maxResultsPerPage": return target.getConfiguration().getMaxResultsPerPage();
        case "maxretryrequests":
        case "maxRetryRequests": return target.getConfiguration().getMaxRetryRequests();
        case "operation": return target.getConfiguration().getOperation();
        case "pageblobsize":
        case "pageBlobSize": return target.getConfiguration().getPageBlobSize();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "prefix": return target.getConfiguration().getPrefix();
        case "regex": return target.getConfiguration().getRegex();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "sastoken":
        case "sasToken": return target.getConfiguration().getSasToken();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "serviceclient":
        case "serviceClient": return target.getConfiguration().getServiceClient();
        case "sourceblobaccesskey":
        case "sourceBlobAccessKey": return target.getConfiguration().getSourceBlobAccessKey();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "timeout": return target.getConfiguration().getTimeout();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

