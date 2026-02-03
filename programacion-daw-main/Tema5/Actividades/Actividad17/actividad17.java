package Tema5.Actividades.Actividad17;

import java.util.ArrayList;

public class actividad17 {
    public static void main(String[] args) {
        moto m1 = new moto ("1234 JDK");
        coche c1 = new coche ("6372 UEW");
        camion c2 = new camion ("8271 NCD");

        ArrayList<vehiculo> array = new ArrayList<>();
        array.add(c2); array.add(m1); array.add(c2);

        for (vehiculo v : array) {
            v.mostrarInfo();
        }
    }
}
