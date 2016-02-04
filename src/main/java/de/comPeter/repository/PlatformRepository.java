package de.comPeter.repository;

import de.comPeter.data.entity.Platform;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domano on 31.01.16.
 */
public interface PlatformRepository extends CrudRepository<Platform, Long> {
}
