package org.wcci.team1.trekproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.team1.trekproject.models.Continent;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent, Long> {
    @Override
    Optional<Continent> findById(Long aLong);


}

