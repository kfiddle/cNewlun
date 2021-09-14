package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PSA {

    @Id
    @GeneratedValue
    private Long id;



    public PSA() {}

}
