package com.agropont.sgie_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agropont.sgie_backend.modeles.Ecoles;

@Repository
public interface EcolesReposi extends JpaRepository<Ecoles, Long>{
    
}
