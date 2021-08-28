package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PerformanceId {

    @Id
    @GeneratedValue
    private Long id;

    private Long performanceId;

    public PerformanceId() {
    }

    public PerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }
}
