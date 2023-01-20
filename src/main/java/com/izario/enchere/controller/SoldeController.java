package com.izario.enchere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izario.enchere.classes.SoldeUtilisateur;
import com.izario.enchere.repository.SoldeUtilisateurRepository;

@CrossOrigin
@RestController
@RequestMapping("solde")
public class SoldeController {
    
    @Autowired
    SoldeUtilisateurRepository service;

    @PostMapping("/rechargerSolde")
    public void AjoutSolde(@RequestBody SoldeUtilisateur solde){
        service.save(solde);
    }
}
