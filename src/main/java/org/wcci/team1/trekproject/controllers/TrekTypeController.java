package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        return "trekTypesView";
    }
}