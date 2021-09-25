package com.example.demo.models;

import com.example.demo.enums.Chair;
import com.example.demo.enums.InstrumentEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PlayerPerformance {

    @Id
    @GeneratedValue
    private Long id;

    private Long playerId;
    private Long performanceId;

    private Chair chair;
    private InstrumentEnum instrumentEnum;

    public PlayerPerformance() {}

    public PlayerPerformance(Long playerId, Long performanceId) {
        this.playerId = playerId;
        this.performanceId = performanceId;
    }

    public PlayerPerformance(Long playerId, Long performanceId, Chair chair, InstrumentEnum instrumentEnum) {
        this.playerId = playerId;
        this.performanceId = performanceId;
        this.chair = chair;
        this.instrumentEnum = instrumentEnum;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void setInstrumentEnum(InstrumentEnum instrumentEnum) {
        this.instrumentEnum = instrumentEnum;
    }

    public Long getId() {
        return id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public Long getPerformanceId() {
        return performanceId;
    }

    public Chair getChair() {
        return chair;
    }

    public InstrumentEnum getInstrumentEnum() {
        return instrumentEnum;
    }


}
