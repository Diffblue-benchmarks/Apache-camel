/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.intercept;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

public class InterceptFromWhenTest extends ContextTestSupport {

    @Test
    public void testInterceptorWhen() throws Exception {
        getMockEndpoint("mock:goofy").expectedMessageCount(0);
        getMockEndpoint("mock:end").expectedMessageCount(1);

        sendBody("direct:start", "Hello World!");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testInterceptorWhenGoofy() throws Exception {
        getMockEndpoint("mock:goofy").expectedMessageCount(1);
        getMockEndpoint("mock:end").expectedMessageCount(0);

        sendBody("direct:start", "Hello Goofy");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                context.setTracing(true);

                interceptFrom().onWhen(simple("${body} contains 'Goofy'")).to("mock:goofy").stop();

                from("direct:start").to("mock:end");
            }
        };
    }
}
