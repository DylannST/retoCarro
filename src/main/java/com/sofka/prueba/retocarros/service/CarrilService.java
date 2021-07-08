package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Carril;
import com.sofka.prueba.retocarros.repository.CarrilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrilService {

    @Autowired
    CarrilRepository carrilRepository;

    public Carril agregarCarril(Carril carril) {
        return carrilRepository.save(carril);
    }
}
