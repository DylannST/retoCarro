package entity;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "podio")
public class Podio {

    @Id
    @JoinColumn(name = "codigo_Podio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoPodio;
    @JoinColumn(name = "Puesto")
    private String puesto;
    @JoinColumn(name = "Nombre_Jugador")
    private String nombre;

    @Id
    @JoinColumn(name = "Nombre_Jugador")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Conductor conductor;

    public Podio(String puesto, String nombre) {
        this.puesto = puesto;
        this.nombre = nombre;
    }

    public Podio() {

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
