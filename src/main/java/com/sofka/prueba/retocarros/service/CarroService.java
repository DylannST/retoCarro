package com.sofka.prueba.retocarros.service;


import com.sofka.prueba.retocarros.entity.Carro;
import com.sofka.prueba.retocarros.entity.DtoJuego;
import com.sofka.prueba.retocarros.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<Carro> actualizarPosiciones(List<DtoJuego> carros) {
        for (DtoJuego carro : carros) {
            carroRepository.actualizarPosicion(carro.getPosicion(), carro.getPlaca());
        }
        return (List<Carro>) carroRepository.consultaCarros();
    }

    public List<DtoJuego> obtenerCarrosJuego(Long juego) {
        List<DtoJuego> dtoJuego = new ArrayList<>();
        List<Object[]> listJuego = carroRepository.obtenerCarrosJuego(juego);

        for (Object[] dato : listJuego) {
            dtoJuego.add(new DtoJuego(dato[0].toString(), dato[1].toString(), Long.parseLong(dato[2].toString()), Long.parseLong(dato[3].toString())));
            System.out.println(dato);
        }
        return dtoJuego;
    }
}
