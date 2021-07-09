package com.sofka.prueba.retocarros.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pista")
public class Pista {

    @Id
    @GenericGenerator(name = "id", strategy = "com.sofka.prueba.retocarros.util.GenerarNombre")
    @GeneratedValue(generator = "id")
    @Column(name = "id", length = 5)
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tamano_pista")
    private Long tamanio;


    @OneToMany(mappedBy = "pista", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<Carril> carriles;

    public Pista() {

    }

    public Pista(String nombre, Long tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
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
