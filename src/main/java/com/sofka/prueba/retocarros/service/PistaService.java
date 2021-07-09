package com.sofka.prueba.retocarros.service;

import com.sofka.prueba.retocarros.entity.Pista;
import com.sofka.prueba.retocarros.repository.PistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.sofka.prueba.retocarros.util.GeneradorRamdon.palabraAleatoria;

@Service
public class PistaService {


    @Autowired
    PistaRepository pistaRepository;


    public Pista agregarPista(Pista pista) {
        pista.setNombre(palabraAleatoria(3));
        return pistaRepository.save(pista);
    }


    public Pista consultarPista(String id) {
        return pistaRepository.findById(id).orElseThrow();
    }
}
