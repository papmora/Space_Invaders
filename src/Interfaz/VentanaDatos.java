package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase de la ventana con los datos de marcadores
 *
 * @author pablo
 * @version 9.4.2018
 */

public class VentanaDatos extends JFrame {

    private Facade facade=new Facade();

    /**
     * Constructor de la clase
     */

    VentanaDatos(){

        super();
        configVentanaDatos();
        initVentanaDatos();


    }

    /**
     * Metodo que configura los valores de la ventana
     */

    private void configVentanaDatos(){

        this.setTitle("Datos");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Metodo que inicializa los valores de la ventana
     */

    private void initVentanaDatos(){

        // creamos los componentes
        JLabel titulo = new JLabel();
        JButton boton = new JButton();

        // configuramos los componentes
        titulo.setText("Marcadores");                                // colocamos un texto a la etiqueta
        titulo.setFont(new Font("Serif", Font.BOLD, 40));
        titulo.setBounds(200, 50, 400, 100);        // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        boton.setText("Menu");                                       // colocamos un texto al boton
        boton.setBounds(50, 300, 200, 100);        // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                facade.cambio("menu");

            }
        });                                  // hacemos que el boton tenga una accion

        // adicionamos los componentes a la ventana
        this.add(titulo);
        this.add(boton);
    }






}


