package com.sofka.prueba.retocarros.controller;


import com.sofka.prueba.retocarros.entity.Carro;
import com.sofka.prueba.retocarros.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    @Autowired
    CarroService carroService;

    @PostMapping("api/carro")
    public Carro agregarCarro(@RequestBody Carro carro) {
        return carroService.agregarCarro(carro);
    }

}
