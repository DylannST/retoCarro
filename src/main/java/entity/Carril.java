package entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "carril")
public class Carril {

    @Id
    @JoinColumn(name = "Numero_Carril")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numeroCarril;

    @JoinColumn(name = "Numero_pista")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pista pista;

    @JoinColumn(name = "Placa_Carro", unique = true)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Carro carro;

    public Carril() {
    }

    public String getNumeroCarril() {
        return numeroCarril;
    }

    public void setNumeroCarril(String numeroCarril) {
        this.numeroCarril = numeroCarril;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
