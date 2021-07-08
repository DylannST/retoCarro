package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Podio;
import com.sofka.prueba.retocarros.repository.PodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PodioService {

    @Autowired
    PodioRepository podioRepository;

    public Podio registrarPodio(Podio podio) {
        return podioRepository.save(podio);
    }
}
