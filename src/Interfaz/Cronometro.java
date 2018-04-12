package Interfaz;

/**
 * Clase que nos permite mantener los tiempos del juego
 *
 * @author pablo
 * @version 9.4.2018
 */

public class Cronometro {

    private long delta, T_ultimo;
    private long tiempo;
    private boolean funcionando;

    /**
     * Constructor de la clase
     */

    Cronometro(){
        delta = 0;
        T_ultimo = 0;
        funcionando = false;
    }

    /**
     * Metodo que empieza a corres el tiempo
     * *@param time
     */

    void corriendo(long time){
        funcionando = true;
        this.tiempo = time;
    }

    /**
     * Metodo que actualiza el tiempo
     */

    void actualizar(){
        if(funcionando)
            delta += System.currentTimeMillis() - T_ultimo;
        if(delta >= tiempo){
            funcionando = false;
            delta = 0;
        }

        T_ultimo = System.currentTimeMillis();
    }

    /**
     * Metodo que nos indica si el cronometro funciona
     * @return boolean
     */

    boolean Funcionando(){
        return funcionando;
    }

}

