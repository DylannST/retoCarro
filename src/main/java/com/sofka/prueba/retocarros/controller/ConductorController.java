package com.sofka.prueba.retocarros.controller;

import com.sofka.prueba.retocarros.entity.Conductor;
import com.sofka.prueba.retocarros.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConductorController {

    @Autowired
    ConductorService conductorService;

    @GetMapping(value = "api/conductor/{name}")
    public Conductor obtenerJugador(@PathVariable("name") String nombre) {
        return conductorService.obtenerConductor(nombre);
    }

    @PostMapping("api/conductor")
    public Conductor crearConductor(@RequestBody Conductor conductor){
        return conductorService.crearConductor(conductor);
    }

}
