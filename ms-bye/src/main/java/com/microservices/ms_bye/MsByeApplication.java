package com.microservices.ms_bye;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.Properties;

@SpringBootApplication
public class MsByeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsByeApplication.class, args);
    }

}
