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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoPodio;
    @Column(name = "puesto")
    private String puesto;

    @Id
    @JoinColumn(name = "nombre_Jugador")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Conductor conductor;


    public Podio() {

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


}
