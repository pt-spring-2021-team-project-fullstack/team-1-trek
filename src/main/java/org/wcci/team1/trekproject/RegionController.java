package org.wcci.team1.trekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
