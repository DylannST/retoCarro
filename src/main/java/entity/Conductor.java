package entity;

public class Conductor {

    private String nombre;
    private int noVecesGanado;
    private String noPlaca;

    public Conductor(String nombre, int noVecesGanado, String noPlaca) {
        this.nombre = nombre;
        this.noVecesGanado = noVecesGanado;
        this.noPlaca = noPlaca;
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

    public String getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(String noPlaca) {
        this.noPlaca = noPlaca;
    }
}
