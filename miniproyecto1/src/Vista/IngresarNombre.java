

/**
 * 
 *      @author Steven Bernal Ortiz - 1942208
 *      @author Jorge Arley Garcia  - 2182588
 * Profesor: LUIS JOHANY ROMO PORTILLA
 * 
 */
package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import modelo.Jugador;

import java.awt.Container;

public class IngresarNombre extends JFrame {

    private JLabel lblAccion;
    private JTextField txtNombre;
    private JButton btnContinuar;
    private Container masterPanel;

    public IngresarNombre() {
        initComponents();
        setSize(300, 150);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Nombre del jugador");
    }

    private void initComponents() {
        lblAccion = new JLabel("Ingrese su nombre");
        txtNombre = new JTextField(15);
        btnContinuar = new JButton("Continuar");

        // btnContinuar.setEnabled(false);

        masterPanel = getContentPane();
        masterPanel.setLayout(null);

        button_events be = new button_events();
        btnContinuar.addActionListener(be);
        masterPanel.add(lblAccion);
        masterPanel.add(txtNombre);
        masterPanel.add(btnContinuar);

        lblAccion.setBounds(10, 10, 270, 20);
        txtNombre.setBounds(10, 40, 270, 20);
        btnContinuar.setBounds(10, 70, 270, 20);
        if (txtNombre.getText().length() > 0) {
            btnContinuar.setEnabled(true);
        }
    }

    private class button_events implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnContinuar) {
                // System.out.println("Este Boton Funciona");
                Jugador jugador = new Jugador();
                jugador.setNombre(txtNombre.getText());
                Juego game = new Juego(jugador);
                game.setVisible(true);
                dispose();
            }
        }
    }

}
