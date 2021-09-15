package com.example.demo.controllers;


import com.example.demo.models.Instrument;
import com.example.demo.models.Player;
import com.example.demo.repositories.InstrumentRepository;
import com.example.demo.repositories.PerformanceIdRepository;
import com.example.demo.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

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
    PerformanceIdRepository performanceIdRepo;


    @RequestMapping("/get-all-players")
    public Collection<Player> getAllPlayers() {
        return (Collection<Player>) playerRepo.findAll();
    }

    @RequestMapping("/get-all-contracted-players")
    public Collection<Player> getAllContractedPlayers() {
        return playerRepo.findByType(CONTRACT);
    }

    @RequestMapping("/get-all-sub-players")
    public Collection<Player> getAllSubPlayers() {
        return playerRepo.findByType(SUB);
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
                if (playerRepo.existsByFirstNameArea(incomingPlayer.getFirstNameArea()) && playerRepo.existsByLastName(incomingPlayer.getLastName())) {
                    return (Collection<Player>) playerRepo.findAll();
                } else {
                    Player playerToAdd = new Player(incomingPlayer.getFirstNameArea(), incomingPlayer.getLastName());

                    if (incomingPlayer.getInstruments().size() > 0) {
                        Collection<Instrument> instrumentsToAdd = new ArrayList<>();

                        for (Instrument instrument : incomingPlayer.getInstruments()) {
                            if (instrumentRepo.findById(instrument.getId()).isPresent()) {
                                instrumentsToAdd.add(instrument);
                            }
                        }
                        playerToAdd.setInstruments(instrumentsToAdd);
                    }

                    if (incomingPlayer.getEmail() != null) {
                        playerToAdd.setEmail(incomingPlayer.getEmail());
                    }

                    if (incomingPlayer.getHomePhone() != null) {
                        playerToAdd.setHomePhone(incomingPlayer.getHomePhone());
                    }

                    if (incomingPlayer.getCellPhone() != null) {
                        playerToAdd.setCellPhone(incomingPlayer.getCellPhone());
                    }

                    if (incomingPlayer.getAddressLine1() != null) {
                        playerToAdd.setAddressLine1(incomingPlayer.getAddressLine1());
                    }

                    if (incomingPlayer.getAddressLine2() != null) {
                        playerToAdd.setAddressLine2(incomingPlayer.getAddressLine2());
                    }

                    if (incomingPlayer.getCity() != null) {
                        playerToAdd.setCity(incomingPlayer.getCity());
                    }

                    if (incomingPlayer.getState() != null) {
                        playerToAdd.setState(incomingPlayer.getState());
                    }

                    if (incomingPlayer.getZip() != null) {
                        playerToAdd.setZip(incomingPlayer.getZip());
                    }

                    if (incomingPlayer.getUnions() != null) {
                        playerToAdd.setUnions(incomingPlayer.getUnions());
                    }

                    if (incomingPlayer.getType() != null) {
                        playerToAdd.setType(incomingPlayer.getType());
                    }

                    playerRepo.save(playerToAdd);
                }
            } else if (playerRepo.findById(incomingPlayer.getId()).isPresent()) {
                Player playerToEdit = playerRepo.findById(incomingPlayer.getId()).get();

                if (incomingPlayer.getFirstNameArea() != null) {
                    playerToEdit.setFirstNameArea(incomingPlayer.getFirstNameArea());
                }

                if (incomingPlayer.getLastName() != null) {
                    playerToEdit.setLastName(incomingPlayer.getLastName());
                }

                if (incomingPlayer.getEmail() != null) {
                    playerToEdit.setEmail(incomingPlayer.getEmail());
                }

                if (incomingPlayer.getHomePhone() != null) {
                    playerToEdit.setHomePhone(incomingPlayer.getHomePhone());
                }

                if (incomingPlayer.getCellPhone() != null) {
                    playerToEdit.setCellPhone(incomingPlayer.getCellPhone());
                }

                if (incomingPlayer.getAddressLine1() != null) {
                    playerToEdit.setAddressLine1(incomingPlayer.getAddressLine1());
                }

                if (incomingPlayer.getAddressLine2() != null) {
                    playerToEdit.setAddressLine2(incomingPlayer.getAddressLine2());
                }

                if (incomingPlayer.getCity() != null) {
                    playerToEdit.setCity(incomingPlayer.getCity());
                }

                if (incomingPlayer.getState() != null) {
                    playerToEdit.setState(incomingPlayer.getState());
                }

                if (incomingPlayer.getZip() != null) {
                    playerToEdit.setZip(incomingPlayer.getZip());
                }

                if (incomingPlayer.getUnions() != null) {
                    playerToEdit.setUnions(incomingPlayer.getUnions());
                }

                if (incomingPlayer.getType() != null) {
                    playerToEdit.setType(incomingPlayer.getType());
                }

                playerRepo.save(playerToEdit);

            }
        } catch (
                Exception error) {
            error.printStackTrace();
        }
        return (Collection<Player>) playerRepo.findAll();
    }

}

