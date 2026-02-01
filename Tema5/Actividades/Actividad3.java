package Tema5.Actividades;

import java.io.*;
import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) throws IOException {

        int j1 = 0;
        int j2 = 0;

        // Archivo donde se guardan las estadísticas
        File f = new File("Tema5/Actividades/estadisticas.txt");

        if (f.exists()) {
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split("=");

                if (partes[0].equals("jugador1")) {
                    j1 = Integer.parseInt(partes[1]);
                } else if (partes[0].equals("jugador2")) {
                    j2 = Integer.parseInt(partes[1]);
                }
            }
            sc.close();
        }

        j1++;

        // Guardar estadísticas actualizadas
        FileWriter fw = new FileWriter("Tema5/Actividades/estadisticas.txt");
        fw.write("jugador1=" + j1 + "\n");
        fw.write("jugador2=" + j2 + "\n");
        fw.close();

        System.out.println("Estadísticas actualizadas:");
        System.out.println("Jugador 1: " + j1);
        System.out.println("Jugador 2: " + j2);
    }
}
