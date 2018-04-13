package ADT;

import Interfaz.Enemigo;

/**
 * Clase Lista Doble Enlazada, permite crear listas
 *
 * @author pablo
 * @version 9.4.2018
 */


public class ListaDobleEnlazada extends ListaEnlazada {
    private int tamaño;
    private Nodo cola;
    private Nodo cabeza;


    /**
     * Constructor de la clase
     */
    public ListaDobleEnlazada() {

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
        Nodo temp=new Nodo(enem);
        if(this.cabeza==null){
            this.cabeza=temp;
            this.cabeza.setSiguiente(null);
            this.cabeza.setAnterior(null);
            this.cola=this.cabeza;

        }
        else {

            this.cola.setSiguiente(temp);
            temp.setAnterior(this.cola);
            temp.setSiguiente(null);
            this.cola=temp;
        }
        tamaño++;

    }

    /**
     * Metodo para eliminar nodo con indice
     *
     * *@param index
     */

    public void eliminar (Enemigo enem) {
        Nodo actual;
        Nodo atras;
        actual=this.cabeza;
        atras=null;
        while (actual != null){
            if (actual.getEnemigo()==enem){
                this.cabeza=this.cabeza.getSiguiente();
                this.cabeza.setAnterior(null);

            }
            else {
                atras.setAnterior(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
        }
        atras=actual;
        actual=actual.getSiguiente();
        tamaño--;
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


