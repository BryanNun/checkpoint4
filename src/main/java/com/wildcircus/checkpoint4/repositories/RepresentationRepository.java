package com.wildcircus.checkpoint4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepresentationRepository extends JpaRepository<Representation, Long> {
}