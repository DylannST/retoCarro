package com.sofka.prueba.retocarros.service;

import com.sofka.prueba.retocarros.entity.Pista;
import com.sofka.prueba.retocarros.repository.PistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PistaService {


    @Autowired
    PistaRepository pistaRepository;


    public Pista agregarPista(Pista pista) {
        return pistaRepository.save(pista);
    }
}
