package com.example.demo.repositories;

import com.example.demo.models.Piece;
import org.springframework.data.repository.CrudRepository;

public interface PieceRepository extends CrudRepository<Piece, Long> {

}
