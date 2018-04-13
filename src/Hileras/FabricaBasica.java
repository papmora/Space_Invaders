package Hileras;

import java.awt.*;

public class FabricaBasica implements NHilera {



    @Override
    public Hilera crearHilera(Graphics g) {
        Basica basica=new Basica();
        basica.actualizar();
        basica.dibujar(g);
        return basica;
    }
}
