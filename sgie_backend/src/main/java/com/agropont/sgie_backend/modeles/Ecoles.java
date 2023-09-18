package com.agropont.sgie_backend.modeles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ecoles {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEcole;

    private String denomination;

    @Column(length = 15, name = "sigle")
    private String sigleEcole;

    @Temporal(TemporalType.DATE)
    private Date dateInscription; // date inscription de l'ecole dans le systeme

    private boolean actifEcole; // pour activer ou desactiver l'ecole

    @Column(columnDefinition = "TEXT")
    private String adresseEcole;

    @OneToMany(mappedBy = "ecole")
    private Collection<Admins> inscritpar = new ArrayList<Admins>(); // Liste des administrateurs de l'ecole
}
