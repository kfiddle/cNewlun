package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Piece implements Comparable<Piece>{

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String composer;

    @ManyToOne
    private Performance performance;

    @ManyToMany
    private Collection<Instrument> instruments;

    public Piece() {
    }

    public Piece(String title) {
        this.title = title;
    }

    public Piece(String title, String composer) {
        this.title = title;
        this.composer = composer;
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

    public String getComposer() {
        return composer;
    }

    public Performance getPerformance() {
        return performance;
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    @Override
    public int compareTo(Piece otherPiece) {
        return composer.compareTo(otherPiece.getComposer());
    }
}
