package Interfaz;


import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Clase Enemigo, nos permite crear objetos de tipo enemigo
 *
 * @author pablo
 * @version 9.4.2018
 */

public class Enemigo extends ObjetoMov{
    int valor;

    /**
     * Constructor de la clase
     * *@param posicion
     * *@param velocidad
     * *@param maxVel
     * *@param textura
     * *@param estadoJuego
     * *@param valor
     */

    Enemigo(Coordenadas posicion, Coordenadas velocidad, double maxVel, BufferedImage textura, EstadoJuego estadoJuego,int valor) {
        super(posicion, velocidad, maxVel, textura, estadoJuego);
        this.velocidad=velocidad.n_escala(maxVel);
        this.valor=valor;

    }

    public int getValor() {
        return valor;
    }

    /**
     * Metodo de la clase ObjetoMov que actualiza el objeto
     */

    @Override
    public void actualizar() {
        posicion = posicion.add(velocidad);
    }

    /**
     * Metodo de la clase ObjetoMov que dibuja el objeto
     */

    @Override
    public void dibujar(Graphics g) {
        g.drawImage(textura,(int)posicion.getPx(),(int)posicion.getPy(),null);

    }
}
