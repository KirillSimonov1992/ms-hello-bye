package com.web.microservice_hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/hello")
    public String hello() {
        kafkaTemplate.send("hello", "hello");
        return "hello.html";
    }
}
