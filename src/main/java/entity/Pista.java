package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pista")
public class Pista {

    @Id
    @JoinColumn(name = "Id")
    private String id;
    @JoinColumn(name = "Nombre")
    private String nombre;
    @JoinColumn(name = "Tamano_pista")
    private int tamanio;

    public Pista(String id, String nombre, int tamanio) {
        this.id = id;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public Pista() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
