package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {
    @Override
    Optional<Region> findById(Long aLong);
}

