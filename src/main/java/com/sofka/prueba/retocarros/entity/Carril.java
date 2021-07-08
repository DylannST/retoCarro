package com.sofka.prueba.retocarros.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "carril")
public class Carril {

    @Id
    @Column(name = "numero_Carril")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroCarril;

    @JoinColumn(name = "numero_pista", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pista pista;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "placa_carro", unique = true, nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Carro carro;

    public Carril() {
    }

    public Long getNumeroCarril() {
        return numeroCarril;
    }

    public void setNumeroCarril(Long numeroCarril) {
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
