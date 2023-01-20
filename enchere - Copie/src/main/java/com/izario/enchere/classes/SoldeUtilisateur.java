package com.izario.enchere.classes;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * SoldeUtilisateur
 */
@Entity
@TableName 
@Table(name = "soldeutilisateur")
 public class SoldeUtilisateur extends ObjetBDD {

     @Id
     @Column(name = "idsoldeutilisateur")
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "soldeutilisateur_idsoldeutilisateur_seq")
     @SequenceGenerator(name = "soldeutilisateur_idsoldeutilisateur_seq", sequenceName = "soldeutilisateur_idsoldeutilisateur_seq", allocationSize = 1)
     @DBColumn(primaryKey = true)
     private int idenchere;
    @Column(name = "valeur")
    @DBColumn
     private int valeur;
    @Column(name = "dateoperation")
    @DBColumn
     private Timestamp dateoperation;
    @Column(name = "idutilisateur")
    private int idutilisateur;
    public int getIdenchere() {
        return idenchere;
    }
    public void setIdenchere(int idenchere) {
        this.idenchere = idenchere;
    }
    public int getValeur() {
        return valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public Timestamp getDateoperation() {
        return dateoperation;
    }
    public void setDateoperation(Timestamp dateoperation) {
        this.dateoperation = dateoperation;
    }
    public int getIdutilisateur() {
        return idutilisateur;
    }
    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }
    public SoldeUtilisateur() {
    }
    public SoldeUtilisateur(int idenchere, int valeur, Timestamp dateoperation, int idutilisateur) {
        this.idenchere = idenchere;
        this.valeur = valeur;
        this.dateoperation = dateoperation;
        this.idutilisateur = idutilisateur;
    }

    
}