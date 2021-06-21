package com.microservices.ms_bye.service;

import com.microservices.ms_bye.dao.StatisticDaoImpl;
import com.microservices.ms_bye.model.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticDaoImpl statisticDao;

    @Override
    public void create(Statistic statistic) {
        statisticDao.create(statistic);
    }

    @Override
    public List<Statistic> getAll() {
        return statisticDao.getAll();
    }

    @Override
    public void update(Statistic statistic) {
        statisticDao.update(statistic);
    }
}
