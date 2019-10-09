package com.wildcircus.checkpoint4.repositories;

import com.wildcircus.checkpoint4.entities.Res;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResRepository extends JpaRepository<Res, Long> {
} 