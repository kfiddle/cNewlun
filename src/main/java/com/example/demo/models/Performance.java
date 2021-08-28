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
    private String order;

    @OneToMany(mappedBy = "performance")
    private Collection<Piece> pieces;





}
