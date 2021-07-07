package com.sofka.prueba.retocarros.util;

import com.sofka.prueba.retocarros.entity.Conductor;

import java.io.Serializable;

public class JuegoJugador implements Serializable {
    private int codigoPodio;

    private Conductor conductor;

    // default constructor


    public JuegoJugador(int codigoPodio, Conductor conductor) {
        this.codigoPodio = codigoPodio;
        this.conductor = conductor;
    }
}
