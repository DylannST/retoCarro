package entity;

public class Pista {
    private String id;
    private String nombre;
    private int tamanio;

    public Pista(String id, String nombre, int tamanio) {
        this.id = id;
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

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}