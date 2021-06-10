package org.wcci.team1.trekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrekListController {

    @Resource
    private TrekRepository trekListRepo;

    @RequestMapping("/trek-list")
    public String displayTrekList(Model model) {
        model.addAttribute("trekListModel", trekListRepo.findAll());

        return "TrekListView";
    }
}
