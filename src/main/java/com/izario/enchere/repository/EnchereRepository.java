package com.izario.enchere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.izario.enchere.classes.Enchere;

public interface EnchereRepository extends JpaRepository<Enchere, Long> {
    List<Enchere> findByidenchereur(Long id);
    
    List<Enchere> findByStatut(String name);
}
