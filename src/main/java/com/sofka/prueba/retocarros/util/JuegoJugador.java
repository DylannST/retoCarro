package com.sofka.prueba.retocarros.util;

import com.sofka.prueba.retocarros.entity.Conductor;

import java.io.Serializable;

public class JuegoJugador implements Serializable {


    private int codigoPodio;


    private Conductor conductor;

    // default constructor


    public JuegoJugador() {
    }

    public int getCodigoPodio() {
        return codigoPodio;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setCodigoPodio(int codigoPodio) {
        this.codigoPodio = codigoPodio;
    }


    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
