package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Podio;
import com.sofka.prueba.retocarros.repository.PodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodioService {

    @Autowired
    PodioRepository podioRepository;

    public void registrarPodio(List<Podio> podios) {
        for (Podio podio: podios){
            podioRepository.guardarPodio(podio.getPuesto(),podio.getConductor().getNombre());
        }
    }
}
