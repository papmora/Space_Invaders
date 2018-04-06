package Interfaz;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemigo extends ObjetoMov{


    Enemigo(Coordenadas posicion, Coordenadas velocidad, double maxVel, BufferedImage textura, EstadoJuego estadoJuego) {
        super(posicion, velocidad, maxVel, textura, estadoJuego);
        this.velocidad=velocidad.n_escala(maxVel);
    }

    @Override
    public void actualizar() {
        posicion=posicion.nueva(velocidad);

        if (posicion.getPx()<0){
            posicion.setPx(0);
            posicion.setPy(posicion.getPy()+15);
            velocidad.setPx(Constantes.E_MAX_V*1);



        }
        if (posicion.getPx()>Constantes.WIDTH-50){

            posicion.setPx(Constantes.WIDTH-50);
            posicion.setPy(posicion.getPy()+15);
            velocidad.setPx(Constantes.E_MAX_V*-1);

        }

    }

    @Override
    public void dibujar(Graphics g) {
        g.drawImage(textura,(int)posicion.getPx(),(int)posicion.getPy(),null);

    }
}
