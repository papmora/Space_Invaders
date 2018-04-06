package Interfaz;

import ADT.ListaEnlazada;

public class Fabrica_Enemigos  {

    private ListaEnlazada lista=new ListaEnlazada();
    private Enemigo enemigo1;
    private Enemigo enemigo2;

    private EstadoJuego estadoJuego;


    public Fabrica_Enemigos() {


        enemigo1 = new Enemigo(new Coordenadas(100, 100), new Coordenadas(1, 0),
                Constantes.E_MAX_V, Multimedia.jugador, estadoJuego);
        enemigo2 = new Enemigo(new Coordenadas(200, 100), new Coordenadas(0, 0),
                Constantes.E_MAX_V, Multimedia.jugador, estadoJuego);

        lista.añadir(enemigo1);
        lista.añadir(enemigo2);

    }



    public ListaEnlazada getLista() {
        return lista;
    }

}
