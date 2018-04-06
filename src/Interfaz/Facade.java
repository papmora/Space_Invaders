package Interfaz;

public class Facade {


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

