package com.izario.enchere.classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@TableName
public class Utilisateur extends ObjetBDD{
	@Id
    @DBColumn(primaryKey = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "utilisateur_idutilisateur_seq")
    @SequenceGenerator(name = "utilisateur_idutilisateur_seq", sequenceName = "utilisateur_idutilisateur_seq", allocationSize = 1)
    @Column(name = "idutilisateur")
    int idUtilisateur;
    @DBColumn
    @Column(name = "pseudo")
    String pseudo;
    @Column(name = "mdp")
    @DBColumn
    String mdp;  
    
    public Utilisateur() {
    }
    public Utilisateur(int idUtilisateur, String pseudo, String mdp) {
        this.idUtilisateur = idUtilisateur;
        this.pseudo = pseudo;
        this.mdp = mdp;
    }
    public int getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
   
}
