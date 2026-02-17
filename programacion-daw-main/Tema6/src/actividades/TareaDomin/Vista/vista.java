package Tema6.src.actividades.TareaDomin.Vista;

import java.util.Scanner;

public class vista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n  Menu   ");
        System.out.println("1. Listar Alumnos");
        System.out.println("2. Listar Profesores");
        System.out.println("3. Listar Prácticas");
        System.out.println("4. Listar Exámenes");
        System.out.println("----------------------");
        System.out.println("5. Insertar Alumno");
        System.out.println("6. Insertar Profesor");
        System.out.println("7. Insertar Práctica");
        System.out.println("8. Insertar Examen");
        System.out.println("----------------------");
        System.out.println("9. Actualizar Alumno");
        System.out.println("10. Actualizar Profesor");
        System.out.println("11. Actualizar Práctica");
        System.out.println("12. Actualizar Examen");
        System.out.println("----------------------");
        System.out.println("13. Borrar Alumno");
        System.out.println("14. Borrar Profesor");
        System.out.println("15. Borrar Práctica");
        System.out.println("16. Borrar Examen");
        System.out.println("----------------------");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

   //pedir datos

    public int pedirId(String msg) {
        System.out.print(msg + ": ");
        return sc.nextInt();
    }

    public String pedirString(String msg) {
        sc.nextLine();
        System.out.print(msg + ": ");
        return sc.nextLine();
    }

    public double pedirDouble(String msg) {
        System.out.print(msg + ": ");
        return sc.nextDouble();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
