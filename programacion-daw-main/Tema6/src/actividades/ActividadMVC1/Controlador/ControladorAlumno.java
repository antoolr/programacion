package Tema6.src.actividades.ActividadMVC1.Controlador;

import Tema6.src.actividades.ActividadMVC1.Modelo.alumno;
import Tema6.src.actividades.ActividadMVC1.Vista.vistaAlumno;

public class ControladorAlumno {

    private static alumno alumnoGuardado = null;

    public static void crearAlumno() {

        String nombre = vistaAlumno.pedirNombre();
        String apellido1 = vistaAlumno.pedirApellido1();
        String apellido2 = vistaAlumno.pedirApellido2();
        String fecha_nacimiento = vistaAlumno.pedirfechnaci();
        String telefono = vistaAlumno.pedirTelefono();
        int numero_matricula = vistaAlumno.pedirnum_matricula();

        alumnoGuardado = new alumno(nombre, apellido1, apellido2, fecha_nacimiento, telefono, numero_matricula);

        System.out.println("\nProfesor creado correctamente.\n");
    }

    public static void mostrarAlumno() {
        if (alumnoGuardado == null) {
            System.out.println("\nNo hay profesor guardado.\n");
        } else {
            vistaAlumno.mostrarAlumno(alumnoGuardado);
        }
    }
}

