package com.izario.enchere.classes;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
@Entity
@TableName
public class Mise extends ObjetBDD{ 
    
    /**
     *
     */
	@Id
    @Column(name = "idmise")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mise_idmise_seq")
    @SequenceGenerator(name="mise_idmise_seq",sequenceName="mise_idmise_seq",allocationSize=1)
    @DBColumn(primaryKey = true)
    int idMise  ; 
    @DBColumn
    int idEnchere ;
    @DBColumn
    int idMiseur ;
    @DBColumn
    double mise   ;
    @DBColumn
    Timestamp dateMise  ;
  
public Mise() {
}
public Mise(int idMise, int idEnchere, int idMiseur, double mise, Timestamp dateMise) {
    this.idMise = idMise;
    this.idEnchere = idEnchere;
    this.idMiseur = idMiseur;
    this.mise = mise;
    this.dateMise = dateMise;
}
public int getIdMise() {
    return idMise;
}
public void setIdMise(int idMise) {
    this.idMise = idMise;
}
public int getIdEnchere() {
    return idEnchere;
}
public void setIdEnchere(int idEnchere) {
    this.idEnchere = idEnchere;
}
public int getIdMiseur() {
    return idMiseur;
}
public void setIdMiseur(int idMiseur) {
    this.idMiseur = idMiseur;
}
public double getMise() {
    return mise;
}
public void setMise(double mise) {
    this.mise = mise;
}
public Timestamp getDateMise() {
    return dateMise;
}
public void setDateMise(Timestamp dateMise) {
    this.dateMise = dateMise;
}
  
}
