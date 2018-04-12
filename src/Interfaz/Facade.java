package Interfaz;

/**
 * Clase Facade, nos permite intercambiar entre las distintas ventanas
 * @author pablo
 * @version 9.4.2018
 */

public class Facade {

    /**
     * Constructor de la clase
     */
    public Facade(){

    }

    public void cambio(String ven){


        switch (ven){
            case "datos":

                VentanaDatos x = new VentanaDatos();
                x.setVisible(true);

                break;

            case "menu":

                Ventana y = new Ventana();
                y.setVisible(true);



                break;

            case "juego":

                VentanaJuego z = new VentanaJuego();
                z.start();
                z.setVisible(true);


                break;
        }
    }
}

