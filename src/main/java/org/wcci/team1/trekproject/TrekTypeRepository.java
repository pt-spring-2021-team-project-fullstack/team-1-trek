package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekTypeRepository extends CrudRepository<TrekType, Long> {

    Optional<TrekType> findById(Long id);
    TrekType findTrekTypeByName(String name);
}

