package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        int neededViolins = 7;
//        int neededCellos = 3;
//
//
//        String[] someCellists = {"Jeffy", "Weffy", "Benny", "Rory", "Mort"};
//        String[] someViolinists = {"Sally", "Becky", "Tammy", "Harry", "Nicky", "Joey", "Mikey", "Maria"};
//
//        HashMap<Integer, String> officialViolins = new HashMap<>();
//        HashMap<Integer, String> officialCellos = new HashMap<>();
//
//        for (int j = 0; j < neededViolins; j++) {
//            officialViolins.put(j, someViolinists[j]);
//        }
//
//        for (int j = 0; j < neededCellos; j++) {
//            officialCellos.put(j, someCellists[j]);
//        }
//
//        System.out.println(officialViolins);
//        System.out.println(officialCellos);
    }

}
