/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 57315
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tablero {
    private Jugador jugador;
    private int intentos;
    private int aciertos;
    private int fallos;
    private List<FiguraGeometrica> figuras;

    public Tablero(Jugador jugador) {
        this.jugador = jugador;
        this.intentos = 0;
        this.aciertos = 0;
        this.fallos = 0;
        this.figuras = new ArrayList<>();
        // Agrega las figuras geométricas al tablero
        agregarFiguras();
    }

    private void agregarFiguras() {
        // Crea cuatro figuras geométricas, dos con tamaños iguales y dos con tamaños diferentes
        figuras.add(new FiguraGeometrica("Círculo", 1));
        figuras.add(new FiguraGeometrica("Triángulo", 2));
        figuras.add(new FiguraGeometrica("Cuadrado", 1));
        figuras.add(new FiguraGeometrica("Rectángulo", 3));
        // Baraja las figuras para mostrarlas al azar
        Collections.shuffle(figuras, new Random());
    }

    public void iniciarJuego() {
        while (intentos < 3) { // Por ejemplo, limita el juego a 3 intentos
            // Mostrar las cuatro figuras geométricas al jugador
            mostrarFiguras();
            // Obtener la selección del jugador
            int seleccion = obtenerSeleccion();
            // Verificar si la selección es correcta
            if (esSeleccionCorrecta(seleccion)) {
                aciertos++;
            } else {
                fallos++;
            }
            intentos++;
        }
        // Mostrar estadísticas al finalizar el juego
        mostrarEstadisticas();
    }

    private void mostrarFiguras() {
        // Muestra las cuatro figuras geométricas al jugador
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println((i + 1) + ". " + figuras.get(i).getTipo());
        }
    }

    private int obtenerSeleccion() {
        // Implementa la lógica para que el jugador seleccione una figura
        // Retorna el número de la figura seleccionada por el jugador
        // Aquí podrías usar Scanner o una interfaz gráfica para obtener la selección
        return 0; // Reemplaza con la selección real del jugador
    }

    private boolean esSeleccionCorrecta(int seleccion) {
        // Verifica si la selección del jugador es correcta
        // Compara el tamaño de la figura seleccionada con las otras figuras
        int tamanoSeleccionado = figuras.get(seleccion - 1).getTamano();
        for (FiguraGeometrica figura : figuras) {
            if (figura != figuras.get(seleccion - 1) && figura.getTamano() == tamanoSeleccionado) {
                return true; // El jugador seleccionó una figura con tamaño igual a otra
            }
        }
        return false; // El jugador no seleccionó una figura con tamaño igual a otra
    }

    private void mostrarEstadisticas() {
        // Muestra las estadísticas al finalizar el juego
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Intentos: " + intentos);
        System.out.println("Aciertos: " + aciertos);
        System.out.println("Fallos: " + fallos);
    }
}