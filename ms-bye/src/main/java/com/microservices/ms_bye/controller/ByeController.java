package com.microservices.ms_bye.controller;

import com.microservices.ms_bye.service.StatisticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ByeController {

    @Autowired
    private StatisticServiceImpl statisticService;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/bye")
    public String bye(Model model) {

        kafkaTemplate.send("bye", "bye");

        model.addAttribute("count", statisticService.getAll().get(0).getCountHello());
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("group.id", "hello");
//        props.put("key.deserializer",
//                "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("value.deserializer",
//                "org.apache.kafka.common.serialization.StringDeserializer");
//        props.setProperty("enable.auto.commit", "false");
//
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
//        consumer.subscribe(Collections.singletonList("hello"));
//
//        model.addAttribute("count", consumer.poll(Duration.ofMillis(500)).count());
//
//        consumer.close();
        return "bye.html";
    }
}
