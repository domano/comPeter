package de.comPeter.repository;

import de.comPeter.data.entity.Match;
import de.comPeter.data.entity.MatchResult;
import de.comPeter.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by domano on 31.01.16.
 */
@Repository
public interface MatchResultRepository extends CrudRepository<MatchResult, Long> {
    MatchResult findById(Long id);
    List<MatchResult> findByMatch(Match match);
}
