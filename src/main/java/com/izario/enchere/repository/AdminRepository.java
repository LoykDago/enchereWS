package com.izario.enchere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.izario.enchere.classes.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long>{
    
}
