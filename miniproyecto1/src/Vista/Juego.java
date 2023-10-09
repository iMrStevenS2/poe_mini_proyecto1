

/**
 * 
 *      @author Steven Bernal Ortiz - 1942208
 *      @author Jorge Arley Garcia  - 2182588
 * Profesor: LUIS JOHANY ROMO PORTILLA
 * 
 */
package Vista;

import modelo.FiguraGeometrica;
// import modelo;
import modelo.Jugador;
import modelo.Tablero;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;

public class Juego extends JFrame {
    private Jugador jugador;
    private Tablero tablero;
    private FiguraGeometrica figura;
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private FiguraGeometrica figura3;

    private JLabel lblNombre;
    private JLabel lblCantidadFiguras;
    private JLabel lblNumeroFiguras;
    private JLabel lblCantidadIntentos;
    private JLabel lblNumeroIntentos;
    private JLabel lblCantidadFallos;
    private JLabel lblNumeroFallos;
    private JButton btnImagenPrincipal;
    private JButton btnImagen1;
    private JButton btnImagen2;
    private JButton btnImagen3;
    private JButton btnTerminarJuego;
    private Container masterPanel;

    ArrayList<Integer> arrayList = new ArrayList<>();

    public Juego(Jugador jugador) {
        this.jugador = jugador;
        this.tablero = new Tablero();
        this.figura = new FiguraGeometrica();
        this.figura1 = new FiguraGeometrica();
        this.figura2 = new FiguraGeometrica();
        this.figura3 = new FiguraGeometrica();
        initComponents();
        setSize(550, 430);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tamaños");
    }

    private void initComponents() {

        int rand = (int) (Math.random() * 120) + 40;
        int radom1 = (int) (Math.random() * 130) + 50;
        int radom2 = (int) (Math.random() * 140) + 30;

        arrayList.add(rand);
        arrayList.add(radom1);
        arrayList.add(radom2);
        // int[] ArrayList = new int[] { rand, radom1, radom2 };

        lblNombre = new JLabel("Jugador: " + jugador.getNombre());
        lblCantidadFiguras = new JLabel("Cantidad de figuras");
        lblNumeroFiguras = new JLabel(tablero.getFiguras() + "");
        lblCantidadIntentos = new JLabel("Cantidad de Intentos");
        lblNumeroIntentos = new JLabel(tablero.getIntentos() + "");
        lblCantidadFallos = new JLabel("Cantidad de fallos");
        lblNumeroFallos = new JLabel(tablero.getFallos() + "");
        btnImagenPrincipal = new JButton("");
        btnImagen1 = new JButton("");
        btnImagen2 = new JButton("");
        btnImagen3 = new JButton("");
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
        masterPanel.add(lblNumeroFiguras);
        masterPanel.add(lblCantidadIntentos);
        masterPanel.add(lblNumeroIntentos);
        masterPanel.add(lblCantidadFallos);
        masterPanel.add(lblNumeroFallos);
        // masterPanel.add(//);
        masterPanel.add(btnImagenPrincipal);
        masterPanel.add(btnImagen1);
        masterPanel.add(btnImagen2);
        masterPanel.add(btnImagen3);
        masterPanel.add(btnTerminarJuego);

        lblNombre.setBounds(10, 10, 120, 20);
        lblCantidadFiguras.setBounds(10, 40, 120, 20);
        lblNumeroFiguras.setBounds(130, 40, 120, 20);
        lblCantidadIntentos.setBounds(10, 70, 120, 20);
        lblNumeroIntentos.setBounds(130, 70, 120, 20);
        lblCantidadFallos.setBounds(10, 100, 120, 20);
        lblNumeroFallos.setBounds(130, 100, 120, 20);
        // .setBounds(10, 130, 120, 20);
        btnImagenPrincipal.setBounds(10, 160, 120, rand);
        figura.setTamanio(rand);
        btnImagen1.setBounds(140, 160, 120, getRandomNumber(arrayList));
        figura1.setTamanio(btnImagen1.getHeight());
        btnImagen2.setBounds(270, 160, 120, getRandomNumber(arrayList));
        figura2.setTamanio(btnImagen2.getHeight());
        btnImagen3.setBounds(400, 160, 120, getRandomNumber(arrayList));
        figura3.setTamanio(btnImagen3.getHeight());
        btnTerminarJuego.setBounds(210, 350, 120, 20);

    }

    private int getRandomNumber(ArrayList<Integer> array) {
        // // System.out.println(arrayList);
        int rnd = (int) (Math.random() * array.size() + 1);
        // // System.out.println("random number: " + rnd);
        int value = array.get(rnd - 1);
        if (array.size() == 1) {
            // arrayList.remove(rnd - 1);
            // // System.out.println(rnd);
            // // System.out.println(arrayList);
            // // System.out.println("Entró");
            return value;
        } else {
            arrayList.remove(rnd - 1);
            // // System.out.println(rnd);
            // // System.out.println(arrayList);
        }
        return value;
    }

