package com.agropont.sgie_backend.servicesImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agropont.sgie_backend.modeles.Ecoles;
import com.agropont.sgie_backend.repositories.EcolesReposi;
import com.agropont.sgie_backend.services.EcolesServ;

@Service
public class EcolesImpl implements EcolesServ{

    @Autowired
    private EcolesReposi ecolereposit;

    @Override
    public Ecoles inscrireEcole(Ecoles ecole) {
        return ecolereposit.save(ecole);
    }

    @Override
    public void desactiverEcole(Ecoles ecole) {
        
    }

    @Override
    public Collection<Ecoles> listeEcole() {
        return null;
    }

    @Override
    public Ecoles modifierEcole(Ecoles ecole) {
        return null;
    }
    
}
