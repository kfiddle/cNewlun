package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class Performance implements Comparable<Performance> {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private LocalDate date;

    @OneToMany()
    private Collection<Piece> pieces;

    public Performance() {
    }

    public Performance(String title) {
        this.title = title;
    }

    public Performance(String title, LocalDate date) {
        this.title = title;
        this.date = date;
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

    @Override
    public int compareTo(Performance otherPerformance) {
        return date.compareTo(otherPerformance.getDate());
    }
}
