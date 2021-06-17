package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.team1.trekproject.repositories.ContinentRepository;

import javax.annotation.Resource;

@Controller
public class RegionController {

        @Resource
        private ContinentRepository regionRepo;

        @RequestMapping("/regions")
        public String displayContinents(Model model) {
            model.addAttribute("regions", regionRepo.findAll());
            return "regionsView";
        }
    }
