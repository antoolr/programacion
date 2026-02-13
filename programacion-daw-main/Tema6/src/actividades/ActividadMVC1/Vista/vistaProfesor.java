package Tema6.src.actividades.ActividadMVC1.Vista;

import java.util.Scanner;
import Tema6.src.actividades.ActividadMVC1.Modelo.profesor;

public class vistaProfesor {

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

    public static String pedirEspecialidad() {
        System.out.print("Especialidad: ");
        return sc.nextLine();
    }

    public static String pedirTelefono() {
        System.out.print("Teléfono: ");
        return sc.nextLine();
    }

    public static int pedirId() {
        System.out.print("ID: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void mostrarProfesor(profesor p) {
        System.out.println("\n=== PROFESOR ===");
        System.out.println("ID: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido1: " + p.getApellido1());
        System.out.println("Apellido2: " + p.getApellido2());
        System.out.println("Especialidad: " + p.getEspecialidad());
        System.out.println("Teléfono: " + p.getTelefono());
        System.out.println("================\n");
    }
}

