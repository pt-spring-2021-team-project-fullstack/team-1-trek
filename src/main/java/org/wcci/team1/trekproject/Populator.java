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

<<<<<<< Updated upstream
=======
        Trek trek1 = new Trek("Rocky Mountains", "You will go cross country skiing in the Canadian Rockies", "/images/RockyMountains.jpg", northAmerica, lakeLouise, crossCountrySkiing);
        Trek trek2 = new Trek("Alps", "You will hike the Alps", "/images/Alps.jpg", europe, switzerland, hiking);
        Trek trek3 = new Trek("Himalayas", "You will climb to the top of the Himalayas", "/images/Himalayas.jpg", asia, indianHimalayanRegion, climbing);
        Trek trek4 = new Trek("Andes", "You will go horseback riding in the Andes", "/images/Andes.jpg", southAmerica, venezuela, horsebackRiding);
        Trek trek5 = new Trek("Mount Kilimanjaro", "You will climb to the top of Mount Kilimanjaro", "/images/MountKilimanjaro.jpg", africa, tanzania, climbing);
        Trek trek6 = new Trek("Great Dividing Range", "You will go horseback riding in the Great Dividing Range", "/images/GreatDividingRange.jpg", australia, newSouthWales, horsebackRiding);
        Trek trek7 = new Trek("Mt Tennant", "You will go cross-country skiing on Mt Tennant", "/images/Mt Tennant.jpg", antarctica, dancoCoast, crossCountrySkiing);

>>>>>>> Stashed changes

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

