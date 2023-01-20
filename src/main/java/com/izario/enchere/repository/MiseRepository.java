package com.izario.enchere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.izario.enchere.classes.Mise;

@Repository
public interface MiseRepository extends JpaRepository<Mise , Long> {
    
}
