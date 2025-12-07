package Tema4.relacionT4.ejercicio1;

import Tema4.relacionT4.ejercicio1.pais;


public class actividad1 {
    public static void main(String[] args) {
        pais espana = new pais("España", 47000000, 1400);

        System.out.println("País: " + espana.getNombre());
        System.out.println("Población: " + espana.getPoblacion());
        System.out.println("PIB: " + espana.getPib());

        espana.setNombre("España (actualizado)");
        espana.setPoblacion(47050000);
        espana.setPib(1405);


        // Usar el método de PIB per cápita
        double pibPerCapita = espana.pibPerCapita();
        System.out.println("PIB per cápita: " + pibPerCapita);
    }
}
