/**
 * 
 *      @author Steven Bernal Ortiz - 1942208
 * Profesor: LUIS JOHANY ROMO PORTILLA
 * 
 */
package Vista;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaInstrucciones extends JFrame {

    private JTextArea txtAreaInstrucciones;
    private JButton btnRegresar;
    private Container masterPanel;

    public VentanaInstrucciones() {
        initComponents();
        setResizable(false);
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Instrucciones");
        // setBackground(new Color(0, 0, 0, 0));

    }

    private void initComponents() {
        Font font = new Font("Verdana", Font.BOLD, 32);
        txtAreaInstrucciones = new JTextArea(
                "Mira Primer la figura qué se encuentra a la izquierda, y luego escoge cuál de las tres opciones qué te damos tiene el mismo tamaño.");
        txtAreaInstrucciones.setFont(font);
        JScrollPane scrollPane = new JScrollPane(txtAreaInstrucciones);
        txtAreaInstrucciones.setEditable(false);
        txtAreaInstrucciones.setLineWrap(true);
        txtAreaInstrucciones.setWrapStyleWord(true);
        txtAreaInstrucciones.setBorder(null);
        scrollPane.setBorder(null);

        btnRegresar = new JButton("Regresar");

        masterPanel = getContentPane();
        masterPanel.setBackground(Color.WHITE);
        masterPanel.setLayout(null);

        button_events be = new button_events();
        btnRegresar.addActionListener(be);

        masterPanel.add(scrollPane);
        masterPanel.add(btnRegresar);

        scrollPane.setBounds(50, 50, 450, 300);
        btnRegresar.setBounds(215, 360, 130, 30);

    }

    private class button_events implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnRegresar) {
                // System.out.println("Regresar");
                VentanaTamanio ventana = new VentanaTamanio();
                dispose();
            }
        }
    }
}
