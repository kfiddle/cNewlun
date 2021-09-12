package com.example.demo.controllers;


import com.example.demo.models.Instrument;
import com.example.demo.repositories.InstrumentRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Collection;

@CrossOrigin
@RestController
public class InstrumentRest {

    @Resource
    InstrumentRepository instrumentRepo;


    @RequestMapping("/get-all-instruments")
    public Collection<Instrument> getAllInstruments() {
        return (Collection<Instrument>) instrumentRepo.findAll();
    }

    @PostMapping("/add-instrument")
    public Collection<Instrument> AddInstrumentToDatabase(@RequestBody Instrument instrumentToAdd) throws IOException {

        System.out.println(instrumentToAdd.getName());
        if (!instrumentRepo.existsByName(instrumentToAdd.getName().toLowerCase())) {
            Instrument newInstrument = new Instrument(instrumentToAdd.getName());
            instrumentRepo.save(newInstrument);
        }

        return (Collection<Instrument>) instrumentRepo.findAll();
    }


}
