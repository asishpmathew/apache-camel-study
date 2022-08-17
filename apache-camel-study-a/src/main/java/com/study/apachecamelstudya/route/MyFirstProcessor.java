package com.study.apachecamelstudya.route;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyFirstProcessor {
    public void process(String message) {
        log.info("Process message {}", message);
    }
}
