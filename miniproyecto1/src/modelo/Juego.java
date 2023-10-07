/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 57315
 */
public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de figuras geométricas");
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        Jugador jugador = new Jugador(nombre);
        Tablero tablero = new Tablero(jugador);

        // Iniciar el juego
        tablero.iniciarJuego();
    }
}
