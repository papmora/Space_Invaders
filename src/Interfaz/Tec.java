package Interfaz;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tec implements KeyListener {

    private boolean teclas[]=new boolean[256];
    public static boolean Izquierda,Derecha,Bala;

    public Tec(){
        Izquierda=false;
        Derecha=false;
        Bala=false;
    }

    public void actualizar(){
        Izquierda=teclas[KeyEvent.VK_LEFT];
        Derecha=teclas[KeyEvent.VK_RIGHT];
        Bala=teclas[KeyEvent.VK_UP];
    }


    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()]=true;


    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()]=false;

    }
}
