package Interfaz;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Clase Multimidia, nos permite almacenar los archivos multimedias ya cargados
 * @author pablo
 * @version 9.4.2018
 */

class Multimedia {

    static BufferedImage jugador;
    static BufferedImage disparo;
    static BufferedImage icono;
    static BufferedImage fondo;
    static Font fuente;

    /**
     * Metodo que carga y almacena los archivos multimedia
     */

    static void init(){

        jugador = Cargar.CargarImagen("/multi/player.png");
        disparo= Cargar.CargarImagen("/multi/laserB.png");
        //icono=Cargar.CargarImagen("multi/icon.png");

        fuente=Cargar.CargarFuente("multi/font.ttf",40);


    }



}
