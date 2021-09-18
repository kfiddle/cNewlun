package com.example.demo.repositories;

import com.example.demo.models.Piece;
import com.example.demo.models.Roster;
import org.springframework.data.repository.CrudRepository;

public interface RosterRepository extends CrudRepository<Roster, Long> {

    Roster findByPiece(Piece incomingPiece);
}
