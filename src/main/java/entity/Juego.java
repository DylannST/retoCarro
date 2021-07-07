package entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "juego")
public class Juego {
    @Id
    @JoinColumn(name = "Numero_juego")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numeroJuego;

    @JoinColumn(name = "Id_Pista")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pista pista;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "juego_jugador",
            joinColumns = {@JoinColumn(name = "Id_juego")},
            inverseJoinColumns = {@JoinColumn(name = "Id_jugador")}
    )
    @JsonIgnore
    private Set<Juego> jugadores = new HashSet<>();

    public Juego() {
    }

    public String getNumeroJuego() {
        return numeroJuego;
    }

    public void setNumeroJuego(String numeroJuego) {
        this.numeroJuego = numeroJuego;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Set<Juego> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Juego> jugadores) {
        this.jugadores = jugadores;
    }
}
