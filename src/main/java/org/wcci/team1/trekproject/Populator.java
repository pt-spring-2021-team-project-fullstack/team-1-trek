package org.wcci.team1.trekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TrekListRepository trekListRepo;
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


        TrekList trek1 = new TrekList("Mount Kilimanjaro", "Africa", "Tanzania", "climbing");
        TrekList trek2 = new TrekList("Andes", "South America", "Venezuela", "horseback riding");
        TrekList trek3 = new TrekList("Rocky Mountains", "North America", "Canada", "cross-country skiing");
        TrekList trek4 = new TrekList("Himalayas", "South Asia", "Indian Himalayan Region", "climbing");
        TrekList trek5 = new TrekList("Alps", "Western Europe", "Switzerland", "hiking");
        TrekList trek6 = new TrekList("Great Dividing Range", "Australia", "New South Wales", "horseback riding");
        TrekList trek7 = new TrekList("TransAntarctic Mountains", "Antarctica", "West Antarctica", "climbing");

        trekListRepo.save(trek1);
        trekListRepo.save(trek2);
        trekListRepo.save(trek3);
        trekListRepo.save(trek4);
        trekListRepo.save(trek5);
        trekListRepo.save(trek6);
        trekListRepo.save(trek7);


    }

}

