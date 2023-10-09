
package modelo;

/**
 * @author Steven Bernal Ortiz - 1942208
 * @author Jorge Arley Garcia - 2182588
 */

public class Tablero {

    private int intentos;
    private int aciertos;
    private int fallos;
    private int figuras;

    public Tablero(int intentos, int aciertos, int fallos, int figuras) {
        this.intentos = intentos;
        this.aciertos = aciertos;
        this.fallos = fallos;
        this.figuras = figuras;
    }

    public Tablero() {

        this.intentos = 0;
        this.aciertos = 0;
        this.fallos = 0;
        this.figuras = 0;

    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public int getFiguras() {
        return figuras;
    }

    public void setFiguras(int figuras) {
        this.figuras = figuras;
    }

}