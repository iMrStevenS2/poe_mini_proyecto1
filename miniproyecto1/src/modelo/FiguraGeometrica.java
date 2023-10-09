/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 57315
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

    // public String getTipo() {
    // return tipo;
    // }

    // public void setTipo(String tipo) {
    // this.tipo = tipo;
    // }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

}
