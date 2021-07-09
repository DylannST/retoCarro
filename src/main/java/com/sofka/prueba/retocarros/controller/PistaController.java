package com.sofka.prueba.retocarros.controller;


import com.sofka.prueba.retocarros.entity.Pista;
import com.sofka.prueba.retocarros.service.PistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RestController
public class PistaController {

    @Autowired
    PistaService pistaService;

    @PostMapping("api/pista")
    public Pista agregarPista(@RequestBody Pista pista) {
        return pistaService.agregarPista(pista);
    }

}
