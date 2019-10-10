package com.wildcircus.checkpoint4.controllers;

import java.util.List;
import java.util.Set;

import com.wildcircus.checkpoint4.entities.Representation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RepresentationController {
    @GetMapping("/reservation")
    public String reservation(Model model, @RequestParam(required = false) Representation representation) {
        List<Representation> representations = representationRepository.findAll();
        model.addAttribute("representation", representations);

        return "reservation";
    }
}
