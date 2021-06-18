package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.team1.trekproject.repositories.TrekTypeRepository;

import javax.annotation.Resource;

@Controller
public class TrekTypeController {

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @RequestMapping("/trekTypes")
    public String displayTrekTypes(Model model) {
        model.addAttribute("trekTypes", trekTypeRepo.findAll());
        model.getAttribute(("image"));
        return "trekTypesView";
    }

    @GetMapping("/trekTypes/{name}")
    public String displaySingleTrekType(@PathVariable String name, Model model) {
        TrekType retrievedTrekType = trekTypeRepo.findTrekTypeByName(name);
        model.addAttribute("trekType", retrievedTrekType);
        retrievedTrekType.getName();
        retrievedTrekType.getDescription();
        retrievedTrekType.getImage();
        retrievedTrekType.getTreks();
        return "trekTypeView";
    }

    }

