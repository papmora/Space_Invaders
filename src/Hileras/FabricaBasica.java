package Hileras;

public class FabricaBasica implements NHilera {

    @Override
    public Hilera crearHilera() {
        Basica basica=new Basica();
        basica.actualizar();
        basica.dibujar();
        return basica;
    }
}
