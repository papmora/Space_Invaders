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
        JLabel uno=new JLabel();
        JLabel dos=new JLabel();
        JLabel tres=new JLabel();
        JLabel cuatro=new JLabel();
        JLabel cinco=new JLabel();

        // configuramos los componentes
        uno.setText("1:");
        uno.setFont(new Font("Serif", Font.BOLD, 40));
        uno.setBounds(50, 80, 400, 100);
        dos.setText("2:");
        dos.setFont(new Font("Serif", Font.BOLD, 40));
        dos.setBounds(50, 160, 400, 100);
        tres.setText("3:");
        tres.setFont(new Font("Serif", Font.BOLD, 40));
        tres.setBounds(50, 240, 400, 100);
        cuatro.setText("4:");
        cuatro.setFont(new Font("Serif", Font.BOLD, 40));
        cuatro.setBounds(50, 320, 400, 100);
        cinco.setText("5:");
        cinco.setFont(new Font("Serif", Font.BOLD, 40));
        cinco.setBounds(50, 400, 400, 100);
        titulo.setText("Marcadores");                                // colocamos un texto a la etiqueta
        titulo.setFont(new Font("Serif", Font.BOLD, 40));
        titulo.setBounds(300, 20, 400, 100);        // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        boton.setText("Menu");                                       // colocamos un texto al boton
        boton.setBounds(10, 10, 100, 50);        // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                facade.cambio("menu");

            }
        });                                  // hacemos que el boton tenga una accion

        // adicionamos los componentes a la ventana
        this.add(uno);
        this.add(dos);
        this.add(tres);
        this.add(cuatro);
        this.add(cinco);
        this.add(titulo);
        this.add(boton);
    }






}


