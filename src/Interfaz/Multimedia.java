package Interfaz;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Clase Multimidia, nos permite almacenar los archivos multimedias ya cargados
 * @author pablo
 * @version 9.4.2018
 */

public class Multimedia {

    public static BufferedImage jugador;
    public static BufferedImage alien1;
    static BufferedImage disparo;

    static Font fuente;

    /**
     * Metodo que carga y almacena los archivos multimedia
     */

    static void init(){

        jugador = Cargar.CargarImagen("/multi/player.png");
        disparo= Cargar.CargarImagen("/multi/laserB.png");
        alien1=Cargar.CargarImagen("/multi/icon4.png");

        fuente=Cargar.CargarFuente("/multi/font.ttf",40);


    }



}
