package com.sofka.prueba.retocarros.entity;


import com.sofka.prueba.retocarros.util.JuegoJugador;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "podio")
@IdClass(JuegoJugador.class)
public class Podio {

    @Id
    @Column(name = "codigo_Podio")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoPodio;
    @Column(name = "puesto")
    private int puesto;

    @Id
    @JoinColumn(name = "nombre_Jugador", unique = true, nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Conductor conductor;


    public Podio() {

    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getCodigoPodio() {
        return codigoPodio;
    }


    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