//        }
//
//
//        if (playerRepo.existsByFirstNameArea(incomingPlayer.getFirstNameArea()) && playerRepo.existsByLastName(incomingPlayer.getLastName())) {
//            return (Collection<Player>) playerRepo.findAll();
//        } else if (incomingPlayer.getId() == null) {
//            Player playerToAdd = new Player(incomingPlayer.getFirstNameArea(), incomingPlayer.getLastName());
//
//            if (incomingPlayer.getInstruments().size() > 0) {
//                Collection<Instrument> instrumentsToAdd = new ArrayList<>();
//
//                for (Instrument instrument : incomingPlayer.getInstruments()) {
//                    if (instrumentRepo.findById(instrument.getId()).isPresent()) {
//                        instrumentsToAdd.add(instrument);
//                    }
//                }
//                playerToAdd.setInstruments(instrumentsToAdd);
//            }
//
//            if (incomingPlayer.getEmail() != null) {
//                playerToAdd.setEmail(incomingPlayer.getEmail());
//            }
//
//            if (incomingPlayer.getHomePhone() != null) {
//                playerToAdd.setHomePhone(incomingPlayer.getHomePhone());
//            }
//
//            if (incomingPlayer.getCellPhone() != null) {
//                playerToAdd.setCellPhone(incomingPlayer.getCellPhone());
//            }
//
//            if (incomingPlayer.getAddressLine1() != null) {
//                playerToAdd.setAddressLine1(incomingPlayer.getAddressLine1());
//            }
//
//            if (incomingPlayer.getAddressLine2() != null) {
//                playerToAdd.setAddressLine2(incomingPlayer.getAddressLine2());
//            }
//
//            if (incomingPlayer.getCity() != null) {
//                playerToAdd.setCity(incomingPlayer.getCity());
//            }
//
//            if (incomingPlayer.getState() != null) {
//                playerToAdd.setState(incomingPlayer.getState());
//            }
//
//            if (incomingPlayer.getZip() != null) {
//                playerToAdd.setZip(incomingPlayer.getZip());
//            }
//
//            if (incomingPlayer.getUnions() != null) {
//                playerToAdd.setUnions(incomingPlayer.getUnions());
//            }
//
//            if (incomingPlayer.getType() != null) {
//                playerToAdd.setType(incomingPlayer.getType());
//            }
//
//            playerRepo.save(playerToAdd);
//        } else if (playerRepo.findById(incomingPlayer.getId()).isPresent()) {
//            Player playerToEdit = playerRepo.findById(incomingPlayer.getId()).get();
//
//            if (incomingPlayer.getFirstNameArea() != null) {
//                playerToEdit.setFirstNameArea(incomingPlayer.getFirstNameArea());
//            }
//
//            if (incomingPlayer.getLastName() != null) {
//                playerToEdit.setLastName(incomingPlayer.getLastName());
//            }
//
//            if (incomingPlayer.getEmail() != null) {
//                playerToEdit.setEmail(incomingPlayer.getEmail());
//            }
//
//            if (incomingPlayer.getHomePhone() != null) {
//                playerToEdit.setHomePhone(incomingPlayer.getHomePhone());
//            }
//
//            if (incomingPlayer.getCellPhone() != null) {
//                playerToEdit.setCellPhone(incomingPlayer.getCellPhone());
//            }
//
//            if (incomingPlayer.getAddressLine1() != null) {
//                playerToEdit.setAddressLine1(incomingPlayer.getAddressLine1());
//            }
//
//            if (incomingPlayer.getAddressLine2() != null) {
//                playerToEdit.setAddressLine2(incomingPlayer.getAddressLine2());
//            }
//
//            if (incomingPlayer.getCity() != null) {
//                playerToEdit.setCity(incomingPlayer.getCity());
//            }
//
//            if (incomingPlayer.getState() != null) {
//                playerToEdit.setState(incomingPlayer.getState());
//            }
//
//            if (incomingPlayer.getZip() != null) {
//                playerToEdit.setZip(incomingPlayer.getZip());
//            }
//
//            if (incomingPlayer.getUnions() != null) {
//                playerToEdit.setUnions(incomingPlayer.getUnions());
//            }
//
//            if (incomingPlayer.getType() != null) {
//                playerToEdit.setType(incomingPlayer.getType());
//            }
//
//            playerRepo.save(playerToEdit);
//
//        }
//    } catch(
//    Exception error)
//
//    {
//        error.printStackTrace();
//    }
//        return(Collection<Player>)playerRepo.findAll();
//}
//

//}
