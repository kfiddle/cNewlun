package com.example.demo;

import com.example.demo.enums.Type;
import com.example.demo.models.Instrument;
import com.example.demo.models.Player;
import com.example.demo.repositories.InstrumentRepository;
import com.example.demo.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.parameters.P;

import javax.annotation.Resource;

public class Populator implements CommandLineRunner {

    @Resource
    PlayerRepository playerRepo;

    @Resource
    InstrumentRepository instrumentRepo;


    @Override
    public void run(String... args) throws Exception {

        Instrument flute = new Instrument("Flute");
        Instrument oboe = new Instrument("Oboe");
        Instrument clarinet = new Instrument("Clarinet");
        Instrument eBClarinet = new Instrument("Eb Clarinet");
        Instrument bassoon = new Instrument("Bassoon");
        Instrument horn = new Instrument("Horn");
        Instrument trumpet = new Instrument("Trumpet");
        Instrument trombone = new Instrument("Trombone");
        Instrument tuba = new Instrument("Tuba");
        Instrument timpani = new Instrument("Timpani");
        Instrument percussion = new Instrument("Percussion");
        Instrument piano = new Instrument("Piano");
        Instrument violin = new Instrument("Violin");
        Instrument viola = new Instrument("Viola");
        Instrument cello = new Instrument("cello");
        Instrument bass = new Instrument("Bass");
        Instrument harp = new Instrument("Harp");

        instrumentRepo.save(flute);
        instrumentRepo.save(oboe);
        instrumentRepo.save(clarinet);
        instrumentRepo.save(bassoon);
        instrumentRepo.save(horn);
        instrumentRepo.save(trumpet);
        instrumentRepo.save(trombone);
        instrumentRepo.save(tuba);
        instrumentRepo.save(timpani);
        instrumentRepo.save(percussion);
        instrumentRepo.save(piano);
        instrumentRepo.save(violin);
        instrumentRepo.save(viola);
        instrumentRepo.save(cello);
        instrumentRepo.save(bass);
        instrumentRepo.save(harp);

        Player leAnne = new Player("Leanne", "Wistrom", flute, Type.CONTRACT);
        Player seanG = new Player("Sean", "Gabriel", flute, Type.CONTRACT);
        Player sarahH = new Player("Sarah", "Hamilton", eBClarinet, Type.CONTRACT);
        Player danna = new Player("Danna", "Sundet", oboe, Type.CONTRACT);
        Player heatherS = new Player("Heather", "Storey", oboe, Type.CONTRACT);
        Player ami = new Player("Amitai", "Vardi", clarinet, Type.CONTRACT);
        Player liesl = new Player("Liesl", "Hook", violin, Type.SUB);
        Player jenJ = new Player("Jennifer", "Jansen", violin, Type.CONTRACT);
        Player jeffS = new Player("Jeff", "Singler", cello, Type.CONTRACT);
        Player jiYoung = new Player("Ji Young", "Nam", viola, Type.CONTRACT);

        playerRepo.save(leAnne);
        playerRepo.save(seanG);
        playerRepo.save(sarahH);
        playerRepo.save(danna);
        playerRepo.save(heatherS);
        playerRepo.save(ami);
        playerRepo.save(liesl);
        playerRepo.save(jenJ);
        playerRepo.save(jeffS);
        playerRepo.save(jiYoung);


    }
}
