package com.sofka.prueba.retocarros.controller;


import com.sofka.prueba.retocarros.entity.Carril;
import com.sofka.prueba.retocarros.service.CarrilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RestController
public class CarrilController {

    @Autowired
    CarrilService carrilService;


    @PostMapping("api/carril")
    public Carril agregarCarril(@RequestBody Carril carril) {
        return carrilService.agregarCarril(carril);
    }
}
