package entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jugador")
public class Jugador {

    @Id
    @JoinColumn(name = "Nombre")
    private String nombre;
    @JoinColumn(name = "Turno")
    private String turno;

    public Jugador(String nombre, String turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    @ManyToMany(mappedBy = "jugadores", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Juego> juego = new HashSet<>();

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Set<Juego> getJuego() {
        return juego;
    }

    public void setJuego(Set<Juego> juego) {
        this.juego = juego;
    }
}
