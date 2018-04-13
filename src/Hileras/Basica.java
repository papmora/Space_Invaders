package Hileras;

import ADT.ListaEnlazada;
import ADT.Nodo;
import Interfaz.*;

import java.awt.*;

public class Basica implements Hilera {

    private ListaEnlazada lista=new ListaEnlazada();
    private EstadoJuego estadoJuego;

    @Override
    public void crear() {
        Enemigo enemigo1 = new Enemigo(new Coordenadas(100, 100), new Coordenadas(1, 0),
                Constantes.E_MAX_V, Multimedia.jugador,estadoJuego,5);
        Enemigo enemigo2 = new Enemigo(new Coordenadas(enemigo1.posicion.getPx()+100, 100), new Coordenadas(1, 0),
                Constantes.E_MAX_V, Multimedia.jugador, estadoJuego,10);
        Enemigo enemigo3 = new Enemigo(new Coordenadas(enemigo2.posicion.getPx()+100, 100), new Coordenadas(1, 0),
                Constantes.E_MAX_V, Multimedia.jugador, estadoJuego,15);
        Enemigo enemigo4 = new Enemigo(new Coordenadas(enemigo3.posicion.getPx()+100, 100), new Coordenadas(1, 0),
                Constantes.E_MAX_V, Multimedia.jugador, estadoJuego,20);
        Enemigo enemigo5 = new Enemigo(new Coordenadas(enemigo4.posicion.getPx()+100, 100), new Coordenadas(1, 0),
                Constantes.E_MAX_V, Multimedia.jugador, estadoJuego,25);

        lista.añadir(enemigo1);
        lista.añadir(enemigo2);
        lista.añadir(enemigo3);
        lista.añadir(enemigo4);
        lista.añadir(enemigo5);

    }

    public ListaEnlazada getLista() {
        return lista;
    }




    @Override
    public void actualizar() {

        Nodo temp;
        temp=lista.getCabeza();
        while (temp!=null) {
            temp.getEnemigo().actualizar();
            temp = temp.getSiguiente();


            if (lista.getCabeza().getEnemigo().posicion.getPx() > Constantes.WIDTH - 50
                    || lista.getCola().getEnemigo().posicion.getPx() > Constantes.WIDTH - 50) {
                temp = lista.getCabeza();
                while (temp != null) {
                    temp.getEnemigo().posicion.setPx(temp.getEnemigo().posicion.getPx() - 5);
                    temp.getEnemigo().posicion.setPy(temp.getEnemigo().posicion.getPy() + 30);
                    temp.getEnemigo().velocidad.setPx(Constantes.E_MAX_V * -1);
                    temp = temp.getSiguiente();


                }


            }


            if (lista.getCabeza().getEnemigo().posicion.getPx() < 0) {


                temp = lista.getCabeza();
                while (temp != null) {
                    temp.getEnemigo().posicion.setPx(temp.getEnemigo().posicion.getPx() + 5);
                    temp.getEnemigo().posicion.setPy(temp.getEnemigo().posicion.getPy() + 30);
                    temp.getEnemigo().velocidad.setPx(Constantes.E_MAX_V * 1);
                    temp = temp.getSiguiente();

                }


            }
        }




    }



    @Override
    public void dibujar(Graphics g) {

        Nodo temp;
        temp=lista.getCabeza();
        while (temp!=null){
            temp.getEnemigo().dibujar(g);
            temp=temp.getSiguiente();

        }

    }

}

