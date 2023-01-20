package com.izario.enchere.controller;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.izario.enchere.classes.SoldeUtilisateurValide;
import com.izario.enchere.repository.SoldeUtilisateurValideRepository;
@CrossOrigin

@RestController
@RequestMapping("/soldeutilisateurvalide")
public class SoldeUtilisateurValideController {
	@Autowired
    private final SoldeUtilisateurValideRepository soldeUtilisateurValideRepository;

    public SoldeUtilisateurValideController(SoldeUtilisateurValideRepository soldeUtilisateurValideRepository) {
        this.soldeUtilisateurValideRepository = soldeUtilisateurValideRepository;
    }

    @GetMapping
    public List<SoldeUtilisateurValide> getAll() {
        return soldeUtilisateurValideRepository.findAll();
    }

    @GetMapping("/{id}")
    public SoldeUtilisateurValide getById(@PathVariable Long id) throws Exception {
        return (SoldeUtilisateurValide) soldeUtilisateurValideRepository.findById(id).orElseThrow((Supplier<? extends Exception>) new Exception("inexistant"));
    }

    @PostMapping
    public SoldeUtilisateurValide create(@RequestBody SoldeUtilisateurValide soldeUtilisateurValide) {
        return soldeUtilisateurValideRepository.save((SoldeUtilisateurValide) soldeUtilisateurValide);
    }

    @PutMapping("/{id}")
    public SoldeUtilisateurValide update(@PathVariable Long id, @RequestBody SoldeUtilisateurValide soldeUtilisateurValide) throws Exception {
        SoldeUtilisateurValide entity = (SoldeUtilisateurValide) soldeUtilisateurValideRepository.findById(id).orElseThrow((Supplier<? extends Exception>) new Exception("inexistant"));
        entity.setDatevalidation(entity.getDatevalidation());
        entity.setIdsoldeutilisateur(entity.getIdsoldeutilisateur());
        return soldeUtilisateurValideRepository.save(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
        SoldeUtilisateurValide entity = (SoldeUtilisateurValide) soldeUtilisateurValideRepository.findById(id).orElseThrow((Supplier<? extends Exception>) new Exception("inexistant"));
        soldeUtilisateurValideRepository.delete( entity);
        return ResponseEntity.ok().build();
    }
}

