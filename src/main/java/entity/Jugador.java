package entity;

public class Jugador {
    private String nombre;
    private String turno;

    public Jugador(String nombre, String turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
