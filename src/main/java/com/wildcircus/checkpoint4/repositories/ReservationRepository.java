package com.wildcircus.checkpoint4.repositories;

import com.wildcircus.checkpoint4.entities.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}