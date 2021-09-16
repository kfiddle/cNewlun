package com.example.demo.repositories;

import com.example.demo.enums.Type;
import com.example.demo.models.Player;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Collection;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Collection<Player> findByType(Type type);

    boolean existsByFirstNameAreaAndLastName(String firstNameArea, String lastName);

    Collection<Player> findAll(Sort sort);

}
