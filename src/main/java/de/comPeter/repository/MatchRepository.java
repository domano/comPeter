package de.comPeter.repository;

import de.comPeter.data.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domano on 30.01.16.
 */
@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {
}
