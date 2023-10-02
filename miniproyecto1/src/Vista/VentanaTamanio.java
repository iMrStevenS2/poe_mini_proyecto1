package Vista;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;

public class VentanaTamanio extends JFrame {

    private JLabel lblPrueba;
    private Container masterPanel;

    public VentanaTamanio() {
        initComponents();
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tamaños");
    }

    private void initComponents () {
        lblPrueba = new JLabel("Prueba 1, Interfaz Juego Tamaños");
        masterPanel = getContentPane();
        masterPanel.setLayout(new GridLayout(3,4));

        masterPanel.add(lblPrueba);

    }

}
