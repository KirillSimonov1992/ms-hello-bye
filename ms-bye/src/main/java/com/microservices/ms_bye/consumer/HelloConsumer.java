package com.microservices.ms_bye.consumer;

import com.microservices.ms_bye.model.Statistic;
import com.microservices.ms_bye.service.StatisticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableKafka
public class HelloConsumer {

    @Autowired
    private StatisticServiceImpl statisticService;

    @KafkaListener(topics="hello")
    public void hello(String msg) {
        List<Statistic> statisticList = statisticService.getAll();
        if (statisticList.isEmpty()) {
            Statistic statistic = new Statistic();
            statisticService.create(statistic);
        } else {
            Statistic statistic = statisticList.get(0);
            long count = statistic.getCountHello();
            statistic.setCountHello(++count);
            statisticService.update(statistic);
        }
    }
}
