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

    @Resource
    RosterRepository rosterRepo;

    public Collection<InstrumentNumber> makeRoster() {
        Collection<InstrumentNumber> collectionToMake = new ArrayList<>();
        for (Instrument instrument : instrumentRepo.findAll()) {
            InstrumentNumber numberToAdd = new InstrumentNumber(instrument);
            instrumentNumberRepo.save(numberToAdd);
            collectionToMake.add(numberToAdd);
        }
        return collectionToMake;
    }

    @Override
    public void run(String... args) throws Exception {


        Player leAnne = new Player("Leanne", "Wistrom", InstrumentEnum.FLUTE, Type.CONTRACT);
        Player seanG = new Player("Sean", "Gabriel", InstrumentEnum.FLUTE, Type.CONTRACT);
        Player sarahH = new Player("Sarah", "Hamilton", InstrumentEnum.EBCLARINET, Type.CONTRACT);
        Player danna = new Player("Danna", "Sundet", InstrumentEnum.OBOE, Type.CONTRACT);
        Player heatherS = new Player("Heather", "Storey", InstrumentEnum.OBOE, Type.CONTRACT);
        Player ami = new Player("Amitai", "Vardi", InstrumentEnum.CLARINET, Type.CONTRACT);
        Player liesl = new Player("Liesl", "Hook", InstrumentEnum.VIOLIN, Type.SUB);
        Player jenJ = new Player("Jennifer", "Jansen", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player jeffS = new Player("Jeff", "Singler", InstrumentEnum.CELLO, Type.CONTRACT);
        Player jiYoung = new Player("Ji Young", "Nam", InstrumentEnum.VIOLA, Type.CONTRACT);

        Player db = new Player("David", "Boutin-Bourque", InstrumentEnum.CLARINET, Type.CONTRACT);
        Player lk = new Player("Laura", "Laura Koepke", InstrumentEnum.BASSOON, Type.CONTRACT);
        Player lel = new Player("Sarah Elizabeth", "Lee", InstrumentEnum.BASSOON, Type.CONTRACT);
        Player cr = new Player("Chris", "Rapier", InstrumentEnum.HORN, Type.CONTRACT);
        Player ma = new Player("Mark", "Addleman", InstrumentEnum.HORN, Type.CONTRACT);
        Player es = new Player("Emily", "Shelley", InstrumentEnum.HORN, Type.CONTRACT);
        Player ba = new Player("Bryan", "Adkins", InstrumentEnum.HORN, Type.CONTRACT);
        Player bs = new Player("Benjamin", "Strecker", InstrumentEnum.HORN, Type.CONTRACT);
        Player gd = new Player("Gary", "Davis", InstrumentEnum.TRUMPET, Type.CONTRACT);
        Player da = new Player("Douglas", "Amos", InstrumentEnum.TRUMPET, Type.CONTRACT);
        Player mh = new Player("Micah", "Holt", InstrumentEnum.TRUMPET, Type.CONTRACT);
        Player wc = new Player("Whitney", "Claire", InstrumentEnum.TROMBONE, Type.CONTRACT);
        Player sb = new Player("Sean", "Bessette", InstrumentEnum.TROMBONE, Type.CONTRACT);
        Player kh = new Player("Ken", "Heinlein", InstrumentEnum.TUBA, Type.CONTRACT);
        Player bradA = new Player("Brad", "Amidon", InstrumentEnum.PERCUSSION, Type.CONTRACT);
        Player ml = new Player("Matt", "Larson", InstrumentEnum.PERCUSSION, Type.CONTRACT);
        Player mr = new Player("Melody", "Rapier", InstrumentEnum.HARP, Type.CONTRACT);

        Player kj = new Player("Ken", "Johnston", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player sls = new Player("Sandro", "Leal-Santiesteban", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player jh = new Player("Joshua", "Huang", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player melissaH = new Player("Melissa", "Hernandez", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player ah = new Player("Alexander", "Hettinga", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player stefS = new Player("Stefanie", "Schore", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player yk = new Player("Yejee", "Kim", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player mp = new Player("Maura", "Pelinsky", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player jc = new Player("Janice", "Carlson", InstrumentEnum.VIOLIN, Type.CONTRACT);
        Player benS = new Player("Benjamin", "Schantz", InstrumentEnum.VIOLA, Type.CONTRACT);

        Player ericaS = new Player("Erica", "Snowden-Rodriguez", InstrumentEnum.CELLO, Type.CONTRACT);
        Player wt = new Player("Will", "Teegarden", InstrumentEnum.CELLO, Type.CONTRACT);
        Player nadineS = new Player("Nadine", "Sherman", InstrumentEnum.CELLO, Type.CONTRACT);
        Player bt = new Player("Robert ", "Nicholson", InstrumentEnum.CELLO, Type.CONTRACT);
        Player jv = new Player("Jean ", "Verdecchia", InstrumentEnum.CELLO, Type.CONTRACT);

        Player kieranH = new Player("Kieran", "Hanlon", InstrumentEnum.BASS, Type.CONTRACT);
        Player josephH = new Player("Joseph", "Hernandez", InstrumentEnum.BASS, Type.CONTRACT);
        Player tomC = new Player("Thomas", "Christopherson", InstrumentEnum.BASS, Type.CONTRACT);
        Player jamesM = new Player("James", "Mohney", InstrumentEnum.BASS, Type.CONTRACT);

        playerRepo.save(db);
        playerRepo.save(lk);
        playerRepo.save(lel);
        playerRepo.save(cr);
        playerRepo.save(ma);
        playerRepo.save(es);

        playerRepo.save(ba);
        playerRepo.save(bs);
        playerRepo.save(gd);
        playerRepo.save(da);
        playerRepo.save(mh);
        playerRepo.save(wc);
        playerRepo.save(sb);
        playerRepo.save(kh);
        playerRepo.save(bradA);
        playerRepo.save(ml);
        playerRepo.save(mr);
        playerRepo.save(kj);
        playerRepo.save(sls);
        playerRepo.save(jh);
        playerRepo.save(melissaH);
        playerRepo.save(ah);
        playerRepo.save(stefS);
        playerRepo.save(yk);
        playerRepo.save(mp);
        playerRepo.save(jc);
        playerRepo.save(benS);
        playerRepo.save(ericaS);
        playerRepo.save(wt);
        playerRepo.save(nadineS);
        playerRepo.save(bt);
        playerRepo.save(jv);

        playerRepo.save(kieranH);
        playerRepo.save(josephH);
        playerRepo.save(tomC);
        playerRepo.save(jamesM);


        Player mariaV = new Player("Maria", "Park", InstrumentEnum.VIOLIN, Type.SUB);
        Player gingerV = new Player("Ginger", "Smith", InstrumentEnum.VIOLIN, Type.SUB);
        Player beano = new Player("Mike", "Chen", InstrumentEnum.VIOLIN, Type.SUB);
        Player gracie = new Player("Lou", "Lev", InstrumentEnum.VIOLIN, Type.SUB);
        Player doodle = new Player("Susan", "Britton", InstrumentEnum.VIOLIN, Type.SUB);
        Player nHess = new Player("Diana", "Pepelea", InstrumentEnum.VIOLIN, Type.SUB);

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
        nHess.setInstrumentEnum(InstrumentEnum.BASSOON);
        heatherS.setInstrumentEnum(InstrumentEnum.CELLO);
        jiYoung.setInstrumentEnum(InstrumentEnum.VIOLA);
        ami.setInstrumentEnum(InstrumentEnum.CLARINET);

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

        Collection<InstrumentNumber> instrumentNumbersForPulcinella = makeRoster();

        Collection<Piece> sym1Pieces = new ArrayList<>();
        Collection<Piece> sym2Pieces = new ArrayList<>();
        Collection<Piece> sym3Pieces = new ArrayList<>();
        Collection<Piece> sym4Pieces = new ArrayList<>();
        Collection<Piece> sym5Pieces = new ArrayList<>();

        Collection<Piece> nutPieces = new ArrayList<>();
        Collection<Piece> messiahPieces = new ArrayList<>();


        Piece rousePiece = new Piece("Rouse Piece", "Rouse");
        Piece brahms = new Piece("Brahms 2", "Brahms");
        Piece pulcinella = new Piece("Pulcinella", "Stravinsky");
        pieceRepo.save(rousePiece);
        pieceRepo.save(brahms);
        pieceRepo.save(pulcinella);

        sym1Pieces.add(rousePiece);
        sym1Pieces.add(brahms);
        sym1Pieces.add(pulcinella);


        Piece nutCrack = new Piece("Nutcracker", "Tchaikovsky");
        pieceRepo.save(nutCrack);

        Piece mssh = new Piece("Messian", "Handel");
        pieceRepo.save(mssh);

        Piece sorcerer = new Piece("Sorcerer's Apprentice", "Dukas");
        Piece poulenc = new Piece("Poulenc Piece", "Poulenc");
        Piece franck= new Piece("Symphony", "Franck");
        pieceRepo.save(sorcerer);
        pieceRepo.save(poulenc);
        pieceRepo.save(franck);

        sym2Pieces.add(sorcerer);
        sym2Pieces.add(poulenc);
        sym2Pieces.add(franck);

        Piece remick = new Piece("Remick Piece", "Remick");
        Piece wagner = new Piece("Wagner Piece", "Wagner");
        Piece rach = new Piece("Piano Concerto", "Rachmaninoff");
        pieceRepo.save(remick);
        pieceRepo.save(wagner);
        pieceRepo.save(rach);

        sym3Pieces.add(remick);
        sym3Pieces.add(wagner);
        sym3Pieces.add(rach);

        Piece adams = new Piece("Adams Piece", "Adams");
        Piece ibert = new Piece("Ibert Piece", "Ibert");
        Piece glaz = new Piece("Glazunov Piece", "Glazunov");
        pieceRepo.save(adams);
        pieceRepo.save(ibert);
        pieceRepo.save(glaz);

        sym4Pieces.add(adams);
        sym4Pieces.add(ibert);
        sym4Pieces.add(glaz);

        Piece mahler = new Piece("Symphony 2", "Mahler");
        Piece tian = new Piece("Tian Piece", "Tian");
        pieceRepo.save(mahler);
        pieceRepo.save(tian);

        sym5Pieces.add(mahler);
        sym5Pieces.add(tian);



        Performance church = new Performance("Church", LocalDate.of(2021, 11, 21));
        Performance nutCracker = new Performance("Nutcracker", LocalDate.of(2021, 12, 16));
        Performance messiah = new Performance("Messiah", LocalDate.of(2021, 12, 10));

        Performance sym1 = new Performance("Sym 1", LocalDate.of(2022, 1, 1));
        Performance sym2 = new Performance("Sym 2", LocalDate.of(2022, 1, 25));
        Performance sym3 = new Performance("Sym 3", LocalDate.of(2022, 2, 25));
        Performance sym4 = new Performance("Sym 4", LocalDate.of(2022, 3, 25));
        Performance sym5 = new Performance("Sym 5", LocalDate.of(2022, 4, 25));

        Performance pops1 = new Performance("Pops 1", LocalDate.of(2022, 1, 15));
        Performance pops2 = new Performance("Pops 2", LocalDate.of(2022, 2, 15));
        Performance pops3 = new Performance("Pops 3", LocalDate.of(2022, 3, 16));
        Performance pops4 = new Performance("Pops 4", LocalDate.of(2022, 4, 17));
        Performance pops5 = new Performance("Pops 5", LocalDate.of(2022, 5, 5));

        Performance youth = new Performance("Youth", LocalDate.of(2022, 6, 1));

        sym1.setPieces(sym1Pieces);
        sym2.setPieces(sym2Pieces);
        sym3.setPieces(sym3Pieces);
        sym4.setPieces(sym4Pieces);
        sym5.setPieces(sym5Pieces);

        performanceRepo.save(sym1);
        performanceRepo.save(sym2);
        performanceRepo.save(sym3);
        performanceRepo.save(sym4);
        performanceRepo.save(sym5);


        performanceRepo.save(pops1);
        performanceRepo.save(messiah);
        performanceRepo.save(sym2);



        Collection<InstrumentNumber> instrumentNumbersForTiger = makeRoster();


        Piece crouchingTiger = new Piece("Crouching Tiger", "Tan Dun", instrumentNumbersForTiger);
        pieceRepo.save(crouchingTiger);

        Roster pulcinellaRoster = new Roster();
        rosterRepo.save(pulcinellaRoster);

        pulcinella.setRoster(pulcinellaRoster);
        pulcinella.getRoster().setHarps(7);

        rosterRepo.save(pulcinellaRoster);
        pieceRepo.save(pulcinella);

        Roster rouseRoster = new Roster();
        rosterRepo.save(rouseRoster);


        rousePiece.setRoster(rouseRoster);
        pieceRepo.save(rousePiece);

        rousePiece.getRoster().setBasses(11);
        rosterRepo.save(rouseRoster);
        pieceRepo.save(rousePiece);


    }
}
