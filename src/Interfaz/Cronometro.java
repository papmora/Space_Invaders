package Interfaz;

public class Cronometro {

    private long delta, T_ultimo;
    private long tiempo;
    private boolean funcionando;

    Cronometro(){
        delta = 0;
        T_ultimo = 0;
        funcionando = false;
    }

    void corriendo(long time){
        funcionando = true;
        this.tiempo = time;
    }

    void actualizar(){
        if(funcionando)
            delta += System.currentTimeMillis() - T_ultimo;
        if(delta >= tiempo){
            funcionando = false;
            delta = 0;
        }

        T_ultimo = System.currentTimeMillis();
    }

    boolean Funcionando(){
        return funcionando;
    }

}

