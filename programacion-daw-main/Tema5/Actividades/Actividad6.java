package Tema5.Actividades;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Actividad6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la ruta del fichero: ");
        String ruta = teclado.nextLine();

        File original = new File(ruta);

        if (!original.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }

        String nombre = original.getName();
        String base = nombre.substring(0, nombre.lastIndexOf('.'));
        String extension = nombre.substring(nombre.lastIndexOf('.'));

        LocalDate hoy = LocalDate.now();

        String nuevoNombre = base + "_copia_" + hoy + extension;

        try {
            Scanner sc = new Scanner(original);
            FileWriter fw = new FileWriter("Tema5/Actividades/" + nuevoNombre);

            while (sc.hasNextLine()) {
                fw.write(sc.nextLine() + "\n");
            }

            sc.close();
            fw.close();

            System.out.println("Copia creada: " + nuevoNombre);

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
        }
    }
}

