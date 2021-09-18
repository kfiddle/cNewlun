package com.example.demo.models;


import com.example.demo.repositories.InstrumentRepository;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.Collection;


@Entity
public class Piece implements Comparable<Piece> {


    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String composer;

    private int firstViolins;
    private int secondViolins;
    private int violas;
    private int cellos;
    private int basses;

    private int flutes;
    private int oboes;
    private int clarinets;
    private int ebClarinets;
    private int bassoons;

    private int horns;
    private int trumpets;
    private int trombones;

    private int tubas;
    private int timpanis;
    private int percussions;

    private int pianos;
    private int harps;

    @OneToOne
    private Orchestration orchestration;

    @OneToMany
    private Collection<InstrumentNumber> instrumentNumbers;

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

    public Piece(String title, String composer, Collection<InstrumentNumber> instrumentNumbers) {
        this.title = title;
        this.composer = composer;
        this.instrumentNumbers = instrumentNumbers;
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

    public void setInstrumentNumbers(Collection<InstrumentNumber> instrumentNumbers) {
        this.instrumentNumbers = instrumentNumbers;
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

    public Collection<InstrumentNumber> getInstrumentNumbers() {
        return instrumentNumbers;
    }

    @Override
    public int compareTo(Piece otherPiece) {
        return composer.compareTo(otherPiece.getComposer());
    }
}
