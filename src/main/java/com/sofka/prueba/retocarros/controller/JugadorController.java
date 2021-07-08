package com.sofka.prueba.retocarros.controller;

import com.sofka.prueba.retocarros.entity.Jugador;
import com.sofka.prueba.retocarros.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @GetMapping(value = "api/jugador/{name}")
    public Jugador obtenerJugador(@PathVariable("name") String nombre) {
        return jugadorService.obtenerJugador(nombre);
    }

    @PostMapping("api/jugador")
    public Jugador registrar(@RequestBody Jugador jugador) {
        return jugadorService.registrarJugador(jugador);
    }

    @GetMapping("api/jugadores")
    public List<Jugador> obtenerListaJugador() {
        return jugadorService.obtenerListaJugador();
    }
}
