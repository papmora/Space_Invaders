package ADT;

import Interfaz.Enemigo;

/**
 * Clase Lista Enlazada, permite crear listas
 *
 * @author pablo
 * @version 9.4.2018
 */
public class ListaEnlazada {
    private int tamaño;
    private Nodo cola;
    private Nodo cabeza;


    /**
     * Constructor de la clase
     */
    public ListaEnlazada() {

        this.cola = null;
        this.cabeza = null;
    }



    /**
     * Metodo para ver si lista está vacía
     *
     * @return true si la cabeza es null , en caso contrario devuelve false
     */
    private boolean isEmpty() {
        return this.cabeza == null;
    }





    /**
     * añade un nuevo nodo a la lista
     *
     * *@param enem nodo a añadir
     */
    public void añadir(Enemigo enem) {
        Nodo temp;
        if (isEmpty()) {
            temp=new Nodo(enem);
            this.cabeza = this.cola = temp;
        }
        else {
            temp=new Nodo(enem);
            this.cola.setSiguiente(temp);
            this.cola=temp;

            }
        tamaño++;
    }

    /**
     * Metodo para eliminar nodo con indice
     *
     * *@param index
     */

    public void eliminar (int index){

        if (index==0){
            this.cabeza=cabeza.getSiguiente();
        }
        else {
            int contador = 0;
            Nodo temp = this.cabeza;
            while (contador < index - 1) {
                temp.getSiguiente();
                contador++;

            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
        }
        tamaño--;
    }

    public void eliminar_lista(){
        cabeza=null;
        cola=null;
        tamaño=0;
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