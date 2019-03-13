package com.sabre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoteController {


    @GetMapping("/home")
    public String index(Model model) {

        return "index";
    }
    @GetMapping("/login")
    public String login(Model model) {

        return "login";
    }


}
