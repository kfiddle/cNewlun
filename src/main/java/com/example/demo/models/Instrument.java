package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Instrument {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany
    private Collection<Player> players;

    @ManyToMany
    private Collection<Piece> pieces;

    public Instrument() {
    }



}
