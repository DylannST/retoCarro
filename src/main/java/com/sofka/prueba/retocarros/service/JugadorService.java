package com.sofka.prueba.retocarros.service;

import com.sofka.prueba.retocarros.entity.Jugador;
import com.sofka.prueba.retocarros.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public Jugador obtenerJugador(String nombre) {
        return jugadorRepository.findById(nombre).orElseThrow();
    }

    public Jugador registrarJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public List<Jugador> obtenerListaJugador() {
        return (List<Jugador>) jugadorRepository.findAll();
    }
}
