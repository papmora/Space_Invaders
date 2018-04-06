package Interfaz;

public class Coordenadas {

    private double px;
    private double py;

    public Coordenadas(){

        this.px=0;
        this.py=0;

    }

    Coordenadas(double x, double y){
        this.px=x;
        this.py=y;

    }

    Coordenadas(Coordenadas nueva){
        this.px=nueva.px;
        this.py=nueva.py ;
    }

    Coordenadas nueva(Coordenadas v){
        return new Coordenadas(px+v.getPx(),py+v.getPy());
    }

    Coordenadas n_escala(double valor){
        return new Coordenadas(px*valor,py*valor);
    }

    double getPx() {
        return px;
    }

    void setPx(double px) {
        this.px = px;
    }

    double getPy() {
        return py;
    }

    void setPy(double py) {
        this.py = py;
    }


}


