package com.study.apachecamelstudya.route;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GetCurrentTime {


    public String getCurrentTime() {
        return "time now2:"+ LocalDateTime.now();
    }


}
