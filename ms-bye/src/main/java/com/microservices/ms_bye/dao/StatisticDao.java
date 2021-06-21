package com.microservices.ms_bye.dao;

import com.microservices.ms_bye.model.Statistic;

import java.util.List;

public interface StatisticDao {
    void create(Statistic statistic);
    List<Statistic> getAll();
    void update(Statistic statistic);
}
