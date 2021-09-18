package com.example.demo.models;


import com.example.demo.enums.InstrumentEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Locale;

@Entity
public class Instrument {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private InstrumentEnum instrumentEnum;

    @JsonIgnore
    @ManyToMany()
    private Collection<Player> players;

    @ManyToMany
    private Collection<Piece> pieces;

    @OneToMany(mappedBy = "instrument")
    private Collection<InstrumentNumber> instrumentNumbers;

    public Instrument() {
    }

    public Instrument(String name) {
        this.name = name;
    }

    public Instrument(String name, InstrumentEnum instrumentEnum) {
        this.name = name;
        this.instrumentEnum = instrumentEnum;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public InstrumentEnum getInstrumentEnum() {
        return instrumentEnum;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public Collection<Piece> getPieces() {
        return pieces;
    }

    public Collection<InstrumentNumber> getInstrumentNumbers() {
        return instrumentNumbers;
    }
}
