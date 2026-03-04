package actividades.ActividadMVC2.Vista;


import actividades.ActividadMVC2.Modelo.alumno;
import actividades.ActividadMVC2.Modelo.asignatura;
import actividades.ActividadMVC2.Modelo.profesor;
import actividades.ActividadMVC2.Modelo.cursoEscolar;
import actividades.ActividadMVC2.Modelo.matricula;

public class Vista {

    public void mostrarAlumno(alumno a) {
        System.out.println("Alumno: " + a.getNombre() + " " + a.getApellido1());
    }

    public void mostrarProfesor(profesor p) {
        System.out.println("Profesor: " + p.getNombre() + " (" + p.getEspecialidad() + ")");
    }

    public void mostrarAsignatura(asignatura a) {
        System.out.println("Asignatura: " + a.getNombre() + " - Profesor: " + a.getProfesor().getNombre());
    }

    public void mostrarCurso(cursoEscolar c) {
        System.out.println("Curso escolar: " + c.getAnioInicio() + "/" + c.getAnioFin());
    }

    public void mostrarMatricula(matricula m) {
        System.out.println("Matrícula: " + m.getAlumno().getNombre() + " en curso " + m.getCurso().getAnioInicio());
    }
}

