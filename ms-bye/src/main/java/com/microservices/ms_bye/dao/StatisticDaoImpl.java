package com.microservices.ms_bye.dao;

import com.microservices.ms_bye.model.Statistic;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StatisticDaoImpl implements StatisticDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(Statistic statistic) {
        entityManager.persist(statistic);
    }

    @Override
    public List<Statistic> getAll() {
        return entityManager.createQuery(
                "select s from Statistic s", Statistic.class
        ).getResultList();
    }

    @Override
    public void update(Statistic statistic) {
        entityManager.merge(statistic);
    }
}
