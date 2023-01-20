package com.izario.enchere.controller;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izario.enchere.classes.Enchere;
import com.izario.enchere.classes.Mise;
import com.izario.enchere.classes.ObjetBDD;
import com.izario.enchere.services.EncherService;


@CrossOrigin
@RestController
@RequestMapping("encheres")
public class EnchereController {

    @Autowired
    EncherService service ;

    @GetMapping("/listeEncheres")
    public List<Enchere> getListeEncheres(){
        return service.getAll();
    }


    @GetMapping("ficheEnchere/{id}")
    public Enchere getFicheEncheres(@PathVariable(name="id")Long id){
       return service.findEnchere(id);
    }
    @PostMapping("insertMise/mise")
    public void insertMise(@RequestBody Mise mise){
        Connection c=null;
        try {
            c=ObjetBDD.connect();
            mise.create(c);
            c.commit();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @PostMapping("/insertEnchere")
    public void insertEnchere(@RequestBody Enchere enchere){
       service.insertEnchere(enchere);
    }

    @GetMapping(value = "/historiqueEnchere/{id}",produces="application/json")
    public List<Enchere> findOwEncheres(@PathVariable(name = "id")Long id) {
        return service.findOwEncheres(id);
    }
    
}
