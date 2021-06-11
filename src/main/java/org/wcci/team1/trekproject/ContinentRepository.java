package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent, Long> {
    Optional<Continent> findByName(String name);
    Continent findById(long id);
}
