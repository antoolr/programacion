package Tema5.Actividades;

import java.io.*;
import java.util.*;

public class Actividad7 {

    public static void main(String[] args) throws IOException {

        File f = new File("Tema5/Actividades/alumnos.csv");

        if (!f.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Leer alumnos");
            System.out.println("2. Insertar alumno");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    leerAlumnos(f);
                    break;
                case 2:
                    insertarAlumno(f, teclado);
                    break;
            }

        } while (opcion != 3);
    }

    static void leerAlumnos(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    static void insertarAlumno(File f, Scanner teclado) throws IOException {
        System.out.print("ID: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Edad: ");
        String edad = teclado.nextLine();
        System.out.print("Curso: ");
        String curso = teclado.nextLine();

        FileWriter fw = new FileWriter(f, true);
        fw.write(id + ";" + nombre + ";" + edad + ";" + curso + "\n");
        fw.close();

        System.out.println("Alumno insertado.");
    }
}

