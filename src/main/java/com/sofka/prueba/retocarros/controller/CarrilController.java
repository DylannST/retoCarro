package com.sofka.prueba.retocarros.controller;


import com.sofka.prueba.retocarros.entity.Carril;
import com.sofka.prueba.retocarros.service.CarrilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrilController {

    @Autowired
    CarrilService carrilService;


    @PostMapping("api/carril")
    public Carril agregarCarril(@RequestBody Carril carril) {
        return carrilService.agregarCarril(carril);
    }
}
