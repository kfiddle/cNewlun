package com.example.demo.repositories;

import com.example.demo.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    boolean existsByLastName(String lastName);

    boolean existsByFirstNameArea(String firstNameArea);
}
