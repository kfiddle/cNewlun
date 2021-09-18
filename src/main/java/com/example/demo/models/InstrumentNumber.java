package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InstrumentNumber {

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Instrument instrument;

    @ManyToOne
    private Piece piece;

    private int number;

    public InstrumentNumber() {
    }

    public InstrumentNumber(Instrument instrument) {
        this.instrument = instrument;
        number = 0;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public int getNumber() {
        return number;
    }
}
