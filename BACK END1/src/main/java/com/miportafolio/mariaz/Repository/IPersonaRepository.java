package com.miportafolio.mariaz.Repository;

import com.miportafolio.mariaz.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}