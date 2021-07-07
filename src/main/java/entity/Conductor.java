package entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "conductor")
public class Conductor {

    @Id
    @JoinColumn(name = "Nombre")
    private String nombre;
    @JoinColumn(name = "No_veces_ganado")
    private int noVecesGanado;
    @JoinColumn(name = "Placa_Carro", unique = true)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Carro carro;

    public Conductor(String nombre, int noVecesGanado) {
        this.nombre = nombre;
        this.noVecesGanado = noVecesGanado;
    }

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
