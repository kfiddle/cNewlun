package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Instrument {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToMany()
    private Collection<Player> players;

    @ManyToMany
    private Collection<Piece> pieces;

    public Instrument() {
    }

    public Instrument(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public Collection<Piece> getPieces() {
        return pieces;
    }
}
