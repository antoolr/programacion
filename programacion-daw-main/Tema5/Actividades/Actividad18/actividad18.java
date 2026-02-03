package Tema5.Actividades.Actividad18;

import java.util.ArrayList;

public class actividad18 {
    public static void main(String[] args) {

        ArrayList<personaje> equipo1 = new ArrayList<>();
        ArrayList<personaje> equipo2 = new ArrayList<>();

        // Crear personajes
        equipo1.add(new ogro("Ogro1"));
        equipo1.add(new mago("Mago1"));
        equipo1.add(new caballero("Caballero1"));

        equipo2.add(new ogro("Ogro2"));
        equipo2.add(new mago("Mago2"));
        equipo2.add(new caballero("Caballero2"));

        // Bucle de batalla
        while (!equipo1.isEmpty() && !equipo2.isEmpty()) {

            personaje p1 = equipo1.get(0);
            personaje p2 = equipo2.get(0);

            int d1 = p1.atacar();
            int d2 = p2.atacar();

            p2.recibirDanio(d1);
            p1.recibirDanio(d2);

            System.out.println(p1.getNombre() + " hace " + d1 + " de daño a " + p2.getNombre());
            System.out.println(p2.getNombre() + " hace " + d2 + " de daño a " + p1.getNombre());

            if (!p1.estaVivo()) {
                System.out.println(p1.getNombre() + " ha muerto");
                equipo1.remove(0);
            }

            if (!p2.estaVivo()) {
                System.out.println(p2.getNombre() + " ha muerto");
                equipo2.remove(0);
            }

            System.out.println("-");
        }

        if (equipo1.isEmpty()) {
            System.out.println("Gana el equipo 2");
        } else {
            System.out.println("Gana el equipo 1");
        }
    }
}
