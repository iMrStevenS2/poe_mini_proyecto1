package Vista;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaInstrucciones extends JFrame {

    private JTextArea txtAreaInstrucciones;
    private JButton btnRegresar;
    private Container masterPanel;

    public VentanaInstrucciones() {
        initComponents();
        setSize(550, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Instrucciones");
    }

    private void initComponents() {
        txtAreaInstrucciones = new JTextArea(
                "Proident aliquip ullamco amet ipsum ea eiusmod et est id excepteur minim. Veniam mollit et laborum pariatur eu sint eiusmod labore sit voluptate duis. Aute commodo tempor elit magna fugiat tempor mollit reprehenderit consequat. Non ipsum laborum Lorem quis veniam minim labore dolor magna. Culpa laborum pariatur ipsum ex consectetur voluptate. Sint eu ad excepteur fugiat ullamco nisi mollit nisi. Irure magna pariatur eiusmod amet Lorem proident non anim aliquip.");
        JScrollPane scrollPane = new JScrollPane(txtAreaInstrucciones);
        txtAreaInstrucciones.setEditable(false);
        txtAreaInstrucciones.setLineWrap(true);

        btnRegresar = new JButton("Regresar");

        masterPanel = getContentPane();
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
                System.out.println("Regresar");
                VentanaTamanio ventana = new VentanaTamanio();
                dispose();
            }
        }
    }
}
