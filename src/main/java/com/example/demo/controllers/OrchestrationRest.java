package com.example.demo.controllers;


import com.example.demo.models.Orchestration;
import com.example.demo.models.Performance;
import com.example.demo.models.Player;
import com.example.demo.repositories.OrchestrationRepository;
import com.example.demo.repositories.PieceRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/add-orchestration")
    public Collection<Orchestration> addOrchestrationToDatabase(@RequestBody Orchestration incomingOrchestration) throws IOException {

        try {

            if (orchestrationRepo.findById(incomingOrchestration.getId()).isEmpty()) {
                Orchestration orchestrationToAdd = new Orchestration(incomingOrchestration.getPiece());

                if (incomingOrchestration.getFirstViolins() > 0) {
                    orchestrationToAdd.setFirstViolins(incomingOrchestration.getFirstViolins());
                }
                if (incomingOrchestration.getSecondViolins() > 0) {
                    orchestrationToAdd.setSecondViolins(incomingOrchestration.getSecondViolins());
                }
                if (incomingOrchestration.getViolas() > 0) {
                    orchestrationToAdd.setViolas(incomingOrchestration.getViolas());
                }
                if (incomingOrchestration.getCellos() > 0) {
                    orchestrationToAdd.setCellos(incomingOrchestration.getCellos());
                }
                if (incomingOrchestration.getBasses() > 0) {
                    orchestrationToAdd.setBasses(incomingOrchestration.getBasses());
                }
                if (incomingOrchestration.getFlutes() > 0) {
                    orchestrationToAdd.setFlutes(incomingOrchestration.getFlutes());
                }
                if (incomingOrchestration.getOboes() > 0) {
                    orchestrationToAdd.setOboes(incomingOrchestration.getOboes());
                }
                if (incomingOrchestration.getClarinets() > 0) {
                    orchestrationToAdd.setClarinets(incomingOrchestration.getClarinets());
                }
                if (incomingOrchestration.getEbClarinets() > 0) {
                    orchestrationToAdd.setEbClarinets(incomingOrchestration.getEbClarinets());
                }
                if (incomingOrchestration.getBassoons() > 0) {
                    orchestrationToAdd.setBassoons(incomingOrchestration.getBassoons());
                }
                if (incomingOrchestration.getHorns() > 0) {
                    orchestrationToAdd.setHorns(incomingOrchestration.getHorns());
                }
                if (incomingOrchestration.getTrumpets() > 0) {
                    orchestrationToAdd.setTrumpets(incomingOrchestration.getTrumpets());
                }
                if (incomingOrchestration.getTrombones() > 0) {
                    orchestrationToAdd.setTrombones(incomingOrchestration.getTrombones());
                }
                if (incomingOrchestration.getTubas() > 0) {
                    orchestrationToAdd.setTubas(incomingOrchestration.getTubas());
                }
                if (incomingOrchestration.getTimpanis() > 0) {
                    orchestrationToAdd.setTimpanis(incomingOrchestration.getTimpanis());
                }
                if (incomingOrchestration.getPercussions() > 0) {
                    orchestrationToAdd.setPercussions(incomingOrchestration.getPercussions());
                }
                if (incomingOrchestration.getHarps() > 0) {
                    orchestrationToAdd.setHarps(incomingOrchestration.getHarps());
                }
                if (incomingOrchestration.getPianos() > 0) {
                    orchestrationToAdd.setPianos(incomingOrchestration.getPianos());
                }
                orchestrationRepo.save(orchestrationToAdd);
                System.out.println(orchestrationToAdd.getPiece().getTitle() + "   " + orchestrationToAdd.getFirstViolins());
            }

        } catch (
                Exception error) {
            error.printStackTrace();

        }
        return (Collection<Orchestration>) orchestrationRepo.findAll();

    }
}
