package Tema4.ActividadesT4.ActividadCartasT4;

import java.util.ArrayList;

public class mazo {
    ArrayList<carta> cartas;

    public mazo(){
        cartas = new ArrayList<carta>();
    }

    public void barajar(carta c){
        cartas.add(c);
    }

    public carta sacarCarta(){
        if (cartas.size() > 0) {
            return cartas.remove(0);
        } else {
            return null; 
        }
    }

    public boolean estaVacio(){
        return cartas.isEmpty();
    } 
}
