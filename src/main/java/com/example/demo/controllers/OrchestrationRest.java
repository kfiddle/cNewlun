package com.example.demo.controllers;


import com.example.demo.models.Orchestration;
import com.example.demo.models.Performance;
import com.example.demo.models.Piece;
import com.example.demo.models.Player;
import com.example.demo.repositories.OrchestrationRepository;
import com.example.demo.repositories.PieceRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Collection;

@CrossOrigin
@RestController
public class OrchestrationRest {

    @Resource
    OrchestrationRepository orchestrationRepo;

    @Resource
    PieceRepository pieceRepo;

    @RequestMapping("/get-all-orchestrations")
    public Collection<Orchestration> getAllOrchestrations() {
        return (Collection<Orchestration>) orchestrationRepo.findAll();
    }

    @PostMapping("/get-orchestration-of-piece")
    public Orchestration getOrchestrationOfPiece(@RequestBody Piece incomingPiece) {
        return orchestrationRepo.findByPiece(incomingPiece);
    }

    @PostMapping("/add-orchestration")
    public Collection<Orchestration> addOrchestrationToDatabase(@RequestBody Orchestration incomingOrchestration) throws IOException {

        try {

            if (incomingOrchestration.getId() == null) {
                Orchestration orchestrationToAddOrEdit = new Orchestration();

                if (pieceRepo.findById(incomingOrchestration.getPiece().getId()).isPresent()) {
                    Piece pieceToGrab = pieceRepo.findById(incomingOrchestration.getPiece().getId()).get();
                    orchestrationToAddOrEdit.setPiece(pieceToGrab);
                }
                orchestrationToAddOrEdit.setAllProps(incomingOrchestration);
                orchestrationRepo.save(orchestrationToAddOrEdit);
            }

        } catch (
                Exception error) {
            error.printStackTrace();

        }

        System.out.println(orchestrationRepo.findAll());
        return (Collection<Orchestration>) orchestrationRepo.findAll();

    }
}
