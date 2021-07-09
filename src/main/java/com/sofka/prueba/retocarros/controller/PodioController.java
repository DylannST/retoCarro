package com.sofka.prueba.retocarros.controller;


import com.sofka.prueba.retocarros.entity.Podio;
import com.sofka.prueba.retocarros.service.PodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RestController
public class PodioController {

    @Autowired
    PodioService podioService;

    @PostMapping("api/podio")
    public Podio registrarPodio(@RequestBody Podio podio) {
        return podioService.registrarPodio(podio);
    }
}
