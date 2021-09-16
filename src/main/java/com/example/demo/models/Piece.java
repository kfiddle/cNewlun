package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Piece implements Comparable<Piece> {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String composer;

    @OneToOne
    private Orchestration orchestration;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setOrchestration(Orchestration orchestration) {
        this.orchestration = orchestration;
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

//    public Performance getPerformance() {
//        return performance;
//    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public Orchestration getOrchestration() {
        return orchestration;
    }

    public Performance getPerformance() {
        return performance;
    }

    @Override
    public int compareTo(Piece otherPiece) {
        return composer.compareTo(otherPiece.getComposer());
    }
}
