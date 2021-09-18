package com.example.demo.repositories;

import com.example.demo.models.InstrumentNumber;
import org.springframework.data.repository.CrudRepository;

public interface InstrumentNumberRepository extends CrudRepository<InstrumentNumber, Long> {
}
