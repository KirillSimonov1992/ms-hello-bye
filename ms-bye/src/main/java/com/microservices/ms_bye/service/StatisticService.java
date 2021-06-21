package com.microservices.ms_bye.service;

import com.microservices.ms_bye.model.Statistic;

import java.util.List;

public interface StatisticService {
    void create(Statistic statistic);
    List<Statistic> getAll();
    void update(Statistic statistic);
}
