package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AvailablePerformance {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Player player;

    @ManyToOne
    private Performance performance;

    private Long performanceId;

    private boolean accepted;

    public AvailablePerformance() {}

    public AvailablePerformance(Long performanceId, boolean accepted) {
        this.performanceId = performanceId;
        this.accepted = accepted;
    }

    public AvailablePerformance(Performance performance, boolean accepted) {
        this.performance = performance;
        this.accepted = accepted;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Long getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public Performance getPerformance() {
        return performance;
    }

    public Long getPerformanceId() {
        return performanceId;
    }

    public boolean isAccepted() {
        return accepted;
    }
}
