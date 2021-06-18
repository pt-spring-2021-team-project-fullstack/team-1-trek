package org.wcci.team1.trekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.team1.trekproject.models.Continent;
import org.wcci.team1.trekproject.models.Region;
import org.wcci.team1.trekproject.models.Trek;
import org.wcci.team1.trekproject.models.TrekType;
import org.wcci.team1.trekproject.repositories.ContinentRepository;
import org.wcci.team1.trekproject.repositories.RegionRepository;
import org.wcci.team1.trekproject.repositories.TrekRepository;
import org.wcci.team1.trekproject.repositories.TrekTypeRepository;

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

        Continent northAmerica = new Continent("North America", "Rocky Mountain National Park is in northeast Colorado, flanked by the towns of Estes Park on the east and Grand Lake on the west. Other nearby towns include Lyons, Winter Park, Granby and Boulder", "/images/NorthAmerica.jpg");
        Continent europe = new Continent("Europe", "Spanning across Europe, The Alps are the highest and most extensive mountain range system that lies entirely in Europe. The Winter Olympic Games have been hosted in the Swiss, French, Italian, Austrian and German Alps", "/images/Europe.jpg");
        Continent asia = new Continent("Asia", "Asia is the largest and most populous continent, home to the largest (Russia) and most populous (China) nations. ", "/images/Asia.jpg");
        Continent southAmerica = new Continent("South America", "Venezuela is a country in South America, bordering the Caribbean Sea and thegit North Atlantic Ocean, between Colombia and Guyana. It is situated on major sea and air routes linking North and South America.", "/images/Africa.jpg");
        Continent africa = new Continent("Africa", "Africa is sometimes nicknamed the \"Mother Continent\" due to its being the oldest inhabited continent on Earth. Africa, the second-largest continent, is bounded by the Mediterranean Sea, the Red Sea, the Indian Ocean, and the Atlantic Ocean", "/images/Africa.jpg");
        Continent australia = new Continent("Australia", "Eastern side of Australia, where most of the population resides. The climate in the area is dominated by a humid subtropical zone, with some tropical, and some oceanic climate zones. ", "/images/Australia.jpg");
        Continent antarctica = new Continent("Antarctica", "This is in the Antarctic Peninsula, the mountains elevation is approximately 2,264ft. ", "/images/Antarctica.jpg");

        continentRepo.save(northAmerica);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(australia);
        continentRepo.save(antarctica);

        Region lakeLouise = new Region("Lake Louise", "Lake Louise is world famous for its turquoise lakes, the Victoria Glacier, soaring mountain backdrop, palatial hotel, and incredible hiking and skiing", "/images/LakeLouise.jpg", northAmerica);
        Region switzerland = new Region("Switzerland", "A landlocked country of towering mountains, deep Alpine lakes, grassy valleys dotted with neat farms and small villages, and thriving cities that blend the old and the new, Switzerland is the nexus of the diverse physical and cultural geography of western Europe, renowned for both its natural beauty and its way of life.", "/images/Switzerland.jpg", europe);
        Region indianHimalayanRegion = new Region("Indian Himalayan Region", "The Himalayas stretch uninterruptedly for about 1,550 miles (2,500 km) in Asia, forming a barrier between the Plateau of Tibet to the north and the alluvial plains of the Indian subcontinent to the south", "/images/IndianHimalayanRegion.jpg",asia);
        Region venezuela = new Region("Venezuela", "The northernmost part of the Andes has high farmlands and villages nestling beneath its dramatic peaks. The university town of Mérida is the centre of this region", "/images/Venezuela.jpg", southAmerica);
        Region tanzania = new Region("Tanzania", "Kilimanjaro is the highest point in Africa. This volcanic massif stands in splendid isolation above the surrounding plains, with its snowy peak looming over the savannah. The mountain is encircled by mountain forest", "/images/Tanzania.jpg",africa);
        Region newSouthWales = new Region("New South Wales", "Great Dividing Range, also called Great Divide, Eastern Highlands, or Eastern Cordillera, main watershed of eastern Australia; it comprises a series of plateaus and low mountain ranges roughly paralleling the coasts of Queensland, New South Wales, and Victoria for 2,300 miles", "/images/NewSouthWales.jpg",australia);
        Region dancoCoast = new Region("Danco Coast", "The Danco Coast is the northwestern section of the coast of the Antarctic Peninsula located between 64 ° and 65 ° South.", "/images/DancoCoast.jpg",antarctica);



        regionRepo.save(lakeLouise);
        regionRepo.save(switzerland);
        regionRepo.save(indianHimalayanRegion);
        regionRepo.save(venezuela);
        regionRepo.save(tanzania);
        regionRepo.save(newSouthWales);
        regionRepo.save(dancoCoast);

        TrekType hiking = new TrekType("Hiking", "Hiking is a natural exercise that promotes physical fitness, the terrain will depend upon the preferred region.", "/images/Hiking.jpg");
        TrekType climbing = new TrekType("Climbing", "Mountain climbing is exhilarating, and good for any person that is looking for adventure.", "/images/Climbing.jpg");
        TrekType crossCountrySkiing = new TrekType("Cross-country skiing", "Cross country skiing, where the skiers will rely on their own locomotion to move across snow-covered terrain, rather than using ski lifts or other forms of assistance.", "/images/CrossCountrySkiing.jpg");
        TrekType horsebackRiding = new TrekType("Horseback riding", "You will be riding horseback through the trails on this trek.", "/images/HorseBackRiding.jpg");

        trekTypeRepo.save(hiking);
        trekTypeRepo.save(climbing);
        trekTypeRepo.save(crossCountrySkiing);
        trekTypeRepo.save(horsebackRiding);

        Trek trek1 = new Trek("Rocky Mountains", "You will go cross country skiing in the Canadian Rockies", "/images/RockyMountains.jpg", northAmerica, lakeLouise, crossCountrySkiing);
        Trek trek2 = new Trek("Alps", "You will hike the Alps", "/images/Alps.jpg", europe, switzerland, hiking);
        Trek trek3 = new Trek("Himalayas", "You will climb to the top of the Himalayas", "/images/Himalayas.jpg", asia, indianHimalayanRegion, climbing);
        Trek trek4 = new Trek("Andes", "You go horseback riding in the Andes", "/images/Andes.jpg", southAmerica, venezuela, horsebackRiding);
        Trek trek5 = new Trek("Mount Kilimanjaro", "You will climb to the top of Mount Kilimanjaro", "/images/MountKilimanjaro.jpg", africa, tanzania, climbing);
        Trek trek6 = new Trek("Great Dividing Range", "You will go horseback riding in the Great Dividing Range", "/images/GreatDividingRange.jpg", australia, newSouthWales, horsebackRiding);
        Trek trek7 = new Trek("Mt Tennant", "You will go cross-country skiing on Mt Tennant", "/images/MtTennant.jpg", antarctica, dancoCoast, crossCountrySkiing);


        trekRepo.save(trek1);
        trekRepo.save(trek2);
        trekRepo.save(trek3);
        trekRepo.save(trek4);
        trekRepo.save(trek5);
        trekRepo.save(trek6);
        trekRepo.save(trek7);

    }
}

