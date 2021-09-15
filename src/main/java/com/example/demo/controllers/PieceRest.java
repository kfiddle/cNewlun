package com.example.demo.controllers;


import com.example.demo.models.Performance;
import com.example.demo.models.Piece;
import com.example.demo.repositories.PerformanceRepository;
import com.example.demo.repositories.PieceRepository;
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
            Piece newPiece = new Piece(pieceToAdd.getTitle(), pieceToAdd.getComposer());
            pieceRepo.save(newPiece);
        }
        return (Collection<Piece>) pieceRepo.findAll();

    }


}
