package com.sofka.prueba.retocarros.controller;


import com.sofka.prueba.retocarros.entity.Carro;
import com.sofka.prueba.retocarros.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RestController
public class CarroController {

    @Autowired
    CarroService carroService;

    @PostMapping("api/carro")
    public Carro agregarCarro(@RequestBody Carro carro) {
        return carroService.agregarCarro(carro);
    }

    @PutMapping("api/carro/{avance}/{nombre}")
    public List<Carro> actualizarAvance(@PathVariable("avance") Long avance, @PathVariable("nombre") String nombre) {
        return carroService.actualizarAvance(avance, nombre);
    }

    @PutMapping("api/carros")
    public List<Carro> actualizarPosiciones(@RequestBody List<Carro> carros) {
        return carroService.actualizarPosiciones(carros);
    }
}
