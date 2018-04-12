package ADT;

import Interfaz.Enemigo;

/**
 *Clase Nodo
 * @author pablo
 * @version 9.4.2018
 *
 */

public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private Enemigo enemigo;

    /**
     * Constructor de la clase Nodo
     *
     * "@param enemigo
     *
     */

    Nodo(Enemigo enemigo) {
        this.siguiente = null;
        this.anterior = null;
        this.enemigo = enemigo;

    }


    /**
     * Metodo que enlaza un nodo a otro
     *
     * "@param n"
     */
    void setSiguiente(Nodo n) {
        this.siguiente = n;
    }


    /**
     * Metodo que retorna el nodo siguiente
     *
     * @return nodo siguiente
     */
    public Nodo getSiguiente() {
        return this.siguiente;
    }


    /**
     * Metodo que enlaza un nodo al anterior
     * "@param n"
     */
    public void setAnterior(Nodo n) {
        this.siguiente = n;
    }


    /**
     * Metodo que retorna nodo anterior
     *
     * @return nodo anterior
     */
    public Nodo getAnterior() {
        return this.siguiente;
    }

    /**
     * Metodo que retorna enemigo dentro del nodo
     *
     * @return enemigo
     */

    public Enemigo getEnemigo() {
        return enemigo;
    }

}


