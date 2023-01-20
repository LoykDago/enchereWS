package com.izario.enchere.controller;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izario.enchere.classes.SoldeUtilisateur;
import com.izario.enchere.repository.SoldeUtilisateurRepository;
@CrossOrigin
@RestController
@RequestMapping("/soldeutilisateur")
public class SoldeUtilisateurController {

    private final SoldeUtilisateurRepository soldeUtilisateurRepository;

    public SoldeUtilisateurController(SoldeUtilisateurRepository soldeUtilisateurRepository) {
        this.soldeUtilisateurRepository = soldeUtilisateurRepository;
    }

    @GetMapping
    public List<SoldeUtilisateur> getAll() {
        return soldeUtilisateurRepository.findAll();
    }

    @GetMapping("/{id}")
    public SoldeUtilisateur getById(@PathVariable Long id) throws Exception {
        return soldeUtilisateurRepository.findById(id).orElseThrow((Supplier<? extends Exception>) new Exception("inexistant"));
    }

    @PostMapping
    public SoldeUtilisateur create(@RequestBody SoldeUtilisateur soldeUtilisateur) {
        return soldeUtilisateurRepository.save(soldeUtilisateur);
    }

    @PutMapping("/{id}")
    public SoldeUtilisateur update(@PathVariable Long id, @RequestBody SoldeUtilisateur soldeUtilisateur) throws Exception {
        SoldeUtilisateur entity = soldeUtilisateurRepository.findById(id).orElseThrow((Supplier<? extends Exception>) new Exception("inexistant"));
        entity.setValeur(soldeUtilisateur.getValeur());
        entity.setDateoperation(soldeUtilisateur.getDateoperation());
        return soldeUtilisateurRepository.save(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
        SoldeUtilisateur entity = soldeUtilisateurRepository.findById(id).orElseThrow((Supplier<? extends Exception>) new Exception("inexistant"));
        soldeUtilisateurRepository.delete(entity);
        return ResponseEntity.ok().build();
    }
}

