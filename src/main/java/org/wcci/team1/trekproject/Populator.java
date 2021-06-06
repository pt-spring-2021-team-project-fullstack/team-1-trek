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
        TrekType cruise = new TrekType("cruise");

        trekTypeRepo.save(hiking);
        trekTypeRepo.save(cruise);


        TrekList trek1 = new TrekList("a", "b", "c", "v");


    }










}
