package Interfaz;


import java.awt.Graphics;
import java.util.ArrayList;


class EstadoJuego {

    private Fabrica_Enemigos fabrica_enemigos;

    private Jugador jugador;
    private ArrayList<ObjetoJuego> objetoJuegos= new ArrayList<ObjetoJuego>();

    EstadoJuego()
    {
        jugador = new Jugador(new Coordenadas(350, 550), Multimedia.jugador,this);
        objetoJuegos.add(jugador);

        fabrica_enemigos=new Fabrica_Enemigos();



    }

    void actualizar()
    {

        for (int i=0;i<objetoJuegos.size();i++) {
            objetoJuegos.get(i).actualizar();
        }


        fabrica_enemigos.getLista().getCabeza().getEnemigo().actualizar();




    }

    void dibujar(Graphics g)
    {

        for (int i=0;i<objetoJuegos.size();i++) {
            objetoJuegos.get(i).dibujar(g);
        }


        fabrica_enemigos.getLista().getCabeza().getEnemigo().dibujar(g);





    }

    ArrayList<ObjetoJuego> getObjetoJuegos() {
        return objetoJuegos;
    }


}
