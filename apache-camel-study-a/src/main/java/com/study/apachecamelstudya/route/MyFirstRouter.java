package com.study.apachecamelstudya.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/*@Component*/
public class MyFirstRouter extends RouteBuilder {

    @Autowired
    private GetCurrentTime getCurrentTime;

    @Autowired
    private MyFirstProcessor myFirstProcessor;

    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
                .log("${body}")
                .transform().constant(LocalDateTime.now())
                .bean("getCurrentTime")
                .bean(myFirstProcessor)
                .process(new SimpleLoggingProcessor())
                .to("log:first-timer");
    }
}
