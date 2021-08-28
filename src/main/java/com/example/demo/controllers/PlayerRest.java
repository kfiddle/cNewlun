package com.example.demo.controllers;


import com.example.demo.models.PerformanceId;
import com.example.demo.models.Player;
import com.example.demo.repositories.PerformanceIdRepository;
import com.example.demo.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Collection;

@CrossOrigin
@RestController
public class PlayerRest {

    @Resource
    PlayerRepository playerRepo;

    @Resource
    PerformanceIdRepository performanceIdRepo;


    @RequestMapping("get-all-players")
    public Collection<Player> getAllPlayers() {
        return (Collection<Player>) playerRepo.findAll();
    }

    @PostMapping("/delete-player")
    public Collection<Player> deleteGameFromDatabase(@RequestBody Player playerToDelete) throws IOException {

        if (playerRepo.existsById(playerToDelete.getId())) {
            playerRepo.deleteById(playerToDelete.getId());
        }
        return (Collection<Player>) playerRepo.findAll();
    }




}
