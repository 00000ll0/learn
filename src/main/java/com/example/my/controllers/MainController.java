package com.example.my.controllers;

import com.example.my.models.Quests;
import com.example.my.repo.QuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@Controller
public class MainController {

    @Autowired
    private QuestsRepository questsRepository;

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        Iterable <Quests> quests = questsRepository.findAll();
        model.put("quests", quests);
        return "home";
    }


    @GetMapping("about")
    public String about(Map<String, Object> model) {
        return "about";
    }

    @GetMapping("photos")
    public String photos(Map<String, Object> model) {
        return "photos";
    }

    @GetMapping("schedule")
    public String schedule(Model model) {
        model.addAttribute("die", "of");
        return "schedule";
    }

    @GetMapping("contacts")
    public String contacts(Model model) {
        model.addAttribute("die", "of");
        return "contacts";
    }

}