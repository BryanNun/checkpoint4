package com.wildcircus.checkpoint4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RepresentationController {
    @GetMapping("/accueil")
    public String browse(Model model){
        return "accueil";
    }
}
