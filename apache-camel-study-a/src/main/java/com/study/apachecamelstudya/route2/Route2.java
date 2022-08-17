package com.study.apachecamelstudya.route2;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route2 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:file/input")
                .to("file:file/output");
    }
}
