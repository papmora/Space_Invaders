package Interfaz;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class ObjetoJuego{

    EstadoJuego estadoJuego;

    BufferedImage textura;
    Coordenadas posicion;
    int width;
    int height;

    ObjetoJuego(Coordenadas posicion, BufferedImage textura, EstadoJuego estadoJuego){
        this.posicion= posicion;
        this.textura=textura;
        this.estadoJuego=estadoJuego;
        width=textura.getWidth();
        height=textura.getHeight();

    }

    public abstract void actualizar();

    public abstract void dibujar(Graphics g);

    public Coordenadas getPosicion() {
        return posicion;
    }

    public void setPosicion(Coordenadas posicion) {
        this.posicion = posicion;
    }
}
