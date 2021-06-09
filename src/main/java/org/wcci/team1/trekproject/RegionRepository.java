package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {
        Optional<Region> findByName(String name);
        Region findById(long id);
        Region findByContinent(Continent continent);
    }
