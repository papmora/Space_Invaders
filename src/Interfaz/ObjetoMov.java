package Interfaz;
import java.awt.image.BufferedImage;

abstract class ObjetoMov extends ObjetoJuego{

    Coordenadas velocidad;
    private double maxVel;
    private int width;
    private int height;


    ObjetoMov(Coordenadas posicion, Coordenadas velocidad, double maxVel, BufferedImage textura, EstadoJuego estadoJuego) {
        super(posicion, textura,estadoJuego);
        this.velocidad = velocidad;
        this.maxVel = maxVel;
        width = textura.getWidth();
        height = textura.getHeight();


    }

}
