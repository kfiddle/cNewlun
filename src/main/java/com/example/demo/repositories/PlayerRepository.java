package com.example.demo.repositories;

import com.example.demo.enums.InstrumentEnum;
import com.example.demo.enums.Type;
import com.example.demo.models.Instrument;
import com.example.demo.models.Performance;
import com.example.demo.models.Player;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Set;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Collection<Player> findByType(Type type, Sort by);

    boolean existsByFirstNameAreaAndLastName(String firstNameArea, String lastName);

    Collection<Player> findAll(Sort sort);

    Collection<Player> findByTypeAndInstrumentEnum(Type sub, InstrumentEnum instrument, Sort by);

}
