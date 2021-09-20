package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Roster {

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

    @ManyToMany
    private Collection<Player> players;

    public Roster() {
    }

    public Roster(Piece piece) {
        this.piece = piece;
    }

    public Roster(int firstViolins, int secondViolins, int violas, int cellos, int basses, int flutes, int oboes, int clarinets, int ebClarinets, int bassoons, int horns, int trumpets, int trombones, int tubas, int timpanis, int percussions, int pianos, int harps) {
        this.firstViolins = firstViolins;
        this.secondViolins = secondViolins;
        this.violas = violas;
        this.cellos = cellos;
        this.basses = basses;
        this.flutes = flutes;
        this.oboes = oboes;
        this.clarinets = clarinets;
        this.ebClarinets = ebClarinets;
        this.bassoons = bassoons;
        this.horns = horns;
        this.trumpets = trumpets;
        this.trombones = trombones;
        this.tubas = tubas;
        this.timpanis = timpanis;
        this.percussions = percussions;
        this.pianos = pianos;
        this.harps = harps;
    }

    public Roster(int firstViolins, int secondViolins, int violas, int cellos, int basses, int flutes, int oboes, int clarinets, int ebClarinets, int bassoons, int horns, int trumpets, int trombones, int tubas, int timpanis, int percussions, int pianos, int harps, Piece piece) {
        this.piece = piece;
        this.firstViolins = firstViolins;
        this.secondViolins = secondViolins;
        this.violas = violas;
        this.cellos = cellos;
        this.basses = basses;
        this.flutes = flutes;
        this.oboes = oboes;
        this.clarinets = clarinets;
        this.ebClarinets = ebClarinets;
        this.bassoons = bassoons;
        this.horns = horns;
        this.trumpets = trumpets;
        this.trombones = trombones;
        this.tubas = tubas;
        this.timpanis = timpanis;
        this.percussions = percussions;
        this.pianos = pianos;
        this.harps = harps;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
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


    public Collection<Player> getPlayers() {
        return players;
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

    public void setAllProps(Roster otherRoster) {

        if (otherRoster.getFirstViolins() > 0) {
            firstViolins = otherRoster.getFirstViolins();
        }
        if (otherRoster.getSecondViolins() > 0) {
            secondViolins = otherRoster.getSecondViolins();
        }
        if (otherRoster.getViolas() > 0) {
            violas = otherRoster.getViolas();
        }
        if (otherRoster.getCellos() > 0) {
            cellos = otherRoster.getCellos();
        }
        if (otherRoster.getBasses() > 0) {
            basses = otherRoster.getBasses();
        }
        if (otherRoster.getFlutes() > 0) {
            flutes = otherRoster.getFlutes();
        }
        if (otherRoster.getOboes() > 0) {
            oboes = otherRoster.getOboes();
        }
        if (otherRoster.getClarinets() > 0) {
            clarinets = otherRoster.getClarinets();
        }
        if (otherRoster.getEbClarinets() > 0) {
            ebClarinets = otherRoster.getEbClarinets();
        }
        if (otherRoster.getBassoons() > 0) {
            bassoons = otherRoster.getBassoons();
        }
        if (otherRoster.getHorns() > 0) {
            horns = otherRoster.getHorns();
        }
        if (otherRoster.getTrumpets() > 0) {
            trumpets = otherRoster.getTrumpets();
        }
        if (otherRoster.getTrombones() > 0) {
            trombones = otherRoster.getTrombones();
        }
        if (otherRoster.getTubas() > 0) {
            tubas = otherRoster.getTubas();
        }
        if (otherRoster.getHarps() > 0) {
            harps = otherRoster.getHarps();
        }
        if (otherRoster.getTimpanis() > 0) {
            timpanis = otherRoster.getTimpanis();
        }
        if (otherRoster.getPercussions() > 0) {
            percussions = otherRoster.getPercussions();
        }
        if (otherRoster.getPianos() > 0) {
            pianos = otherRoster.getPianos();
        }


    }


}
