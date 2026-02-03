package Tema5.Actividades;

import java.io.*;
import java.util.*;

public class Actividad8 {

    public static void main(String[] args) throws IOException {

        File f = new File("Tema5/Actividades/alumnos.csv");

        if (!f.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el ID del alumno a modificar: ");
        String idBuscado = teclado.nextLine();

        System.out.print("Nuevo nombre: ");
        String nuevoNombre = teclado.nextLine();

        Scanner sc = new Scanner(f);
        ArrayList<String> lineas = new ArrayList<>();

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";");

            if (partes[0].equals(idBuscado)) {
                partes[1] = nuevoNombre;
                linea = String.join(";", partes);
            }

            lineas.add(linea);
        }

        sc.close();

        FileWriter fw = new FileWriter(f);

        for (String l : lineas) {
            fw.write(l + "\n");
        }

        fw.close();

        System.out.println("Alumno modificado correctamente.");
    }
}

