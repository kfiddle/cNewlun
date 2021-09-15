package com.example.demo.repositories;

import com.example.demo.models.Performance;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

public interface PerformanceRepository extends CrudRepository<Performance, Long> {

    boolean existsByTitle(String title);

    boolean existsByDate(LocalDate date);
}
