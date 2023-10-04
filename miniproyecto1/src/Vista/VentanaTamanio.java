package Vista;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;

public class VentanaTamanio extends JFrame {

    private JLabel lblPrueba;
    private JButton btnJugar;
    private JButton btnInstrucciones;
    private JButton btnSalir;
    private Container masterPanel;

    public VentanaTamanio() {
        initComponents();
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tamaños");
    }

    private void initComponents() {
        lblPrueba = new JLabel("Prueba 1, Interfaz Juego Tamaños");
        btnJugar = new JButton("Jugar");
        btnInstrucciones = new JButton("Instrucciones");
        btnSalir = new JButton("Salir");

        masterPanel = getContentPane();
        masterPanel.setLayout(null);

        button_events be = new button_events();
        btnJugar.addActionListener(be);
        btnInstrucciones.addActionListener(be);
        btnSalir.addActionListener(be);

        masterPanel.add(lblPrueba);
        masterPanel.add(btnJugar);
        masterPanel.add(btnInstrucciones);
        masterPanel.add(btnSalir);

        lblPrueba.setBounds(215, 30, 180, 60);
        btnJugar.setBounds(215, 90, 130, 60);
        btnInstrucciones.setBounds(215, 160, 130, 60);
        btnSalir.setBounds(215, 230, 130, 60);

    }

    private class button_events implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnJugar) {
                System.out.println("Jugar");
                Juego juego = new Juego();
                juego.setVisible(true);
                dispose(); // Cierra la ventana actual
            } else if (e.getSource() == btnInstrucciones) {
                System.out.println("Instrucciones");
                VentanaInstrucciones Instrucciones = new VentanaInstrucciones();
                Instrucciones.setVisible(true);
                dispose();
            } else if (e.getSource() == btnSalir) {
                System.out.println("Salir");
                dispose();
            }
        }
    }

}
