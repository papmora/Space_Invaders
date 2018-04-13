package ADT;

import Interfaz.Enemigo;

/**
 * Clase Lista Circular, permite crear listas
 *
 * @author pablo
 * @version 9.4.2018
 */


public class ListaCircular extends ListaEnlazada {

    private int tamaño;
    private Nodo cola;
    private Nodo cabeza;


    /**
     * Constructor de la clase
     */
    public ListaCircular() {

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
     * Agrega un nuevo nodo al inicio de la lista circular.
     * *@param enemigo a agregar
     */
    public void añadir(Enemigo enemigo){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo(enemigo);
        // Agrega al valor al nodo.
        nuevo.setValor(enemigo);
        // Consulta si la lista esta vacia.
        if (isEmpty()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            cabeza = nuevo;
            // De igual forma el ultimo nodo sera el nuevo.
            cola = nuevo;
            // Y el puntero del ultimo debe apuntar al primero.
            cola.setSiguiente(cabeza);
            // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(cabeza);
            // Renombra al nuevo nodo como el inicio de la lista.
            cabeza= nuevo;
            // El puntero del ultimo debe apuntar al primero.
            cola.setSiguiente(cabeza);
        }
        // Incrementa el contador de tamaño de la lista.
        tamaño++;
    }




    /**
     * Busca si existe un valor en la lista.
     * *@param referencia valor a buscar.
     * @return true si existe el valor en la lista.
     */
    public boolean buscar(Enemigo referencia){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }while(aux != cabeza && !encontrado);
        // Retorna el resultado de la bandera.
        return encontrado;
    }


    /**
     * Consulta la posición de un elemento en la lista
     * *@param referencia valor del nodo el cual se desea saber la posición.
     * @return un valor entero entre [0,n] que indica la posición del nodo.
     * @throws Exception
     */
    public int getPosicion(Enemigo referencia) throws Exception{
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea una copia de la lista.
            Nodo aux = cabeza;
            // Contado para almacenar la posición del nodo.
            int cont = 0;
            // Recoore la lista hasta llegar al nodo de referencia.
            while(referencia != aux.getValor()){
                // Incrementa el contador.
                cont ++;
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
            // Retorna el valor del contador.
            return cont;
            // Crea una excepción de Valor inexistente en la lista.
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }



    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     * *@param posicion en la cual se encuentra el nodo a eliminar.
     */
    public void eliminar(int posicion) {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if (posicion >= 0 && posicion < tamaño) {
            // Consulta si el nodo a eliminar es el primero
            if (posicion == 0) {
                // Elimina el primer nodo apuntando al siguinte.
                cabeza = cabeza.getSiguiente();
                // Apuntamos con el ultimo nodo de la lista al inicio.
                cola.setSiguiente(cabeza);
            }
            // En caso que el nodo a eliminar este por el medio
            // o sea el ultimo
            else {
                // Crea una copia de la lista.
                Nodo aux = cabeza;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == cola) {
                    aux.setSiguiente(cabeza);
                    cola = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo siguiente = aux.getSiguiente();
                    // Enlaza el nodo anterior al de eliminar con el
                    // sguiente despues de el.
                    aux.setSiguiente(siguiente.getSiguiente());
                    // Actualizamos el puntero del ultimo nodo
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamaño--;
        }
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