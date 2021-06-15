package org.wcci.team1.trekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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