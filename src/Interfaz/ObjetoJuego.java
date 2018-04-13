package Interfaz;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Clase abstracta que describe un objeto del juego
 * @author pablo
 * @version 9.4.2018
 */

public abstract class ObjetoJuego{

    EstadoJuego estadoJuego;

    BufferedImage textura;
    public Coordenadas posicion;
    int width;
    int height;

    /**
     * Constructor de la clase
     * *@param posicion
     * *@param textura
     * *@param estadoJuego
     */

    ObjetoJuego(Coordenadas posicion, BufferedImage textura, EstadoJuego estadoJuego){
        this.posicion= posicion;
        this.textura=textura;
        this.estadoJuego=estadoJuego;
        width=textura.getWidth();
        height=textura.getHeight();

    }

    /**
     * Metodos abstractos que actualizan y dibujan el objeto
     */

    public abstract void actualizar();

    public abstract void dibujar(Graphics g);

    /**
     * Metodo que nos permite tener el centro del objeto dibujado
     * @return centro del objeto
     */



    protected Coordenadas centro(){

        return new Coordenadas(posicion.getPx() + width/2,posicion.getPy()+height/2);
    }




}
