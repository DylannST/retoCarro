package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Carro;
import com.sofka.prueba.retocarros.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Carro agregarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public List<Carro> actualizarAvance(Long avance, String nombre) {
        carroRepository.actualizarCarro(avance, nombre);
        return (List<Carro>) carroRepository.consultaCarros();
    }

    public List<Carro> actualizarPosiciones(List<Carro> carros) {
        for (Carro carro : carros) {
            carroRepository.actualizarPosicion(carro.getPosicion(), carro.getPlaca());
        }
        return (List<Carro>) carroRepository.consultaCarros();
    }
}
