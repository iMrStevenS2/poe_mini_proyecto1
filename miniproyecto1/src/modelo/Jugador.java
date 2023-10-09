
package modelo;

/**
 * @author Steven Bernal Ortiz - 1942208
 * @author Jorge Arley Garcia - 2182588
 */
public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public Jugador() {
        this.nombre = "";
        this.puntaje = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void aumentarPuntaje() {
        puntaje++;
    }

}
