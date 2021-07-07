package com.sofka.prueba.retocarros.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pista")
public class Pista {

    @Id
    @Column(name = "id", length = 5)
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tamano_pista")
    private Long tamanio;


    @OneToMany(mappedBy = "pista", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Carril> carriles;

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

    public Long getTamanio() {
        return tamanio;
    }

    public void setTamanio(Long tamanio) {
        this.tamanio = tamanio;
    }
}
