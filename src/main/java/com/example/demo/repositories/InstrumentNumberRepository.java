package com.example.demo.repositories;

import com.example.demo.models.InstrumentNumber;
import com.example.demo.models.Piece;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface InstrumentNumberRepository extends CrudRepository<InstrumentNumber, Long> {
    Collection<InstrumentNumber> findAllByPiece(Piece incomingPiece);
}
