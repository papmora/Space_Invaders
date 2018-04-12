package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Clase de la ventana en donde se visualiza el juego
 *
 * @author pablo
 * @version 9.4.2018
 */


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

    /**
     * Constructor de la ventana
     */

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

    /**
     * Metodo que inicializa las clases o metodos en la ventana
     */

    private void init(){

        Multimedia.init();
        estadoJuego=new EstadoJuego();

    }

    /**
     * Metodo que actualiza las clases o metodos en la ventana
     */

    private void actualizar(){

        estadoJuego.actualizar();
        teclado.actualizar();

    }

    /**
     * Metodo que dibuja las clases o metodos en la ventana
     */

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

        g.setColor(Color.black);
        g.drawString(""+FPS_promedio, 10, 20);

        g.setColor(Color.white);
        g.setFont(new Font("serif",Font.BOLD,15));
        g.drawString("Marcador:"+estadoJuego.getMarcador(), 50, 20);

        g.setColor(Color.white);
        g.setFont(new Font("serif",Font.BOLD,15));
        g.drawString("Actual:", 300, 20);

        g.setColor(Color.white);
        g.setFont(new Font("serif",Font.BOLD,15));
        g.drawString("Siguiente:", 550, 20);



        //-----------------------


        g.dispose();
        bs.show();

    }

    /**
     * Metodo que mantiene el juego corriendo
     */


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

    /**
     * Metodo que inicializa el thread del juego
     */

    void start(){

        thread=new Thread(this);
        thread.start();
        jugando=true;


    }

    /**
     * Metodo que para el thread del juego
     */

    private void stop(){

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




