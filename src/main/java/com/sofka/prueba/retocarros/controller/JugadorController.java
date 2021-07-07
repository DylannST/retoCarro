package com.sofka.prueba.retocarros.controller;

import com.sofka.prueba.retocarros.entity.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sofka.prueba.retocarros.service.JugadorService;

@RestController
@CrossOrigin(origins = "*")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @GetMapping(value = "api/jugador/{name}")
    public Jugador obtenerJugador(@PathVariable("name") String nombre) {
        return jugadorService.obtenerJugador(nombre);
    }
}
