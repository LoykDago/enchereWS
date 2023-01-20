package com.izario.enchere.controller;

import java.sql.Connection;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izario.enchere.classes.Admin;
import com.izario.enchere.classes.ObjetBDD;
import com.izario.enchere.classes.Utilisateur;

@CrossOrigin
@RestController
@RequestMapping("Login/")
public class LoginController {
   
    @PostMapping("checkUser")
    public int checkUser(@RequestBody Utilisateur user){
        Connection c=null;
        try {
            c=ObjetBDD.connect();
            Utilisateur u=new Utilisateur();
            ArrayList<Object> list=u.find(c);
		    for (int i = 0; i < list.size(); i++) {
                Utilisateur current=(Utilisateur)list.get(i);
			    if (current.getPseudo().equals(user.getPseudo())&& current.getMdp().equals(user.getMdp())) {
			        return current.getIdUtilisateur();
                }
		    }  
        } catch (Exception e) {
            System.out.println(e);
        }
		 return -1;
    }
}
