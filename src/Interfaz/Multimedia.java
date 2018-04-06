package Interfaz;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Multimedia {

    static BufferedImage jugador;
    static BufferedImage disparo;
    static BufferedImage icono;
    static BufferedImage fondo;
    static Font fuente;


    static void init(){

        jugador = Cargar.CargarImagen("/multi/player.png");
        disparo= Cargar.CargarImagen("/multi/laserB.png");
        //icono=Cargar.CargarImagen("multi/icon.png");

        fuente=Cargar.CargarFuente("multi/font.ttf",20);


    }



}
