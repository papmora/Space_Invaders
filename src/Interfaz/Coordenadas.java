package Interfaz;

/**
 * Clase Coordenadas que nos permite dar posicion a los objetos
 *
 * @author pablo
 * @version 9.4.2018
 */

class Coordenadas {

    private double px;
    private double py;



    /**
     * Constructor que nos permite dar coordenadas a objetos
     *
     * *@param x
     * *@param y
     */

    Coordenadas(double x, double y){
        this.px=x;
        this.py=y;

    }

    /**
     * Constructor que nos permite dar una nueva coordenada
     *
     * *@param nueva
     */

    Coordenadas(Coordenadas nueva){
        this.px=nueva.px;
        this.py=nueva.py ;
    }

    /**
     * Metodo que nos permite añadir una coordenada nueva al objeto para que este se pueda mover
     *
     * *@param v
     * @return la nueva coordenada luego de ser sumada
     */

    Coordenadas add(Coordenadas v){
        return new Coordenadas(px+v.getPx(),py+v.getPy());
    }


    /**
     * Metodo que nos permite multiplicar las coordenas por una constante para dar velocidad al objeto
     * *@param valor
     * @return las coordenadas luego de ser multiplicadas por la constante
     */
    Coordenadas n_escala(double valor){
        return new Coordenadas(px*valor,py*valor);
    }

    /**
     * Metodos getter y setter de las posiciones en X y en Y
     * @return px o py
     */

    double getPx() {
        return px;
    }

    void setPx(double px) {
        this.px = px;
    }

    double getPy() {
        return py;
    }

    void setPy(double py) {
        this.py = py;
    }


}


