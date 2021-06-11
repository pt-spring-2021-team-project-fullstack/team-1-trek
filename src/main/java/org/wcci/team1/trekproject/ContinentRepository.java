package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent, Long> {
    @Override
    Optional<Continent> findById(Long aLong);


}

