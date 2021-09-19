package com.example.demo.controllers;


import com.example.demo.enums.InstrumentEnum;
import com.example.demo.models.AvailablePerformance;
import com.example.demo.models.Instrument;
import com.example.demo.models.Player;
import com.example.demo.repositories.*;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.example.demo.enums.Type.CONTRACT;
import static com.example.demo.enums.Type.SUB;

@CrossOrigin
@RestController
public class PlayerRest {

    @Resource
    PlayerRepository playerRepo;

    @Resource
    InstrumentRepository instrumentRepo;

    @Resource
    PerformanceRepository performanceRepo;

    @Resource
    PerformanceIdRepository performanceIdRepo;

    @Resource
    AvailablePerformanceRepository availablePerformanceRepo;


    @RequestMapping("/get-all-players")
    public Collection<Player> getAllPlayers() {
        return (Collection<Player>) playerRepo.findAll();
    }

    @RequestMapping("/get-all-contracted-players")
    public Collection<Player> getAllContractedPlayers() {
        return playerRepo.findByType(CONTRACT, Sort.by("subRanking", "lastName"));
    }

    @RequestMapping("/get-all-sub-players")
    public Collection<Player> getAllSubPlayers() {
        return playerRepo.findByType(SUB, Sort.by("subRanking", "lastName"));
    }

    @RequestMapping("/contracts/{instrument}")
    public Collection<Player> getContractsOfSpecifiedInstrument(@PathVariable InstrumentEnum instrument) {
        return playerRepo.findByTypeAndInstrumentEnum(CONTRACT, instrument, Sort.by("lastName"));
    }


    @RequestMapping("/subs/{instrument}")
    public Collection<Player> getSubsOfSpecifiedInstrument(@PathVariable InstrumentEnum instrument) {
        return playerRepo.findByTypeAndInstrumentEnum(SUB, instrument, Sort.by("subRanking", "lastName"));
    }


    @PostMapping("/delete-player")
    public Collection<Player> deletePlayerFromDatabase(@RequestBody Player playerToDelete) throws IOException {

        if (playerRepo.existsById(playerToDelete.getId())) {
            playerRepo.deleteById(playerToDelete.getId());
        }
        return (Collection<Player>) playerRepo.findAll();
    }

    @PostMapping("/add-player")
    public Collection<Player> addPlayerToDatabase(@RequestBody Player incomingPlayer) throws IOException {

        try {

            if (incomingPlayer.getId() == null) {
                if (playerRepo.existsByFirstNameAreaAndLastName(incomingPlayer.getFirstNameArea(), incomingPlayer.getLastName())) {
                    return (Collection<Player>) playerRepo.findAll();
                } else {
                    Player playerToAdd = new Player(incomingPlayer.getFirstNameArea(), incomingPlayer.getLastName());
                    playerToAdd.setAllProps(incomingPlayer);
                    playerRepo.save(playerToAdd);
                    System.out.println(playerToAdd.getFirstNameArea() + "   " + playerToAdd.getLastName() + "  " + playerToAdd.getInstrumentEnum());
                }
            } else if (playerRepo.findById(incomingPlayer.getId()).isPresent()) {
                Player playerToEdit = playerRepo.findById(incomingPlayer.getId()).get();
                playerToEdit.setAllProps(incomingPlayer);
                playerRepo.save(playerToEdit);
            }
        } catch (
                Exception error) {
            error.printStackTrace();
        }
        return (Collection<Player>) playerRepo.findAll();
    }

    @PostMapping("/set-psa")
    public void setAvailablePerformancesForPlayer(@RequestBody Player incomingPlayer) {
        List<AvailablePerformance> availablePerformances = new ArrayList<>();

        for (AvailablePerformance availablePerformance : incomingPlayer.getAvailablePerformances()) {
            if (performanceRepo.findById(availablePerformance.getPerformanceId()).isPresent()) {
                AvailablePerformance newAP = new AvailablePerformance(availablePerformance.getPerformanceId(), availablePerformance.isAccepted());
                availablePerformanceRepo.save(newAP);
                availablePerformances.add(newAP);
            }
        }

        if (playerRepo.findById(incomingPlayer.getId()).isPresent()) {
            Player playerToSetPsa = playerRepo.findById(incomingPlayer.getId()).get();
            playerToSetPsa.setAvailablePerformances(availablePerformances);
        }
    }


}
