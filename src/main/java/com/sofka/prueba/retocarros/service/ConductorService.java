package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Conductor;
import com.sofka.prueba.retocarros.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConductorService {

    @Autowired
    ConductorRepository conductorRepository;

    public Conductor obtenerConductor(String nombre) {
        Optional<Conductor> optCondu =  conductorRepository.findById(nombre);
        if(optCondu.isPresent()){
            return optCondu.get();
        }
            return null;
    }

    public Conductor crearConductor(Conductor conductor) {
        return conductorRepository.save(conductor);
    }
}
