package de.comPeter.repository;

import de.comPeter.data.entity.MatchResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domano on 31.01.16.
 */
@Repository
public interface MatchResultRepository extends CrudRepository<MatchResult, Long> {
}
