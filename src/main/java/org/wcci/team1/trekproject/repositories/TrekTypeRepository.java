package org.wcci.team1.trekproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.team1.trekproject.models.TrekType;

import java.util.Optional;

public interface TrekTypeRepository extends CrudRepository<TrekType, Long> {

    Optional<TrekType> findById(Long id);
    TrekType findTrekTypeByName(String name);
}

