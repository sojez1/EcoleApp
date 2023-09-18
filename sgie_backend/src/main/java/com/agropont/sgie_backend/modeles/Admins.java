package com.agropont.sgie_backend.modeles;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Admins extends Acteurs{
    
    private String fonction;  // soit secretaire, soit comptable,  ...

    private boolean ActifAdmin; // permet de desactiver un administrateur

    @ManyToOne
    private Ecoles ecole;


    /**
     * Constructeur sans parametre
     */
    public Admins(){

    }

    
    
    /**
     * Constructeur avec parametre.
     * Sa superclasse est la classe Acteurs
     * @param nom
     * @param prenom
     * @param courriel
     * @param telephone
     * @param mypassword
     * @param fonction
     */
    public Admins(String nom, String prenom, String courriel, String telephone, String mypassword, String fonction){
        super(nom, prenom,courriel,telephone,mypassword);
        this.fonction = fonction;
        this.ActifAdmin = true;

    }
}
