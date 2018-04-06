package ADT;

import Interfaz.Enemigo;

public class ListaEnlazada {
    protected int tamaño;
    protected Nodo cola;
    protected Nodo cabeza;



    public ListaEnlazada() {

        this.cola = null;
        this.cabeza = null;
    }



    /**
     * Devuelve true si la cabeza es null , en casa contrario devuelve false
     *
     * @return
     */
    public boolean isEmpty() {
        return this.cabeza == null;
    }





    /**
     * añade un nuevo nodo a la lista
     *
     * @param enem nodo a añadir
     */
    public void añadir(Enemigo enem) {
        Nodo temp;
        if (isEmpty()) {
            temp=new Nodo(enem,null);
            this.cabeza = this.cola = temp;
        }
        else {
            temp=new Nodo(enem,null);
            this.cola.setSiguiente(temp);
            this.cola=temp;

            }
        tamaño++;
    }




    public int getTamaño() {
        return tamaño;
    }







    /**
     * Retorna el atributo cabeza de la lista
     *
     * @return
     */
    public Nodo getCabeza() {
        return this.cabeza;
    }






    /**
     * Retorna el atributo cola de la lista
     *
     * @return
     */
    public Nodo getCola() {
        return this.cola;
    }

}