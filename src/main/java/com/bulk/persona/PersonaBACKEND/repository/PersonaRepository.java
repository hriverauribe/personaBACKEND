package com.bulk.persona.PersonaBACKEND.repository;

import com.bulk.persona.PersonaBACKEND.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
