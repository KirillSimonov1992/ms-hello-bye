package com.microservices.ms_bye.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name = "statistic")
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "count_hello")
    private Long countHello;

    @Column(name = "count_bye")
    private Long countBye;

    public Statistic() {
       countHello = 1L;
        countBye = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountHello() {
        return countHello;
    }

    public void setCountHello(Long countHello) {
        this.countHello = countHello;
    }

    public Long getCountBye() {
        return countBye;
    }

    public void setCountBye(Long countBye) {
        this.countBye = countBye;
    }
}
