package Tema6.src.actividades.ActividadMVC1.Controlador;

import Tema6.src.actividades.ActividadMVC1.Modelo.asignatura;
import Tema6.src.actividades.ActividadMVC1.Vista.vistaAsignatura;


public class ControladorAsignatura {

    private static asignatura asignaturaGuardada = null;

     public static void crearAsignatura() {

        int codigo = vistaAsignatura.pedirCodigo();
        int numero_horas = vistaAsignatura.pedirnum_horas();
        String nombre = vistaAsignatura.pedirNombre();
        
        
       asignaturaGuardada = new asignatura(codigo, numero_horas, nombre);
       
        System.out.println("\nAsignatura creada correctamente.\n");
    }

    public static void mostrarAsignatura() {
        if (asignaturaGuardada == null) {
            System.out.println("\nNo hay asignatura guardada.\n");
        } else {
            vistaAsignatura.mostrarAsignatura(asignaturaGuardada);
        }
    }
}
