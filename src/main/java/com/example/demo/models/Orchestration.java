package com.example.demo.models;


import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Collection;
import java.util.Map;

@Entity
public class Orchestration {

    @Id
    @GeneratedValue
    private Long id;

    private int firstViolins;
    private int secondViolins;
    private int violas;
    private int cellos;
    private int basses;

    private int flutes;
    private int oboes;
    private int clarinets;
    private int ebClarinets;
    private int bassoons;

    private int horns;
    private int trumpets;
    private int trombones;

    private int tubas;
    private int timpanis;
    private int percussions;

    private int pianos;
    private int harps;

    @OneToOne
    private Piece piece;

    public Orchestration() {
    }

    public Orchestration(Piece piece) {
        this.piece = piece;
    }

    public void setFirstViolins(int firstViolins) {
        this.firstViolins = firstViolins;
    }

    public void setSecondViolins(int secondViolins) {
        this.secondViolins = secondViolins;
    }

    public void setViolas(int violas) {
        this.violas = violas;
    }

    public void setCellos(int cellos) {
        this.cellos = cellos;
    }

    public void setBasses(int basses) {
        this.basses = basses;
    }

    public void setFlutes(int flutes) {
        this.flutes = flutes;
    }

    public void setOboes(int oboes) {
        this.oboes = oboes;
    }

    public void setClarinets(int clarinets) {
        this.clarinets = clarinets;
    }

    public void setEbClarinets(int ebClarinets) {
        this.ebClarinets = ebClarinets;
    }

    public void setBassoons(int bassoons) {
        this.bassoons = bassoons;
    }

    public void setHorns(int horns) {
        this.horns = horns;
    }

    public void setTrumpets(int trumpets) {
        this.trumpets = trumpets;
    }

    public void setTrombones(int trombones) {
        this.trombones = trombones;
    }

    public void setTubas(int tubas) {
        this.tubas = tubas;
    }

    public void setTimpanis(int timpanis) {
        this.timpanis = timpanis;
    }

    public void setPercussions(int percussions) {
        this.percussions = percussions;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public void setHarps(int harps) {
        this.harps = harps;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Long getId() {
        return id;
    }

    public int getFirstViolins() {
        return firstViolins;
    }

    public int getSecondViolins() {
        return secondViolins;
    }

    public int getViolas() {
        return violas;
    }

    public int getCellos() {
        return cellos;
    }

    public int getBasses() {
        return basses;
    }

    public int getFlutes() {
        return flutes;
    }

    public int getOboes() {
        return oboes;
    }

    public int getClarinets() {
        return clarinets;
    }

    public int getEbClarinets() {
        return ebClarinets;
    }

    public int getBassoons() {
        return bassoons;
    }

    public int getHorns() {
        return horns;
    }

    public int getTrumpets() {
        return trumpets;
    }

    public int getTrombones() {
        return trombones;
    }

    public int getTubas() {
        return tubas;
    }

    public int getTimpanis() {
        return timpanis;
    }

    public int getPercussions() {
        return percussions;
    }

    public int getPianos() {
        return pianos;
    }

    public int getHarps() {
        return harps;
    }

    public Piece getPiece() {
        return piece;
    }
}
