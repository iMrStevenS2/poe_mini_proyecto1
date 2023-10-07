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
// import javax.swing.JTextField;
import java.awt.Container;

public class ResultadosPartida extends JFrame {

    private JLabel lblNombre;
    private JLabel lblCantidadFiguras;
    private JLabel lblNumeroFiguras;
    private JLabel lblCantidadIntentos;
    private JLabel lblNumeroIntentos;
    private JLabel lblCantidadFallos;
    private JLabel lblNumeroFallos;

    private JButton btnReiniciarJuego;
    private Container masterPanel;

    public ResultadosPartida() {
        initComponents();
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Resultados");
    }

    private void initComponents() {

        lblNombre = new JLabel("Nombre del jugador");
        lblCantidadFiguras = new JLabel("Cantidad de figuras");
        lblNumeroFiguras = new JLabel("# Figuras");
        lblCantidadIntentos = new JLabel("Cantidad de intentos");
        lblNumeroIntentos = new JLabel("# Intentos");
        lblCantidadFallos = new JLabel("Cantidad de fallos");
        lblNumeroFallos = new JLabel("# Fallos");

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

        lblNombre.setBounds(106, 30, 180, 20);

        lblCantidadFiguras.setBounds(106, 30, 130, 60);
        lblNumeroFiguras.setBounds(246, 30, 130, 60);
        lblCantidadIntentos.setBounds(106, 100, 130, 60);
        lblNumeroIntentos.setBounds(246, 100, 130, 60);
        lblCantidadFallos.setBounds(106, 170, 130, 60);
        lblNumeroFallos.setBounds(246, 170, 130, 60);

        btnReiniciarJuego.setBounds(215, 230, 130, 60);

    }

    private class button_events implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnReiniciarJuego) {
                System.out.println("Reiniciar Juego");
                VentanaTamanio ventana = new VentanaTamanio();
                dispose();
            }
        }
    }

}
