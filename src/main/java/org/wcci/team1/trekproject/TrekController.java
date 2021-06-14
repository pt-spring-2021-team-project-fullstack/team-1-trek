package org.wcci.team1.trekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class TrekController {
    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String findAllTreks(Model model) {
        model.addAttribute("treks", trekRepo.findAll());
        return "treks";
    }

    @RequestMapping("/trek")
    public String findOneTrek(@RequestParam(value = "id") Long id, Model model) throws TrekNotFoundException {

        if (trekRepo.findById(id) == null) {
            throw new TrekNotFoundException();
        }

        model.addAttribute("trekModel", trekRepo.findById(id));
        return "trekTemplate";
    }
}