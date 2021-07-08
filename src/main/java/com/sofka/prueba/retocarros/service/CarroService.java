package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Carro;
import com.sofka.prueba.retocarros.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Carro agregarCarro(Carro carro) {
        return carroRepository.save(carro);
    }
}
