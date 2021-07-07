package com.sofka.prueba.retocarros.entity;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "juego")
public class Juego {
    @Id
    @Column(name = "numero_juego")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroJuego;

    @JoinColumn(name = "id_Pista")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pista pista;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "juego_jugador",
            joinColumns = @JoinColumn(name = "id_juego"),
            inverseJoinColumns = @JoinColumn(name = "id_jugador")
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Jugador> jugadores;

    public Juego() {
    }

    public Long getNumeroJuego() {
        return numeroJuego;
    }

    public void setNumeroJuego(Long numeroJuego) {
        this.numeroJuego = numeroJuego;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
