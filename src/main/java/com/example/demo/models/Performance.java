package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Performance {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(mappedBy = "performance")
    private Collection<Piece> pieces;

    public Performance() {
    }

    public Performance(String title) {
        this.title = title;
    }

    public void setPieces(Collection<Piece> pieces) {
        this.pieces = pieces;
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


}
