package com.agropont.sgie_backend.modeles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Acteurs {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long idActeur;

    @Column(length = 30, name = "nom_acteur")
    protected String nomActeur;

    @Column(length = 50, name = "prenom_acteur")
    protected String prenomActeur;

    @Column(unique = true)
    protected String courriel;

    @Column(length = 12, name = "telephone")
    protected String telephone;

    protected String motDePassse;

    protected boolean actifActeur;  // true pour acteur actifs dans le systeme et false pour desactiver l'acteur


    /**
     * Constructeur sans parametre
     */
    public Acteurs(){

    }




    /**
     * Constructeur avec parametres.
     * Ne prends pas en compte ID acteur car generer automatiquement
     * @param nom  Nom de l'acteur sur 30 digits maximum
     * @param prenom  prenom de l'acteur sur 50 digits maxi
     * @param courriel adresse courriel 
     * @param telephone numero de telephone sur 12 digits maximun
     * @param mypassword
     */
    public Acteurs(String nom, String prenom, String courriel, String telephone, String mypassword){
        this.nomActeur = nom;
        this.prenomActeur = prenom;
        this.courriel = courriel;
        this.telephone = telephone;
        this.motDePassse = mypassword;
        this.actifActeur = true;

    }
    
}
