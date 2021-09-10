package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Instrument {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "instrument")
    private Collection<Player> players;

    @ManyToMany
    private Collection<Piece> pieces;

    public Instrument() {
    }

    public Instrument(String name) {
        this.name = name;
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
