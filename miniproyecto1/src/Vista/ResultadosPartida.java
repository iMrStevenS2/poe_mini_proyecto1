/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 *      @author Steven Bernal Ortiz - 1942208
 *      @author Jorge Arley Garcia  - 2182588
 * Profesor: LUIS JOHANY ROMO PORTILLA
 * 
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Jugador;
import modelo.Tablero;

// import javax.swing.JTextField;
import java.awt.Container;

public class ResultadosPartida extends JFrame {
    private Jugador jugador;
    private Tablero tablero;

    private JLabel lblNombre;
    private JLabel lblCantidadFiguras;
    private JLabel lblNumeroFiguras;
    private JLabel lblCantidadIntentos;
    private JLabel lblNumeroIntentos;
    private JLabel lblCantidadFallos;
    private JLabel lblNumeroFallos;

    private JButton btnReiniciarJuego;
    private Container masterPanel;

    public ResultadosPartida(Jugador jugador, Tablero tablero) {
        this.jugador = jugador;
        this.tablero = tablero;
        initComponents();
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Resultados");
    }

    private void initComponents() {

        lblNombre = new JLabel(jugador.getNombre() + ", estos son los resultados de la partida:");
        lblCantidadFiguras = new JLabel("Figuras mostradas:");
        lblNumeroFiguras = new JLabel(tablero.getFiguras() + "");
        lblCantidadIntentos = new JLabel("Cantidad de Aciertos:");
        lblNumeroIntentos = new JLabel(tablero.getAciertos() + "");
        lblCantidadFallos = new JLabel("Cantidad de fallos:");
        lblNumeroFallos = new JLabel(tablero.getFallos() + "");

        btnReiniciarJuego = new JButton("Reiniciar Juego");

        masterPanel = getContentPane();
        masterPanel.setLayout(null);

        button_events be = new button_events();
        btnReiniciarJuego.addActionListener(be);

        masterPanel.add(lblNombre);
        masterPanel.add(lblCantidadFiguras);
        masterPanel.add(lblNumeroFiguras);
        masterPanel.add(lblCantidadIntentos);
        masterPanel.add(lblNumeroIntentos);
        masterPanel.add(lblCantidadFallos);
        masterPanel.add(lblNumeroFallos);

        masterPanel.add(btnReiniciarJuego);

        lblNombre.setBounds(106, 30, 250, 20);

        lblCantidadFiguras.setBounds(106, 30, 250, 60);
        lblNumeroFiguras.setBounds(246, 30, 250, 60);
        lblCantidadIntentos.setBounds(106, 100, 250, 60);
        lblNumeroIntentos.setBounds(246, 100, 250, 60);
        lblCantidadFallos.setBounds(106, 170, 250, 60);
        lblNumeroFallos.setBounds(246, 170, 250, 60);

        btnReiniciarJuego.setBounds(215, 230, 130, 60);

    }

    private class button_events implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnReiniciarJuego) {
                // System.out.println("Reiniciar Juego");
                VentanaTamanio ventana = new VentanaTamanio();
                dispose();
            }
        }
    }

}
