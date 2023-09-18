package com.agropont.sgie_backend.services;

import java.util.Collection;

import com.agropont.sgie_backend.modeles.Ecoles;

public interface EcolesServ {
    
    public Ecoles inscrireEcole(Ecoles ecole);
    public void desactiverEcole(Ecoles ecole);
    public Collection<Ecoles> listeEcole();
    public Ecoles modifierEcole(Ecoles ecole);
}
 