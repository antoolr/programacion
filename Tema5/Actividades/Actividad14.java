package Tema5.Actividades;


import java.util.HashMap;
import java.util.Map;

public class Actividad14 {

    public static void main(String[] args) {

        // Lista de marcas de ejemplo
        String[] marcas = {
            "BMW", "Audi", "Seat", "BMW", "Toyota", "Seat", "Audi", "BMW"
        };

        // Mapa para contar apariciones
        Map<String, Integer> contador = new HashMap<>();

        for (String marca : marcas) {

            if (contador.containsKey(marca)) {
                // Si ya existe, sumamos 1
                contador.put(marca, contador.get(marca) + 1);
            } else {
                // Si no existe, la añadimos con valor 1
                contador.put(marca, 1);
            }
        }

        // Mostrar resultados
        System.out.println("Apariciones de cada marca:");
        for (String marca : contador.keySet()) {
            System.out.println(marca + " " + contador.get(marca));
        }
    }
}

