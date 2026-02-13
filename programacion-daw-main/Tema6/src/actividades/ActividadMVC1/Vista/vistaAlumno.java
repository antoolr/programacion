package Tema6.src.actividades.ActividadMVC1.Vista;

import java.util.Scanner;

import Tema6.src.actividades.ActividadMVC1.Modelo.alumno;

public class vistaAlumno {

    private static Scanner sc = new Scanner(System.in);

    public static String pedirNombre() {
        System.out.print("Nombre: ");
        return sc.nextLine();
    }

    public static String pedirApellido1() {
        System.out.print("Primer apellido: ");
        return sc.nextLine();
    }

    public static String pedirApellido2() {
        System.out.print("Segundo apellido: ");
        return sc.nextLine();
    }

    public static String pedirfechnaci() {
        System.out.print("Fecha nacimiento: ");
        return sc.nextLine();
    }

    public static String pedirTelefono() {
        System.out.print("Teléfono: ");
        return sc.nextLine();
    }

    public static int pedirnum_matricula() {
        System.out.print("Numero matricula: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void mostrarAlumno(alumno p) {
        System.out.println("\n=== PROFESOR ===");
        System.out.println("Numero matricula: " + p.getNumero_matricula());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido1: " + p.getApellido1());
        System.out.println("Apellido2: " + p.getApellido2());
        System.out.println("Fecha nacimiento: " + p.getFecha_nacimiento());
        System.out.println("================\n");
    }
}
