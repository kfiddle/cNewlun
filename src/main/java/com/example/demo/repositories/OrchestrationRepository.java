package com.example.demo.repositories;

import com.example.demo.models.Orchestration;
import com.example.demo.models.Piece;
import org.springframework.data.repository.CrudRepository;

public interface OrchestrationRepository extends CrudRepository<Orchestration, Long> {


    Orchestration findByPiece(Piece incomingPiece);
}
