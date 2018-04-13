package ADT;

import Interfaz.Enemigo;

/**
 * Clase Lista Doble Circular, permite crear listas
 *
 * @author pablo
 * @version 9.4.2018
 */

public class ListaDobleCircular extends ListaEnlazada {

    private int tamaño;
    private Nodo cola;
    private Nodo cabeza;


    /**
     * Constructor de la clase
     */
    public ListaDobleCircular() {

        this.cola = null;
        this.cabeza = null;
    }



    /**
     * Metodo para ver si lista está vacía
     *
     * @return true si la cabeza es null , en caso contrario devuelve false
     */
    public boolean isEmpty() {
        return this.cabeza == null;
    }





    /**
     * añade un nuevo nodo a la lista
     *
     * *@param enem nodo a añadir
     */
    public void añadir(Enemigo enem) {
    }

    /**
     * Metodo para eliminar nodo con indice
     *
     * *@param index
     */

    public void eliminar (int index){

    }


    /**
     * Metodo getter del atributo tamaño
     * @return atributo tamaño
     */

    public int getTamaño() {
        return tamaño;
    }








    /**
     * Metodo getter del atributo cabeza
     *
     * @return atributo cabeza de la lista
     */
    public Nodo getCabeza() {
        return this.cabeza;
    }






    /**
     * Metodo getter del atributo cola
     *
     * @return atributo cola de la lista
     */
    public Nodo getCola() {
        return this.cola;
    }



}
