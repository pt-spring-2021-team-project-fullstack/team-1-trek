package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.team1.trekproject.repositories.TrekRepository;
import org.wcci.team1.trekproject.models.Trek;
import javax.annotation.Resource;

@Controller
public class TrekController {
    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("treks", trekRepo.findAll());
        return "treksView";
    }
    @GetMapping("/treks/{name}")
    public String displaySingleTrek(@PathVariable String name, Model model){
        Trek retrievedTrek= trekRepo.findTrekByName(name);
        model.addAttribute("trek",retrievedTrek);;
        retrievedTrek.getDescription();
        retrievedTrek.getImage();
        retrievedTrek.getContinent();
        retrievedTrek.getRegion();
        retrievedTrek.getTrekType();

        return "trekView";
    }
}