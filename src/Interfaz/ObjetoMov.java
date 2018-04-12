package Interfaz;


import java.awt.image.BufferedImage;

/**
 * Clase abstracta que describe un objeto movible
 * @author pablo
 * @version 9.4.2018
 */

abstract class ObjetoMov extends ObjetoJuego {

    Coordenadas velocidad;
    private double maxVel;
    int width;
    int height;

    /**
     * Constructor de la clase
     *
     * *@param posicion
     * *@param velocidad
     * *@param maxVel
     * *@param textura
     * *@param estadoJuego
     */


    ObjetoMov(Coordenadas posicion, Coordenadas velocidad, double maxVel, BufferedImage textura, EstadoJuego estadoJuego) {
        super(posicion, textura, estadoJuego);
        this.velocidad = velocidad;
        this.maxVel = maxVel;
        width = textura.getWidth();
        height = textura.getHeight();


    }







}
