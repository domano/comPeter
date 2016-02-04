package de.comPeter.repository;

import de.comPeter.data.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domano on 31.01.16.
 */
public interface GameRepository extends CrudRepository<Game, Long> {
}
