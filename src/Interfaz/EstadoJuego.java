package Interfaz;


import ADT.Nodo;

import java.awt.*;
import java.util.ArrayList;


/**
 * Clase EstadoJuego, nos permite crear, actualizar y dibujar todo en un mismo lugar
 *
 * @author pablo
 * @version 9.4.2018
 */


class EstadoJuego {

    private int marcador=0;

    private Fabrica_Enemigos fabrica_enemigos;

    private Jugador jugador;
    private ArrayList<ObjetoJuego> objetoJuegos= new ArrayList<ObjetoJuego>();

    /**
     * Constructor de la clase
      */

    EstadoJuego()
    {
        jugador = new Jugador(new Coordenadas(350, 600), Multimedia.jugador,this);
        objetoJuegos.add(jugador);

        fabrica_enemigos=new Fabrica_Enemigos();



    }

    /**
     * Metodo que nos permite ir aumentando el marcador
     * *@param valor
     */

    private void add_marcador(int valor){

        marcador+=valor;
    }

    /**
     * Metodo getter del marcador
     * @return marcador
     */

    int getMarcador() {
        return marcador;
    }


    /**
     * Metodo para actualizar la clase
     */

    void actualizar()
    {

        for (int i=0;i<objetoJuegos.size();i++) {
            objetoJuegos.get(i).actualizar();
        }

        fabrica_enemigos.actualizar();
         impacto();



    }

    /**
     * Metodo para dibujar la clase
     * *@param g
     */

    void dibujar(Graphics g) {

        for (int i=0;i<objetoJuegos.size();i++) {
            objetoJuegos.get(i).dibujar(g);
        }

        fabrica_enemigos.dibujar(g);

    }

    /**
     * Metodo getter de array que guarda las balas
     * @return array
     */
    ArrayList<ObjetoJuego> getObjetoJuegos() {
        return objetoJuegos;
    }


    /**
     * Metodo impacto, que nos permite determinar colicion entre las balas y los enemigos para
     * eliminarlos
     */


    private void impacto() {


        ArrayList<ObjetoJuego> objetoJuegos = getObjetoJuegos();
        Nodo temp = fabrica_enemigos.getLista().getCabeza();
        int contador=0;
        while (temp!=null) {


            double ex = temp.getEnemigo().posicion.getPx();
            double ey = temp.getEnemigo().posicion.getPy();
            double e_width = temp.getEnemigo().width;
            double e_height = temp.getEnemigo().height;






            for (int j = 0; j < objetoJuegos.size(); j++) {
                double bx = objetoJuegos.get(j).posicion.getPx();
                double by = objetoJuegos.get(j).posicion.getPy();
                double b_width = objetoJuegos.get(j).width;
                double b_height = objetoJuegos.get(j).height;

                if (ex < bx + b_width && ex + e_width > bx
                        && ey < by + b_height && ey + e_height > by) {
                    System.out.println("Killing");
                    objetoJuegos.remove(j);
                    fabrica_enemigos.getLista().eliminar(contador);
                    add_marcador(temp.getEnemigo().getValor());



                }


            }
            contador++;
            temp=temp.getSiguiente();



        }

    }




}
