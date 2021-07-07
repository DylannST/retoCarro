package com.sofka.prueba.retocarros.service;

import com.sofka.prueba.retocarros.entity.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofka.prueba.retocarros.repository.JugadorRepository;


@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public Jugador obtenerJugador(String nombre) {
        return jugadorRepository.findById(nombre).orElseThrow();
    }
}
