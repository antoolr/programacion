package Tema6.src.actividades.ActividadMVC1.Controlador;

import Tema6.src.actividades.ActividadMVC1.Modelo.profesor;
import Tema6.src.actividades.ActividadMVC1.Vista.vistaProfesor;

public class ControladorProfesor {

    private static profesor profesorGuardado = null;

    public static void crearProfesor() {

        String nombre = vistaProfesor.pedirNombre();
        String apellido1 = vistaProfesor.pedirApellido1();
        String apellido2 = vistaProfesor.pedirApellido2();
        String especialidad = vistaProfesor.pedirEspecialidad();
        String telefono = vistaProfesor.pedirTelefono();
        int id = vistaProfesor.pedirId();

        profesorGuardado = new profesor(nombre, apellido1, apellido2, especialidad, telefono, id);

        System.out.println("\nProfesor creado correctamente.\n");
    }

    public static void mostrarProfesor() {
        if (profesorGuardado == null) {
            System.out.println("\nNo hay profesor guardado.\n");
        } else {
            vistaProfesor.mostrarProfesor(profesorGuardado);
        }
    }
}
