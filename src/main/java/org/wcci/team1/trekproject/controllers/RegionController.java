package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.team1.trekproject.models.Region;
import org.wcci.team1.trekproject.repositories.RegionRepository;

import javax.annotation.Resource;

@Controller
public class RegionController {

        @Resource
        private RegionRepository regionRepo;

        @RequestMapping("/regions")
        public String displayRegions(Model model) {
            model.addAttribute("regions", regionRepo.findAll());
            return "regionsView";
        }
    @GetMapping("/regions/{name}")
    public String displaySingleRegion(@PathVariable String name, Model model){
        Region retrievedRegion= regionRepo.findRegionByName(name);
        model.addAttribute("region",retrievedRegion);;
        retrievedRegion.getName();
        retrievedRegion.getDescription();
        retrievedRegion.getImage();
        retrievedRegion.getContinent();

        return "regionView";
    }
    }
