package Interfaz;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Jugador extends ObjetoJuego {


    private Coordenadas pico;

    private Cronometro disparo;

    Jugador(Coordenadas posicion, BufferedImage textura,EstadoJuego estadoJuego) {

        super(posicion, textura,estadoJuego);
        pico=new Coordenadas(0,-1);
        disparo = new Cronometro();
    }

    @Override
    public void actualizar() {



        if (Tec.Derecha){
            posicion.setPx(posicion.getPx()+2);
        }

        if(Tec.Izquierda){
            posicion.setPx(posicion.getPx()-2);
        }

        if (Tec.Bala && !disparo.Funcionando()){
            estadoJuego.getObjetoJuegos().add(0,new Bala(
                    centro().nueva(pico.n_escala(width)),
                    pico,
                    Constantes.B_MAX_V,
                    Multimedia.disparo,estadoJuego));

            disparo.corriendo(Constantes.TIROS);


        }

        if (posicion.getPx()<0){
            posicion.setPx(0);

        }
        if (posicion.getPx()>Constantes.WIDTH-50){

            posicion.setPx(Constantes.WIDTH-50);

        }

        disparo.actualizar();


    }

    @Override
    public void dibujar(Graphics g) {

        g.drawImage(textura,(int)posicion.getPx(),(int)posicion.getPy(),null);

    }

    private Coordenadas centro(){
        return new Coordenadas(posicion.getPx() + width/2,posicion.getPy()+height/2);
    }


}


