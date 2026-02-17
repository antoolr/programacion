package Tema6.src.actividades.ActividadMVC1.Vista;

import java.util.Scanner;

import Tema6.src.actividades.ActividadMVC1.Modelo.asignatura;

public class vistaAsignatura {

    private static Scanner sc = new Scanner(System.in);

    public static int pedirCodigo() {
        System.out.print("Codigo: ");
        int valor= sc.nextInt(); sc.nextLine(); 
        return valor;
    }

    public static int pedirnum_horas() {
        System.out.print("Numero horas: ");
        int valor= sc.nextInt(); sc.nextLine(); 
        return valor;
    }

    public static String pedirNombre() {
        System.out.print("Nombre: ");
        return sc.nextLine();
    }

    

    public static void mostrarAsignatura(asignatura a) {
        System.out.println("\n=== ASIGNATURA ===");
        System.out.println("Codigo: " + a.getCodigo());
        System.out.println("Numero horas : " + a.getNumero_horas());
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("================\n");
    }
}
