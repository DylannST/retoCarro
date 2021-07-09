package com.sofka.prueba.retocarros.entity;

public class DtoJuego {
    private String nombre;
    private String placa;
    private Long avance;
    private Long posicion;

    public DtoJuego(String nombre, String placa, Long avance, Long posicion) {
        this.nombre = nombre;
        this.placa = placa;
        this.avance = avance;
        this.posicion = posicion;
    }

    public DtoJuego() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getAvance() {
        return avance;
    }

    public void setAvance(Long avance) {
        this.avance = avance;
    }

    public Long getPosicion() {
        return posicion;
    }

    public void setPosicion(Long posicion) {
        this.posicion = posicion;
    }
}
