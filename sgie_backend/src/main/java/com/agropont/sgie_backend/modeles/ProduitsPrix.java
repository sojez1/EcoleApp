package com.agropont.sgie_backend.modeles;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class ProduitsPrix {

    // la concatenation des colonnes ecoles et produits sera la cle primaire (a inclure)
    private Ecoles ecole;
    private Produits produit;
    private double prix;
    private int quantite;
    

    /**
     * Constructeur avec parametre
     * @param ecole
     * @param produit
     * @param prix
     */
    public ProduitsPrix(Ecoles ecole, Produits produit, double prix){
        this.ecole = ecole;
        this.produit = produit;
        this.prix = prix;
        this.quantite = 1;  // valeur par defaut

    }
    
}
