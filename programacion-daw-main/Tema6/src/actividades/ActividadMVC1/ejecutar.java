package Tema6.src.actividades.ActividadMVC1;

import java.util.Scanner;

import Tema6.src.actividades.ActividadMVC1.Controlador.ControladorAlumno;
import Tema6.src.actividades.ActividadMVC1.Controlador.ControladorProfesor;

public class ejecutar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Crear profesor");
            System.out.println("2. Mostrar profesor");
            System.out.println("-------------");
            System.out.println("3. Crear alumno");
            System.out.println("4. Mostrar alumno");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    ControladorProfesor.crearProfesor();
                    break;
                case 2:
                    ControladorProfesor.mostrarProfesor();
                    break;
                case 3:
                    ControladorAlumno.crearAlumno();
                    break;
                case 4:
                    ControladorAlumno.mostrarAlumno();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
