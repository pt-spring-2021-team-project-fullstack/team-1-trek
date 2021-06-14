package org.wcci.team1.trekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;
    @Resource
    private TrekTypeRepository trekTypeRepo;
    @Resource
    private TrekRepository trekRepo;

    @Override
    public void run(String... args) throws Exception {

        Continent northAmerica= new Continent("North America","North America Description", "/images/NorthAmerica.jpg");
        Continent europe = new Continent("Europe","Europe Description", "/images/Europe.jpg");
        Continent asia = new Continent("Asia","Asia Description", "/images/Asia.jpg");
        Continent southAmerica = new Continent("South America","South America Description", "/images/Africa.jpg");
        Continent africa = new Continent("Africa","Africa Description", "/images/Africa.jpg");
        Continent australia = new Continent("Australia","Eastern side of Australia, where most of the population resides. The climate in the area is dominated by a humid subtropical zone, with some tropical, and some oceanic climate zones. ", "/images/Australia.jpg");
        Continent antarctica = new Continent("Antarctica","This is in the Antarctic Peninsula, the mountains elevation is approximately 2,264ft. ", "/images/Antarctica.jpg");

        continentRepo.save(northAmerica);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(australia);
        continentRepo.save(antarctica);

        Region lakeLouise = new Region("Lake Louise", "description for Lake Louise", "/images/LakeLouise.jpg",northAmerica);
        Region switzerland= new Region("Switzerland", "description for Switzerland", "/images/Switzerland.jpg",europe);
        Region indianHimalayanRegion = new Region("Lake Louise", "description for India Himalayan Region", "/images/IndianHimalayanRegion.jpg",asia);
        Region venezuela = new Region("Venezuela", "description for Venezuela", "/images/Venezuela.jpg",southAmerica);
        Region tanzania= new Region("Tanzania", "description for Tanzania", "/images/Tanzania.jpg",africa);
        Region newSouthWales = new Region("New South Wales", "description for New South Wales", "/images/NewSouthWales.jpg",australia);
         Region dancoCoast = new Region("Danco Coast", "description for  Danco Coast", "/images/ Danco Coast.jpg",antarctica);


        regionRepo.save(lakeLouise);
        regionRepo.save(switzerland);
        regionRepo.save(indianHimalayanRegion);
        regionRepo.save(venezuela);
        regionRepo.save(tanzania);
        regionRepo.save(newSouthWales);
        regionRepo.save(dancoCoast);

        TrekType hiking = new TrekType("Hiking","Hiking is a natural exercise that promotes physical fitness, the terrain will depend upon the preferred region.", "/images/Hiking.jpg");
        TrekType climbing = new TrekType("Climbing","climbing description", "/images/Climbing.jpg");
        TrekType crossCountrySkiing = new TrekType("Cross-country skiing","cross-country skiing description", "/images/CrossCountrySkiing.jpg");
        TrekType horsebackRiding = new TrekType("Horseback riding","horseback riding description", "/images/HorseBackRiding.jpg");

        trekTypeRepo.save(hiking);
        trekTypeRepo.save(climbing);
        trekTypeRepo.save(crossCountrySkiing);
        trekTypeRepo.save(horsebackRiding);

        Trek trek1 = new Trek("Rocky Mountains","You will go cross country skiing in the Canadian Rockies","/images/RockyMountains.jpg",northAmerica,lakeLouise,crossCountrySkiing);
        Trek trek2 = new Trek("Alps", "You will hike the Alps","/images/Alps.jpg",europe,switzerland,hiking);
        Trek trek3 = new Trek("Himalayas","You will climb to the top of the Himalayas","/images/Himalayas.jpg",asia,indianHimalayanRegion,climbing);
        Trek trek4 = new Trek("Andes","You go horseback riding in the Andes","/images/Andes.jpg",southAmerica,venezuela,horsebackRiding);
        Trek trek5 = new Trek("Mount Kilimanjaro","You will climb to the top of Mount Kilimanjaro","/images/MountKilimanjaro.jpg",africa,tanzania,climbing);
        Trek trek6 = new Trek("Great Dividing Range", "You will go horseback riding in the Great Dividing Range","/images/GreatDividingRange.jpg",australia,newSouthWales,horsebackRiding);
        Trek trek7 = new Trek("Mt Tennant.","You will go cross-country skiing on Mt Tennant","/images/Mt Tennant.jpg",antarctica,dancoCoast,crossCountrySkiing);


        trekRepo.save(trek1);
        trekRepo.save(trek2);
        trekRepo.save(trek3);
        trekRepo.save(trek4);
        trekRepo.save(trek5);
        trekRepo.save(trek6);
        trekRepo.save(trek7);

    }
}

