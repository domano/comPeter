package de.comPeter.repository;

import de.comPeter.data.entity.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domano on 31.01.16.
 */
@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
