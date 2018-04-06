package ADT;

import Interfaz.Enemigo;

public class Nodo {
    private  Nodo siguiente;
    private  Nodo anterior;
    private Enemigo enemigo;



    public Nodo(Enemigo enemigo,Nodo siguiente){
        this.siguiente = null;
        this.anterior = null;
        this.enemigo=enemigo;

    }


    /**
     * Enlaza un nodo a otro
     * @param n nodo a enlazar
     */
    public void setSiguiente(Nodo n){
        this.siguiente = n;
    }



    /**
     * Retorna el nodo siguiente
     * @return
     */
    public Nodo getSiguiente(){
        return this.siguiente;
    }



    /**
     * Enlaza un nodo a un nodo siguiente
     * @param n
     */
    public void setAnterior(Nodo n){
        this.siguiente = n;
    }



    /**
     * retorna el nodo siguiente
     * @return
     */
    public Nodo getAnterior(){
        return this.siguiente;
    }








    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }
}
