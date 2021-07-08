package com.sofka.prueba.retocarros.service;

import com.sofka.prueba.retocarros.entity.Juego;
import com.sofka.prueba.retocarros.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoService {

    @Autowired
    JuegoRepository juegoRepository;


    public Juego crearJuego(Juego juego) {

        return juegoRepository.save(juego);
    }
}
