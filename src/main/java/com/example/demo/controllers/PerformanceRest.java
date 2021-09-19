package com.example.demo.controllers;

import com.example.demo.models.Performance;
import com.example.demo.models.Piece;
import com.example.demo.models.Player;
import com.example.demo.repositories.PerformanceRepository;
import com.example.demo.repositories.PieceRepository;
import com.example.demo.repositories.PlayerRepository;
import org.springframework.data.domain.Sort;
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
public class PerformanceRest {

    @Resource
    PerformanceRepository performanceRepo;

    @Resource
    PieceRepository pieceRepo;

    @Resource
    PlayerRepository playerRepo;

    @RequestMapping("/get-all-performances")
    public Collection<Performance> getAllPerformances() {
        return performanceRepo.findAll(Sort.by("date"));
    }

    @PostMapping("/delete-performance")
    public Collection<Performance> deletePerformanceFromDatabase(@RequestBody Performance performanceToDelete) throws IOException {

        if (performanceRepo.existsById(performanceToDelete.getId())) {
            performanceRepo.deleteById(performanceToDelete.getId());
        }
        return (Collection<Performance>) performanceRepo.findAll();
    }

    @PostMapping("/add-performance")
    public Collection<Performance> addPerformanceToDatabase(@RequestBody Performance performanceToAdd) throws IOException {

        try {

            if (!performanceRepo.existsByTitle(performanceToAdd.getTitle()) && !performanceRepo.existsByDate(performanceToAdd.getDate())) {
                Performance newPerformance = new Performance(performanceToAdd.getTitle());

                if (performanceToAdd.getDate() != null) {
                    newPerformance.setDate(performanceToAdd.getDate());
                }

                performanceRepo.save(newPerformance);
            }

        } catch (
                Exception error) {
            error.printStackTrace();

        }
        return (Collection<Performance>) performanceRepo.findAll();
    }

    @PostMapping("/get-pieces-from-performance")
    public Collection<Piece> getPiecesInAPerformance(@RequestBody Performance incomingPerformance) throws IOException {
        Collection<Piece> piecesToReturn = new ArrayList<>();

        try {
            Performance foundPerformance = performanceRepo.findById(incomingPerformance.getId()).get();
            piecesToReturn.addAll(foundPerformance.getPieces());

        } catch (
                Exception error) {
            error.printStackTrace();
        }
        return piecesToReturn;
    }
}
