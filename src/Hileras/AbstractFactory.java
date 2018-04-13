package Hileras;


import java.awt.*;

public class AbstractFactory {

    FabricaBasica basica=new FabricaBasica();

    public AbstractFactory(int x,Graphics g) {

        switch (x)
        {
            case 1:FabricaHilera.CrearFHilera(basica, g);
                break;

        }

    }

}

