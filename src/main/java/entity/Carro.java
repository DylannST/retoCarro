package entity;


public class Carro {
    private String placa;
    private String descripcion;
    private int Avance;
    private int posicion;

    public Carro(String placa, int avance, int posicion) {
        this.placa = placa;
        Avance = avance;
        this.posicion = posicion;
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
