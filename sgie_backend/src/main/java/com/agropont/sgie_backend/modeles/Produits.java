/**
 * Cette classe sert à repertorier la liste des services offerts par l'ecole et leur prix
 * en vue de la facturation
 */

package com.agropont.sgie_backend.modeles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Produits {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;

    @Column(length = 40, nullable = false)
    private String produit; // exemple: frais de scolarité, assurance, bibliotheque
    
}
