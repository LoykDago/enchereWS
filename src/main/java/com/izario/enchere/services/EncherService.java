package com.izario.enchere.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izario.enchere.classes.Enchere;
import com.izario.enchere.repository.EnchereRepository;

@Service
public class EncherService {

    @Autowired
    EnchereRepository enchere;

    public List<Enchere> getAll() {
        return enchere.findAll();
    }

    public void insertEnchere(Enchere e) {
        enchere.save(e);
    }

    /**
     * @param id
     * @return
     */
    public Enchere findEnchere(Long id) {
        Optional<Enchere> optinalEntity = enchere.findById(id);
        return optinalEntity.get();
    }

    public List<Enchere> findOwEncheres(Long id) {

        return enchere.findByidenchereur(id);
    }
}
