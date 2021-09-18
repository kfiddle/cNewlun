package com.example.demo;

import com.example.demo.enums.InstrumentEnum;
import com.example.demo.enums.Type;
import com.example.demo.models.*;
import com.example.demo.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    PlayerRepository playerRepo;

    @Resource
    InstrumentRepository instrumentRepo;

    @Resource
    InstrumentNumberRepository instrumentNumberRepo;

    @Resource
    PieceRepository pieceRepo;

    @Resource
    PerformanceRepository performanceRepo;


    @Override
    public void run(String... args) throws Exception {

        Instrument violin = new Instrument("Violin", InstrumentEnum.VIOLIN);
        Instrument viola = new Instrument("Viola", InstrumentEnum.VIOLA);
        Instrument cello = new Instrument("cello", InstrumentEnum.CELLO);
        Instrument bass = new Instrument("Bass", InstrumentEnum.BASS);
        Instrument flute = new Instrument("Flute", InstrumentEnum.FLUTE);
        Instrument oboe = new Instrument("Oboe", InstrumentEnum.OBOE);
        Instrument clarinet = new Instrument("Clarinet", InstrumentEnum.CLARINET);
        Instrument eBClarinet = new Instrument("Eb Clarinet", InstrumentEnum.EBCLARINET);
        Instrument bassoon = new Instrument("Bassoon", InstrumentEnum.BASSOON);
        Instrument horn = new Instrument("Horn", InstrumentEnum.HORN);
        Instrument trumpet = new Instrument("Trumpet", InstrumentEnum.TRUMPET);
        Instrument trombone = new Instrument("Trombone", InstrumentEnum.TROMBONE);
        Instrument tuba = new Instrument("Tuba", InstrumentEnum.TUBA);
        Instrument timpani = new Instrument("Timpani", InstrumentEnum.TIMPANI);
        Instrument percussion = new Instrument("Percussion", InstrumentEnum.PERCUSSION);
        Instrument piano = new Instrument("Piano", InstrumentEnum.PIANO);
        Instrument harp = new Instrument("Harp", InstrumentEnum.HARP);

        instrumentRepo.save(violin);
        instrumentRepo.save(viola);
        instrumentRepo.save(cello);
        instrumentRepo.save(bass);
        instrumentRepo.save(flute);
        instrumentRepo.save(oboe);
        instrumentRepo.save(clarinet);
        instrumentRepo.save(bassoon);
        instrumentRepo.save(eBClarinet);
        instrumentRepo.save(horn);
        instrumentRepo.save(trumpet);
        instrumentRepo.save(trombone);
        instrumentRepo.save(tuba);
        instrumentRepo.save(timpani);
        instrumentRepo.save(percussion);
        instrumentRepo.save(piano);
        instrumentRepo.save(harp);

        ArrayList<Instrument> violinList = new ArrayList<>();
        violinList.add(violin);

        ArrayList<Instrument> violaList = new ArrayList<>();
        violaList.add(viola);

        ArrayList<Instrument> celloList = new ArrayList<>();
        celloList.add(cello);

        ArrayList<Instrument> clarinetList = new ArrayList<>();
        clarinetList.add(clarinet);

        ArrayList<Instrument> oboeList = new ArrayList<>();
        oboeList.add(oboe);

        ArrayList<Instrument> eBClarinetList = new ArrayList<>();
        eBClarinetList.add(eBClarinet);

        ArrayList<Instrument> fluteList = new ArrayList<>();
        fluteList.add(flute);

        Player leAnne = new Player("Leanne", "Wistrom", fluteList, Type.CONTRACT);
        Player seanG = new Player("Sean", "Gabriel", fluteList, Type.CONTRACT);
        Player sarahH = new Player("Sarah", "Hamilton", eBClarinetList, Type.CONTRACT);
        Player danna = new Player("Danna", "Sundet", oboeList, Type.CONTRACT);
        Player heatherS = new Player("Heather", "Storey", oboeList, Type.CONTRACT);
        Player ami = new Player("Amitai", "Vardi", clarinetList, Type.CONTRACT);
        Player liesl = new Player("Liesl", "Hook", violinList, Type.SUB);
        Player jenJ = new Player("Jennifer", "Jansen", violinList, Type.CONTRACT);
        Player jeffS = new Player("Jeff", "Singler", celloList, Type.CONTRACT);
        Player jiYoung = new Player("Ji Young", "Nam", violaList, Type.CONTRACT);

        Player mariaV = new Player("Maria", "Vinas", violinList, Type.SUB);
        Player gingerV = new Player("Ginger", "Winas", violinList, Type.SUB);
        Player beano = new Player("Bean", "Pasta", violinList, Type.SUB);
        Player gracie = new Player("Grace", "Pasta", violinList, Type.SUB);
        Player doodle = new Player("Doodle", "Pasta", violinList, Type.SUB);
        Player nHess = new Player("Nate", "Hess", violinList, Type.SUB);

        playerRepo.save(mariaV);
        playerRepo.save(gingerV);
        playerRepo.save(beano);
        playerRepo.save(gracie);
        playerRepo.save(doodle);
        playerRepo.save(nHess);

        mariaV.setSubRanking(1);
        gingerV.setSubRanking(3);
        beano.setSubRanking(5);
        gracie.setSubRanking(1);
        doodle.setSubRanking(4);
        nHess.setSubRanking(8);

        mariaV.setInstrumentEnum(InstrumentEnum.VIOLIN);
        gingerV.setInstrumentEnum(InstrumentEnum.VIOLIN);
        beano.setInstrumentEnum(InstrumentEnum.VIOLIN);
        liesl.setInstrumentEnum(InstrumentEnum.VIOLIN);
        gracie.setInstrumentEnum(InstrumentEnum.VIOLIN);
        doodle.setInstrumentEnum(InstrumentEnum.HORN);
        liesl.setInstrumentEnum(InstrumentEnum.CLARINET);

        playerRepo.save(mariaV);
        playerRepo.save(gingerV);
        playerRepo.save(beano);
        playerRepo.save(liesl);
        playerRepo.save(gracie);
        playerRepo.save(doodle);
        playerRepo.save(nHess);

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

        Piece stringsPiece = new Piece("Strings Piece");
        Piece windsPiece = new Piece("Winds Only");
        Piece fullGroup = new Piece("Huge Symphony");
        Piece pulcinella = new Piece("Pulcinella");
        Piece beeth6 = new Piece("Beethoven Symphony 6");

        Piece rousePiece = new Piece("Rouse Piece", "Rouse");
        Piece brahms = new Piece("Brahms 2", "Brahms");
        Piece pulcinella2 = new Piece("pulce 2", "Stravinsky");


        Piece stringsPiece3 = new Piece("Strings Piece3");
        Piece windsPiece3 = new Piece("Winds Only3");
        Piece fullGroup3 = new Piece("Huge Symphony3");
        Piece pulcinella3 = new Piece("pulce 3");
        Piece beeth3 = new Piece("Beethoven Symphony 3");

        Collection<Instrument> stringsPlayers = new ArrayList<>();
        stringsPlayers.add(violin);
        stringsPlayers.add(violin);

        pieceRepo.save(pulcinella2);
        pieceRepo.save(rousePiece);
        pieceRepo.save(brahms);

        pieceRepo.save(pulcinella3);
        pieceRepo.save(fullGroup3);
        pieceRepo.save(stringsPiece3);
        pieceRepo.save(windsPiece3);
        pieceRepo.save(beeth3);

        pieceRepo.save(pulcinella);
        pieceRepo.save(fullGroup);
        pieceRepo.save(stringsPiece);
        pieceRepo.save(windsPiece);
        pieceRepo.save(beeth6);

        pulcinella.setInstruments(stringsPlayers);
        pieceRepo.save(pulcinella);

        Performance sym1 = new Performance("Sym 1", LocalDate.now());
        Performance pops1 = new Performance("Pops 1", LocalDate.of(2021, 10, 21));
        Performance messiah = new Performance("Messiah", LocalDate.of(2021, 12, 10));
        Performance sym2 = new Performance("Sym 2", LocalDate.of(2021, 10, 25));

        Collection<Piece> piecesForSym1 = new ArrayList<>();
        piecesForSym1.add(pulcinella);
        piecesForSym1.add(fullGroup);
        piecesForSym1.add(stringsPiece);
        piecesForSym1.add(beeth6);

        Collection<Piece> piecesForPops1 = new ArrayList<>();
        piecesForPops1.add(pulcinella2);
        piecesForPops1.add(rousePiece);
        piecesForPops1.add(brahms);

        Collection<Piece> piecesForMessiah = new ArrayList<>();
        piecesForMessiah.add(pulcinella3);
        piecesForMessiah.add(fullGroup3);
        piecesForMessiah.add(stringsPiece3);
        piecesForMessiah.add(beeth3);

        performanceRepo.save(sym1);
        performanceRepo.save(pops1);
        performanceRepo.save(messiah);
        performanceRepo.save(sym2);

        pieceRepo.save(pulcinella);
        pieceRepo.save(fullGroup);
        pieceRepo.save(stringsPiece);
        pieceRepo.save(windsPiece);

        sym1.setPieces(piecesForSym1);
        pops1.setPieces(piecesForPops1);
        messiah.setPieces(piecesForMessiah);

        performanceRepo.save(sym1);
        performanceRepo.save(pops1);
        performanceRepo.save(messiah);

        Collection<InstrumentNumber> instrumentNumbersToAdd = new ArrayList<>();
        Collection<InstrumentNumber> instrumentNumbersToAdd2 = new ArrayList<>();

        for (Instrument instrument : instrumentRepo.findAll()) {
            InstrumentNumber numberToAdd = new InstrumentNumber(instrument);
            InstrumentNumber numberToAdd2 = new InstrumentNumber(instrument);

            instrumentNumberRepo.save(numberToAdd);
            instrumentNumberRepo.save(numberToAdd2);

            instrumentNumbersToAdd.add(numberToAdd);
            instrumentNumbersToAdd.add(numberToAdd2);
        }
        Piece testPiece = new Piece("Crouching Tiger", "Tan Dun", instrumentNumbersToAdd);
        pieceRepo.save(testPiece);

        pulcinella.setInstrumentNumbers(instrumentNumbersToAdd2);
        pieceRepo.save(pulcinella);
        System.out.println(pulcinella.getInstrumentNumbers().size());
        System.out.println(testPiece.getInstrumentNumbers().size());

    }
}
