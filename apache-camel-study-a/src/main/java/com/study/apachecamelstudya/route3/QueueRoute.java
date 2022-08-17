package com.study.apachecamelstudya.route3;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class QueueRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:active-mq-timer?period=1000")
                .transform().constant("test message")
                .to("activemq:my-active-mq");
    }
}
