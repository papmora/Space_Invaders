package Interfaz;

import java.awt.*;

import java.awt.image.BufferedImage;


public class Bala extends ObjetoMov{

    Bala(Coordenadas posicion, Coordenadas velocidad, double maxVel, BufferedImage textura,EstadoJuego estadoJuego) {
        super(posicion, velocidad, maxVel, textura,estadoJuego);
        this.velocidad=velocidad.n_escala(maxVel);
    }

    @Override
    public void actualizar() {
        posicion=posicion.nueva(velocidad);
        if (posicion.getPy()<0 || posicion.getPy()>Constantes.HEIGHT){
            estadoJuego.getObjetoJuegos().remove(this);
        }

    }

    @Override
    public void dibujar(Graphics g) {

        g.drawImage(textura,(int)posicion.getPx(),(int)posicion.getPy(),null);


    }
}
