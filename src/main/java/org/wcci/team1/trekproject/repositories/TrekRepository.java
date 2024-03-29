package org.wcci.team1.trekproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.team1.trekproject.models.Trek;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {

    Optional<Trek> findById(Long id);

    Trek findTrekByName(String name);

    Trek findTrekByContinent(String continent);

    Trek findTrekByRegion(String region);

    Trek findTrekByTrekType(String trekType);



}
