package org.wcci.team1.trekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TrekRepository trekListRepo;
    private TrekTypeRepository trekTypeRepo;

    @Override
    public void run(String... args) throws Exception {

        TrekType hiking = new TrekType("hiking");
        TrekType climbing = new TrekType("climbing");
        TrekType skiing = new TrekType("cross-country skiing");
        TrekType horseBackRiding = new TrekType("horseback riding");

        trekTypeRepo.save(hiking);
        trekTypeRepo.save(climbing);
        trekTypeRepo.save(skiing);
        trekTypeRepo.save(horseBackRiding);


        Trek trek1 = new Trek("Mount Kilimanjaro", "Africa", "Tanzania", "climbing");
        Trek trek2 = new Trek("Andes", "South America", "Venezuela", "horseback riding");
        Trek trek3 = new Trek("Rocky Mountains", "North America", "Canada", "cross-country skiing");
        Trek trek4 = new Trek("Himalayas", "South Asia", "Indian Himalayan Region", "climbing");
        Trek trek5 = new Trek("Alps", "Western Europe", "Switzerland", "hiking");
        Trek trek6 = new Trek("Great Dividing Range", "Australia", "New South Wales", "horseback riding");
        Trek trek7 = new Trek("TransAntarctic Mountains", "Antarctica", "West Antarctica", "climbing");

        trekListRepo.save(trek1);
        trekListRepo.save(trek2);
        trekListRepo.save(trek3);
        trekListRepo.save(trek4);
        trekListRepo.save(trek5);
        trekListRepo.save(trek6);
        trekListRepo.save(trek7);


    }

}

