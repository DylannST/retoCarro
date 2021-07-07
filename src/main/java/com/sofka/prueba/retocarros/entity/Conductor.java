package com.sofka.prueba.retocarros.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "conductor")
public class Conductor {

    @Id
    @Column(name = "nombre", length = 12)
    private String nombre;
    @Column(name = "no_veces_ganado")
    private int noVecesGanado;

    @JoinColumn(name = "placa_Carro", unique = true)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Carro carro;


    public Conductor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoVecesGanado() {
        return noVecesGanado;
    }

    public void setNoVecesGanado(int noVecesGanado) {
        this.noVecesGanado = noVecesGanado;
    }


}
