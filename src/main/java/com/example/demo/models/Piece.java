package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Piece {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Performance performance;

    @ManyToMany
    private Collection<Instrument> instruments;

    public Piece() {
    }

    public Piece(String title) {
        this.title = title;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Performance getPerformance() {
        return performance;
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }
}
