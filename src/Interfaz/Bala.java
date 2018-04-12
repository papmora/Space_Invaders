package Interfaz;

import java.awt.*;

import java.awt.image.BufferedImage;

/**
 * Clase Bala, crea objetos de tipo bala
 *
 * @author pablo
 * @version 9.4.2018
 */
public class Bala extends ObjetoMov{

    /**
     * Constructor de la clase Bala
     * *@param posicion
     * *@param velocidad
     * *@param maxVel
     * *@param textura
     * *@param estadoJuego
     */

    Bala(Coordenadas posicion, Coordenadas velocidad, double maxVel, BufferedImage textura,EstadoJuego estadoJuego) {
        super(posicion, velocidad, maxVel, textura,estadoJuego);
        this.velocidad=velocidad.n_escala(maxVel);
    }

    /**
     * Metodo de la clase ObjetoMov que actualiza el objeto
     */

    @Override
    public void actualizar() {
        posicion=posicion.add(velocidad);
        if (posicion.getPy()<0 || posicion.getPy()>Constantes.HEIGHT){
            estadoJuego.getObjetoJuegos().remove(this);

        }

    }

    /**
     * Metodo de la clase ObjetoMov que dibuja el objeto
     */

    @Override
    public void dibujar(Graphics g) {

        g.drawImage(textura,(int)posicion.getPx(),(int)posicion.getPy(),null);


    }


}
