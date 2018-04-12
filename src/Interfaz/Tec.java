package Interfaz;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Clase Tec, identifica cuando se preciona o se suelta una tecla
 *
 * @author pablo
 * @version 9.4.2018
 */

public class Tec implements KeyListener {

    private boolean teclas[]=new boolean[256];
    static boolean Izquierda,Derecha,Bala;

    /**
     * Constructor de la clase
     */

    Tec(){
        Izquierda=false;
        Derecha=false;
        Bala=false;
    }

    /**
     * Metodo que actualiza el valor booleano de las teclas
     */

    void actualizar(){
        Izquierda=teclas[KeyEvent.VK_LEFT];
        Derecha=teclas[KeyEvent.VK_RIGHT];
        Bala=teclas[KeyEvent.VK_UP];
    }

    /**
     * Metodo de KeyListener que no usamos
     * *@param e
     */

    @Override
    public void keyTyped(KeyEvent e) {


    }

    /**
     * Metodo de KeyListener que nos cambia el valor booleano de la tecla a true si se preciona
     * *@param e
     */


    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()]=true;


    }

    /**
     * Metodo de KeyListener que nos cambia el valor booleano de la tecla a true si se suelta
     * *@param e
     */

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()]=false;

    }
}
