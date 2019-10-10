package com.wildcircus.checkpoint4.controllers;

import javax.validation.Valid;

import com.wildcircus.checkpoint4.entities.Reservation;
import com.wildcircus.checkpoint4.repositories.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reservation")
    public String create(@ModelAttribute Reservation reservation, Model model) {
        model.addAttribute("action", "/reservation");
        model.addAttribute("method", "post");
        model.addAttribute("reservation", reservation);
        return "/reservation";
    }

    @PostMapping("/reservation")
    public String validate(@Valid Reservation reservation, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                System.out.println(error.toString());
            }
            redirectAttrs.addFlashAttribute("reservation", reservation);
            return "redirect:/reservation";
        }
         else {
            reservationRepository.save(reservation);
            return "redirect:/reservation";
        }
    }
}