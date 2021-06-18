package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.team1.trekproject.models.Continent;
import org.wcci.team1.trekproject.models.Region;
import org.wcci.team1.trekproject.repositories.ContinentRepository;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    @RequestMapping("/continents")
    public String displayContinents(Model model) {
        model.addAttribute("continents", continentRepo.findAll());
        return "continentsView";
    }


    @GetMapping("/continents/{name}")
    public String displaySingleContinent(@PathVariable String name, Model model) {
        Continent retrievedContinent = continentRepo.findContinentByName(name);
        model.addAttribute("continent", retrievedContinent);
        retrievedContinent.getName();
        retrievedContinent.getDescription();
        retrievedContinent.getImage();
        retrievedContinent.getRegions();

        return "continentView";
    }
}