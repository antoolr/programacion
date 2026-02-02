package Examen.herencia2;

import java.util.ArrayList;

public class herencia2  {
    public static void main(String[] args) {
        ArrayList<maquina> maquinas = new ArrayList<>();

        maquinas.add(new coche("Pedrito"));
        maquinas.add(new avion("Pedrito2"));
        maquinas.add(new robot("Pedrito3"));

        for(maquina p: maquinas){
        p.encender();
        }
    }

   
}
