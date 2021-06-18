package org.wcci.team1.trekproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.team1.trekproject.models.Region;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Optional<Region> findById(long id);
    Region findRegionByName(String name);
}