    private class button_events implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == btnImagenPrincipal) {
                // // System.out.println("Imagen Modelo");
                // Juego game = new Juego(jugador);
                // game.tablero.setAciertos(Juego.this.tablero.getAciertos());
                // game.tablero.setFallos(Juego.this.tablero.getFallos());
                // game.tablero.setFiguras(Juego.this.tablero.getFiguras());
                // game.lblNumeroIntentos.setText(String.valueOf(tablero.getAciertos()));
                // game.lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                // game.lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                // dispose();
            } else if (e.getSource() == btnImagen1) {
                // // System.out.println("Imagen 1");
                if (esSeleccionCorrecta(figura.getTamanio(), figura1.getTamanio())) {
                    // // // System.out.println("Correcto");
                    tablero.setAciertos(tablero.getAciertos() + 1);
                    tablero.setIntentos(tablero.getIntentos() + 1);
                    lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));
                    tablero.setFiguras(tablero.getFiguras() + 3);
                    lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                    Juego game = new Juego(jugador);
                    game.tablero.setAciertos(Juego.this.tablero.getAciertos());
                    game.tablero.setFallos(Juego.this.tablero.getFallos());
                    game.tablero.setFiguras(Juego.this.tablero.getFiguras());
                    game.tablero.setIntentos(Juego.this.tablero.getIntentos());
                    game.lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));
                    game.lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                    game.lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                    dispose();
                    // // // System.out.println(tablero.getAciertos());
                } else {
                    // // // System.out.println("Incorrecto");
                    tablero.setFallos(tablero.getFallos() + 1);
                    tablero.setIntentos(tablero.getIntentos() + 1);
                    lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));

                    lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                }
            } else if (e.getSource() == btnImagen2) {
                // // System.out.println("Imagen 2");
                if (esSeleccionCorrecta(figura.getTamanio(), figura2.getTamanio())) {
                    // // // System.out.println("Correcto");
                    tablero.setAciertos(tablero.getAciertos() + 1);
                    tablero.setIntentos(tablero.getIntentos() + 1);

                    lblNumeroIntentos.setText(String.valueOf(tablero.getAciertos()));
                    tablero.setFiguras(tablero.getFiguras() + 3);
                    lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                    Juego game = new Juego(jugador);
                    game.tablero.setAciertos(Juego.this.tablero.getAciertos());
                    game.tablero.setFallos(Juego.this.tablero.getFallos());
                    game.tablero.setFiguras(Juego.this.tablero.getFiguras());
                    game.tablero.setIntentos(Juego.this.tablero.getIntentos());
                    game.lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));
                    game.lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                    game.lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                    dispose();

                } else {
                    // // // System.out.println("Incorrecto");
                    tablero.setFallos(tablero.getFallos() + 1);
                    tablero.setIntentos(tablero.getIntentos() + 1);
                    lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));

                    lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                }
            } else if (e.getSource() == btnImagen3) {
                // // // System.out.println("Imagen 3");
                if (esSeleccionCorrecta(figura.getTamanio(), figura3.getTamanio())) {
                    // // // System.out.println("Correcto");
                    tablero.setAciertos(tablero.getAciertos() + 1);
                    tablero.setIntentos(tablero.getIntentos() + 1);

                    lblNumeroIntentos.setText(String.valueOf(tablero.getAciertos()));
                    tablero.setFiguras(tablero.getFiguras() + 3);
                    lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                    Juego game = new Juego(jugador);
                    game.tablero.setAciertos(Juego.this.tablero.getAciertos());
                    game.tablero.setFallos(Juego.this.tablero.getFallos());
                    game.tablero.setFiguras(Juego.this.tablero.getFiguras());
                    game.tablero.setIntentos(Juego.this.tablero.getIntentos());
                    game.lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));
                    game.lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                    game.lblNumeroFiguras.setText(String.valueOf(tablero.getFiguras()));
                    dispose();
                    // // // System.out.println(tablero.getAciertos());

                } else {
                    // // // System.out.println("Incorrecto");
                    tablero.setFallos(tablero.getFallos() + 1);
                    tablero.setIntentos(tablero.getIntentos() + 1);
                    lblNumeroIntentos.setText(String.valueOf(tablero.getIntentos()));
                    lblNumeroFallos.setText(String.valueOf(tablero.getFallos()));
                }
            } else if (e.getSource() == btnTerminarJuego) {
                // // System.out.println("Terminando Juego...");
                ResultadosPartida results = new ResultadosPartida(jugador, tablero);
                dispose();
            }
        }
    }

    private boolean esSeleccionCorrecta(int figura1, int figura2) {
        if (figura1 == figura2) {
            return true;
        } else {
            return false;
        }
    }

}
