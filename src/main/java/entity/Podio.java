package entity;

public class Podio {
    private String puesto;
    private String nombre;

    public Podio(String puesto, String nombre) {
        this.puesto = puesto;
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
