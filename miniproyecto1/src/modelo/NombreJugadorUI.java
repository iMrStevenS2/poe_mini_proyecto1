/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 57315
 */// Clase para la interfaz gráfica de introducción del nombre
public class NombreJugadorUI {
    public static String obtenerNombre() {
        return JOptionPane.showInputDialog("Ingresa tu nombre:");
    }
}
