/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 *      @author Steven Bernal Ortiz - 1942208
 * Profesor: LUIS JOHANY ROMO PORTILLA
 * 
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;

public class Juego extends JFrame {

    private JLabel lblNombre;
    private JLabel lblCantidadFiguras;
    private JLabel lblNumeroFiguras;
    private JLabel lblCantidadIntentos;
    private JLabel lblNumeroIntentos;
    private JLabel lblCantidadFallos;
    private JLabel lblNumeroFallos;
    private JTextField txtNombre;
    private JButton btnImagenPrincipal;
    private JButton btnImagen1;
    private JButton btnImagen2;
    private JButton btnImagen3;
    private JButton btnTerminarJuego;
    private Container masterPanel;

    public Juego() {
        initComponents();
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tamaños");
    }

    private void initComponents() {
        lblNombre = new JLabel("Nombre del jugador");
        lblCantidadFiguras = new JLabel("Cantidad de figuras");
        lblNumeroFiguras = new JLabel("# Figuras");
        lblCantidadIntentos = new JLabel("Cantidad de intentos");
        lblNumeroIntentos = new JLabel("# Intentos");
        lblCantidadFallos = new JLabel("Cantidad de fallos");
        lblNumeroFallos = new JLabel("# Fallos");
        txtNombre = new JTextField(15);
        btnImagenPrincipal = new JButton("Imagen Principal");
        btnImagen1 = new JButton("Imagen 1");
        btnImagen2 = new JButton("Imagen 2");
        btnImagen3 = new JButton("Imagen 3");
        btnTerminarJuego = new JButton("Terminar Juego");

        masterPanel = getContentPane();
        masterPanel.setLayout(null);

        button_events be = new button_events();
        btnImagenPrincipal.addActionListener(be);
        btnImagen1.addActionListener(be);
        btnImagen2.addActionListener(be);
        btnImagen3.addActionListener(be);
        btnTerminarJuego.addActionListener(be);

        masterPanel.add(lblNombre);
        masterPanel.add(lblCantidadFiguras);

        masterPanel.add(lblCantidadIntentos);
        masterPanel.add(lblCantidadFallos);
        masterPanel.add(txtNombre);
        masterPanel.add(btnImagenPrincipal);
        masterPanel.add(btnImagen1);
        masterPanel.add(btnImagen2);
        masterPanel.add(btnImagen3);
        masterPanel.add(btnTerminarJuego);

        lblNombre.setBounds(10, 10, 120, 20);
        lblCantidadFiguras.setBounds(10, 40, 120, 20);
        lblCantidadIntentos.setBounds(10, 70, 120, 20);
        lblCantidadFallos.setBounds(10, 100, 120, 20);
        txtNombre.setBounds(10, 130, 120, 20);
        btnImagenPrincipal.setBounds(10, 160, 120, 20);
        btnImagen1.setBounds(10, 190, 120, 20);
        btnImagen2.setBounds(10, 220, 120, 20);
        btnImagen3.setBounds(10, 250, 120, 20);
        btnTerminarJuego.setBounds(10, 280, 120, 20);

    }

    private class button_events implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnImagenPrincipal) {
                System.out.println("Imagen Principal");
            } else if (e.getSource() == btnImagen1) {
                System.out.println("Imagen 1");
            } else if (e.getSource() == btnImagen2) {
                System.out.println("Imagen 2");
            } else if (e.getSource() == btnImagen3) {
                System.out.println("Imagen 3");
            } else if (e.getSource() == btnTerminarJuego) {
                System.out.println("Terminar Juego");
            }
        }
    }

}
