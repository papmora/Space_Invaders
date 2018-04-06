package Interfaz;


import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferStrategy;


class VentanaJuego extends JFrame implements Runnable{


    private Canvas canvas;



    private Thread thread;
    private boolean jugando=false;

    private BufferStrategy bs;
    private Graphics g;

    private final int FPS=60;
    private double Tobjetivo= 1000000000/FPS;
    private double delta=0;
    private int FPS_promedio=FPS;

    private EstadoJuego estadoJuego;

    private Tec teclado;



    VentanaJuego() {



        setTitle("Juego");                                         // colocamos titulo a la ventana
        setSize(Constantes.WIDTH, Constantes.HEIGHT);                            // colocamos tamanio a la ventana (ancho, alto)

        setLocationRelativeTo(null);                              // centramos la ventana en la pantalla
        //setLayout(null);                                         // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        setResizable(false);                                    // hacemos que la ventana no sea redimiensionable
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // hacemos que cuando se cierre la ventana termina todo proceso


        canvas = new Canvas();
        teclado=new Tec();

        canvas.setPreferredSize(new Dimension(Constantes.WIDTH, Constantes.HEIGHT));
        canvas.setMaximumSize(new Dimension(Constantes.WIDTH, Constantes.HEIGHT));
        canvas.setMinimumSize(new Dimension(Constantes.WIDTH, Constantes.HEIGHT));
        canvas.setFocusable(true);

        add(canvas);
        canvas.addKeyListener(teclado);


    }

    private void init(){

        Multimedia.init();
        estadoJuego=new EstadoJuego();

    }

    private void actualizar(){

        estadoJuego.actualizar();
        teclado.actualizar();

    }

    private void dibujar(){

        bs=canvas.getBufferStrategy();

        if(bs == null)
        {
            canvas.createBufferStrategy(3);
            return;
        }

        g=bs.getDrawGraphics();

        //-----------------------
        //dibujo
        g.setColor(Color.black);

        g.fillRect(0, 0, Constantes.WIDTH, Constantes.HEIGHT);

        estadoJuego.dibujar(g);

        g.drawString(""+FPS_promedio, 10, 20);
        //-----------------------


        g.dispose();
        bs.show();

    }




    @Override
    public void run() {

        long tahora;
        long tultimo= System.nanoTime();
        int fotogramas = 0;
        long tiempo = 0;

        init();


        while(jugando){

            tahora=System.nanoTime();
            delta+= (tahora-tultimo)/Tobjetivo;
            tiempo+=(tahora-tultimo);
            tultimo=tahora;

            if(delta >= 1){
                actualizar();
                dibujar();
                delta--;
                fotogramas++;

            }

            if (tiempo >= 1000000000){

                FPS_promedio=fotogramas;
                fotogramas=0;
                tiempo=0;

            }



        }
        stop();

    }

    void start(){

        thread=new Thread(this);
        thread.start();
        jugando=true;


    }

    private void stop(){

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




