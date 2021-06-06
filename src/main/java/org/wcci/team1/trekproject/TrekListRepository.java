package org.wcci.team1.trekproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekListRepository {



    public interface PaperPlateRepository extends CrudRepository<TrekList, Long> {
        Optional<TrekList> findAll(String TrekList);

    }
}
