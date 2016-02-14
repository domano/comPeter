package de.comPeter.repository;

import de.comPeter.data.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domano on 31.01.16.
 */
@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
    public Game findByName(String name);
}
