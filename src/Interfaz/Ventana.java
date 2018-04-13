package Interfaz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase de la Ventana principal
 *
 * @author pablo
 * @version 9.4.2018
 */

class Ventana extends JFrame{


    private Facade facade =new Facade();

    /**
     * Constructor de la clase
     */

    Ventana() {

        super();
        configVentana();
        initVentana();


    }

    /**
     * Metodo que configura los valores de la ventana
     */

    private void configVentana() {

        this.setTitle("Menu");                   // colocamos titulo a la ventana
        //this.setIconImage(new ImageIcon(getClass().getResource("multi/icon.png")).getImage());
        this.setSize(800, 600);                     // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   // hacemos que cuando se cierre la ventana termina todo proceso
    }

    /**
     * Metodo que inicializa los valores de la ventana
     */

    private void initVentana() {

        // creamos los componentes
        JLabel titulo = new JLabel();
        JButton Dboton = new JButton();
        JButton Jboton = new JButton();


        // configuramos los componentes
        titulo.setText("Space Invaders");                        // colocamos un texto a la etiqueta
        titulo.setFont(Multimedia.fuente);
        titulo.setBounds(225, 50, 400, 100);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        Dboton.setText("Marcadores");                                    // colocamos un texto al Dboton
        Dboton.setBounds(550, 300, 200, 100);      // colocamos posicion y tamanio al Dboton (x, y, ancho, alto)
        Dboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                facade.cambio("datos");


            }
        });                                                        // hacemos que el Dboton tenga una accion




        Jboton.setText("Jugar");                                    // colocamos un texto al Dboton
        Jboton.setBounds(50, 300, 200, 100);      // colocamos posicion y tamanio al Dboton (x, y, ancho, alto)
        Jboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                facade.cambio("juego");

            }
        });                                                         // hacemos que el Dboton tenga una accion


        // adicionamos los componentes a la ventana
        this.add(titulo);
        this.add(Dboton);
        this.add(Jboton);

    }




}
