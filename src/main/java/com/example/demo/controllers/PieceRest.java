package com.example.demo.controllers;


import com.example.demo.models.*;
import com.example.demo.repositories.*;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
public class PieceRest {

    @Resource
    PieceRepository pieceRepo;

    @Resource
    InstrumentRepository instrumentRepo;

    @Resource
    InstrumentNumberRepository instrumentNumberRepo;

    @Resource
    RosterRepository rosterRepo;

    @Resource
    PerformanceRepository performanceRepo;

    @RequestMapping("/get-all-pieces")
    public Collection<Piece> getAllPieces() {
        List<Piece> piecesToSend = new ArrayList<>();
        for (Piece piece : pieceRepo.findAll()) {
            piecesToSend.add(piece);
        }
        Collections.sort(piecesToSend);
        return piecesToSend;
    }

    @PostMapping("/delete-piece")
    public Collection<Piece> deletePieceFromDatabase(@RequestBody Piece pieceToDelete) throws IOException {

        if (pieceRepo.existsById(pieceToDelete.getId())) {
            pieceRepo.deleteById(pieceToDelete.getId());
        }
        return (Collection<Piece>) pieceRepo.findAll();
    }

    @PostMapping("/add-piece")
    public Collection<Piece> addPieceToDatabase(@RequestBody Piece pieceToAdd) throws IOException {

        if (!pieceRepo.existsByTitle(pieceToAdd.getTitle()) && !pieceRepo.existsByComposer(pieceToAdd.getComposer())) {
//            Collection<InstrumentNumber> instrumentNumbersToAdd = new ArrayList<>();
//
//            for (Instrument instrument : instrumentRepo.findAll()) {
//                InstrumentNumber numberToAdd = new InstrumentNumber(instrument);
//                instrumentNumberRepo.save(numberToAdd);
//                instrumentNumbersToAdd.add(numberToAdd);
//            }

//            Piece newPiece = new Piece(pieceToAdd.getTitle(), pieceToAdd.getComposer(), instrumentNumbersToAdd);
            Roster rosterToAdd = new Roster();
            rosterRepo.save(rosterToAdd);

            Piece newPiece = new Piece(pieceToAdd.getTitle(), pieceToAdd.getComposer());
            newPiece.setRoster(rosterToAdd);

            pieceRepo.save(newPiece);
            System.out.println(newPiece.getComposer() + "    " + newPiece.getTitle() + "   " + newPiece.getRoster());
        }
        return (Collection<Piece>) pieceRepo.findAll();
    }

    @PostMapping("/get-instrument-numbers-from-piece")
    public Collection<InstrumentNumber> getAllInstrumentNumbersOfPiece(@RequestBody Piece incomingPiece) {
        Collection<InstrumentNumber> instrumentNumbersToReturn = new ArrayList<>();

        try {
            if (pieceRepo.findById(incomingPiece.getId()).isPresent()) {
                Piece pieceToSearch = pieceRepo.findById(incomingPiece.getId()).get();
                instrumentNumbersToReturn.addAll(pieceToSearch.getInstrumentNumbers());
            }

        } catch (
                Exception error) {
            error.printStackTrace();

        }
        return instrumentNumbersToReturn;
    }

    @PostMapping("/get-roster-from-piece")
    public Roster getRosterFromPiece(@RequestBody Piece incomingPiece) {

        Roster rosterToReturn = new Roster();
        if (pieceRepo.findById(incomingPiece.getId()).isPresent()) {
            Piece pieceToSearch = pieceRepo.findById(incomingPiece.getId()).get();
            rosterToReturn = pieceToSearch.getRoster();
        }
        return rosterToReturn;
    }

    @PostMapping("/set-roster")
    public void setRosterToPiece(@RequestBody Roster incomingRoster) {
        try {

            if (pieceRepo.findById(incomingRoster.getPiece().getId()).isPresent()) {
                Piece pieceToGetRoster = pieceRepo.findById(incomingRoster.getPiece().getId()).get();
                Roster rosterToAdd = new Roster();
                rosterRepo.save(rosterToAdd);
                rosterToAdd.setAllProps(incomingRoster);
                pieceToGetRoster.setRoster(rosterToAdd);
                pieceRepo.save(pieceToGetRoster);
            }
        } catch (
                Exception error) {
            error.printStackTrace();

        }

    }


}
