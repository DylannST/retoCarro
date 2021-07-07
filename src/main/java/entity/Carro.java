package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @JoinColumn(name = "Placa")
    private String placa;
    @JoinColumn(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "Avance")
    private int Avance;
    @JoinColumn(name = "Posicion")
    private int posicion;

    public Carro(String placa, int avance, int posicion) {
        this.placa = placa;
        Avance = avance;
        this.posicion = posicion;
    }

    public Carro() {
    }

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

    public int getAvance() {
        return Avance;
    }

    public void setAvance(int avance) {
        Avance = avance;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
