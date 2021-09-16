package com.example.demo.models;


import com.example.demo.enums.InstrumentEnum;
import com.example.demo.enums.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Collection<Instrument> instruments;

    private InstrumentEnum instrumentEnum;
    private Type type;

    private String firstNameArea;
    private String lastName;

    private String email;
    private String homePhone;
    private String cellPhone;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zip;

    private String unions;
    private int subRanking;


    @ManyToMany
    private Collection<Piece> pieces;

    @ManyToMany
    private Collection<PerformanceId> performanceIds;

    public Player() {
    }

    public Player(String firstNameArea, String lastName) {
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
    }

    public Player(String firstNameArea, String lastName, String email) {
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.email = email;
    }

    public Player(String firstNameArea, String lastName, Collection<Instrument> instruments) {
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.instruments = instruments;
    }

    public Player(String firstNameArea, String lastName, Collection<Instrument> instruments, Type type) {
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.instruments = instruments;
        this.type = type;
    }

    public Player(String firstNameArea, String lastName, String email, String cellPhone) {
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public Player(String firstNameArea, String lastName, String email, String homePhone, String cellPhone, String addressLine1, String addressLine2, String city, String state, String zip) {
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.email = email;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Player(InstrumentEnum instrumentEnum, Type type, String firstNameArea, String lastName, String email, String homePhone, String cellPhone, String addressLine1, String addressLine2, String city, String state, String zip) {
        this.instrumentEnum = instrumentEnum;
        this.type = type;
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.email = email;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Player(Collection<Instrument> instruments, Type type, String firstNameArea, String lastName, String email, String homePhone, String cellPhone, String addressLine1, String addressLine2, String city, String state, String zip, Collection<Piece> pieces, Collection<PerformanceId> performanceIds) {
        this.instruments = instruments;
        this.type = type;
        this.firstNameArea = firstNameArea;
        this.lastName = lastName;
        this.email = email;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.pieces = pieces;
        this.performanceIds = performanceIds;
    }

    public void setFirstNameArea(String firstNameArea) {
        this.firstNameArea = firstNameArea;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setInstrumentEnum(InstrumentEnum instrumentEnum) {
        this.instrumentEnum = instrumentEnum;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setUnions(String unions) {
        this.unions = unions;
    }

    public void setPieces(Collection<Piece> pieces) {
        this.pieces = pieces;
    }

    public void setPerformanceIds(Collection<PerformanceId> performanceIds) {
        this.performanceIds = performanceIds;
    }

    public void setSubRanking(int subRanking) {
        this.subRanking = subRanking;
    }

    public Long getId() {
        return id;
    }

    public String getFirstNameArea() {
        return firstNameArea;
    }

    public String getLastName() {
        return lastName;
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public InstrumentEnum getInstrumentEnum() {
        return instrumentEnum;
    }

    public Type getType() {
        return type;
    }


    public String getEmail() {
        return email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }


    public String getUnions() {
        return unions;
    }

    public int getSubRanking() {
        return subRanking;
    }

    public Collection<Piece> getPieces() {
        return pieces;
    }

    public Collection<PerformanceId> getPerformanceIds() {
        return performanceIds;
    }


}
