package org.wcci.team1.trekproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutesController {

    @RequestMapping("/")
    public String home(Model model) {
//        model.addAttribute("title", "Home");
        return "home";
    }
    @RequestMapping("/aboutUs")
    public String aboutUs(Model model) {
        model.addAttribute("title", "About Us");
        return "aboutUs";
    }

    @RequestMapping("/contactUs")
    public String contactUs(Model model) {
        model.addAttribute("title", "Contact Us");
        return "contactUs";
    }
}