package com.sofka.prueba.retocarros.service;

import com.sofka.prueba.retocarros.entity.Juego;
import com.sofka.prueba.retocarros.entity.Jugador;
import com.sofka.prueba.retocarros.repository.JuegoRepository;
import com.sofka.prueba.retocarros.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class JuegoService {

    @Autowired
    JuegoRepository juegoRepository;

    @Autowired
    JugadorService jugadorService;


    public Juego crearJuego(Juego juego) {
        List<Jugador> listJugador = jugadorService.obtenerListaJugador();
        List<Jugador> listJugadoresBuenos = new ArrayList<>();
        for(Jugador jugador: juego.getJugadores()){
            if(!listJugador.stream().filter(p-> p.getNombre().equalsIgnoreCase(jugador.getNombre())).findFirst().isPresent()){
                listJugadoresBuenos.add(jugador);
            }
        }
        juego.setJugadores( new HashSet<>(listJugadoresBuenos));

        return juegoRepository.save(juego);
    }
}
