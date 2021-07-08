package com.sofka.prueba.retocarros.controller;

import com.sofka.prueba.retocarros.entity.Juego;
import com.sofka.prueba.retocarros.service.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JuegoController {
    @Autowired
    JuegoService juegoService;

    @PostMapping("api/juego")
    public Juego crearJuego(@RequestBody Juego juego) {
        return juegoService.crearJuego(juego);
    }
}
