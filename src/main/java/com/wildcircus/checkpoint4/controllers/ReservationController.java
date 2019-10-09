package com.wildcircus.checkpoint4.controllers;

import javax.validation.Valid;

import com.wildcircus.checkpoint4.entities.Reservation;
import com.wildcircus.checkpoint4.repositories.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reservation")
    public String browse(Model model){
        return "reservation";
    }

    @PostMapping("/reservation/create")
    public String store(@Valid Reservation reservation) {
       reservation = reservationRepository.save(reservation);
       return "redirect:/users/" + reservation.getId();
   }
}