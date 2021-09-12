package com.example.demo.repositories;

import com.example.demo.enums.Type;
import com.example.demo.models.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    boolean existsByLastName(String lastName);

    boolean existsByFirstNameArea(String firstNameArea);
    Collection<Player> findByType(Type type);
}
