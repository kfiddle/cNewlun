package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PiecePerformance {

    @Id
    @GeneratedValue
    private Long id;

    private Long pieceId;
    private Long performanceId;

    private int orderInProgram;

    public PiecePerformance() {

    }

    public PiecePerformance(Long pieceId, Long performanceId) {
        this.pieceId = pieceId;
        this.performanceId = performanceId;
    }

    public PiecePerformance(Long pieceId, Long performanceId, int orderInProgram) {
        this.pieceId = pieceId;
        this.performanceId = performanceId;
        this.orderInProgram = orderInProgram;
    }

    public void setPieceId(Long pieceId) {
        this.pieceId = pieceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public void setOrderInProgram(int orderInProgram) {
        this.orderInProgram = orderInProgram;
    }

    public Long getId() {
        return id;
    }

    public Long getPieceId() {
        return pieceId;
    }

    public Long getPerformanceId() {
        return performanceId;
    }

    public int getOrderInProgram() {
        return orderInProgram;
    }
}
