package com.crud_backend.demo.repository;

import com.crud_backend.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
