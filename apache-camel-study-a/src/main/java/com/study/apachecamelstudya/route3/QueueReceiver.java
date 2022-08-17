package com.study.apachecamelstudya.route3;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiver extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:my-active-mq")
                .to("log:received_messages");
    }
}
