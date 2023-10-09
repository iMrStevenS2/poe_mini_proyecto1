
package modelo;

/**
 * @author Steven Bernal Ortiz - 1942208
 * @author Jorge Arley Garcia - 2182588
 */
public class FiguraGeometrica {
    // private String tipo;
    private int tamanio;

    public FiguraGeometrica(int tamanio) {
        // this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public FiguraGeometrica() {
        // this.tipo = "";
        this.tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

}
