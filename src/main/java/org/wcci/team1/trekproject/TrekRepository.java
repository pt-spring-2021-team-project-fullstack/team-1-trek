package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {
//    Optional<Trek> findAll(Long Trek);
//    Optional<Trek> findOne(Long Trek);

//    @Override
    Optional<Trek> findById(long id);
}

