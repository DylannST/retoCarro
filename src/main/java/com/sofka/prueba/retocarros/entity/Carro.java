package com.sofka.prueba.retocarros.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @Column(name = "placa", length = 6)
    private String placa;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "avance")
    private Long Avance;
    @Column(name = "posicion")
    private Long posicion;


    public Carro() {
    }

    @OneToOne(mappedBy = "carro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Carril carril;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getAvance() {
        return Avance;
    }

    public void setAvance(Long avance) {
        Avance = avance;
    }

    public Long getPosicion() {
        return posicion;
    }

    public void setPosicion(Long posicion) {
        this.posicion = posicion;
    }

    public Carril getCarril() {
        return carril;
    }

    public void setCarril(Carril carril) {
        this.carril = carril;
    }
}
