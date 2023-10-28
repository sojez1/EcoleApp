package com.agropont.sgie_backend.controlleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agropont.sgie_backend.modeles.Ecoles;
import com.agropont.sgie_backend.services.EcolesServ;

@RestController
@RequestMapping("/sgie/ecoles")
public class EcolesControl {

    @Autowired
    private EcolesServ ecoleserv;

    @PostMapping("/addecole")
    public String EnregistrerEcole(@RequestBody Ecoles ecole){
        try{
            ecoleserv.inscrireEcole(ecole);
            return "L'ecole "+ecole.getDenomination()+" est bien enregistree dans le systeme";

        }catch(Exception ex){
            return "Impossible d'enregistrer l'ecole dans le systeme\n"+ex.getMessage();
        }
    }
    
}
