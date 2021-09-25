package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Performance implements Comparable<Performance> {

    @Id
    @GeneratedValue
    private Long id;


    private String title;
    private LocalDate date;
    private int numberOfServices;

    @OneToMany()
    private Collection<Piece> pieces;

    @OneToMany
    private Collection<AvailablePerformance> availablePerformances;


    public Performance() {
    }

    public Performance(String title) {
        this.title = title;
    }

    public Performance(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }

    public Performance(String title, LocalDate date, int numberOfServices) {
        this.title = title;
        this.date = date;
        this.numberOfServices = numberOfServices;
    }

    public void setPieces(Collection<Piece> pieces) {
        this.pieces = pieces;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setNumberOfServices(int numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Collection<Piece> getPieces() {
        return pieces;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumberOfServices() {
        return numberOfServices;
    }

    @Override
    public int compareTo(Performance otherPerformance) {
        return date.compareTo(otherPerformance.getDate());
    }


}
