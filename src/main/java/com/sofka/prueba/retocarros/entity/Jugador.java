package com.sofka.prueba.retocarros.entity;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "jugador")
public class Jugador {

    @Id
    @Column(name = "nombre", length = 12)
    private String nombre;
    @Column(name = "turno")
    private Long turno;


    @ManyToMany(mappedBy = "jugadores")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Juego> juego;

    public Jugador() {
    }

    public Jugador(String nombre, Long turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTurno() {
        return turno;
    }

    public void setTurno(Long turno) {
        this.turno = turno;
    }

    public Set<Juego> getJuego() {
        return juego;
    }

    public void setJuego(Set<Juego> juego) {
        this.juego = juego;
    }
}
