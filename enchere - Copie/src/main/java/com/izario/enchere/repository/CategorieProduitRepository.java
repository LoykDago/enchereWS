package com.izario.enchere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.izario.enchere.classes.Admin;
import com.izario.enchere.classes.CategorieProduit;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit,Long>{
    
}
