package actividades.ActividadMVC2.Controlador;

import java.util.ArrayList;

import actividades.ActividadMVC2.Modelo.alumno;
import actividades.ActividadMVC2.Modelo.asignatura;
import actividades.ActividadMVC2.Modelo.profesor;
import actividades.ActividadMVC2.Modelo.cursoEscolar;
import actividades.ActividadMVC2.Modelo.matricula;

public class controlador {

    private ArrayList<alumno> alumnos = new ArrayList<>();
    private ArrayList<profesor> profesores = new ArrayList<>();
    private ArrayList<asignatura> asignaturas = new ArrayList<>();
    private ArrayList<cursoEscolar> cursos = new ArrayList<>();
    private ArrayList<matricula> matriculas = new ArrayList<>();

    public void agregarAlumno(alumno a) {
        alumnos.add(a);
    }

    public void agregarProfesor(profesor p) {
        profesores.add(p);
    }

    public void agregarAsignatura(asignatura a) {
        asignaturas.add(a);
    }

    public void agregarCurso(cursoEscolar c) {
        cursos.add(c);
    }

    public void agregarMatricula(matricula m) {
        matriculas.add(m);
    }

    public ArrayList<alumno> getAlumnos() { return alumnos; }
    public ArrayList<profesor> getProfesores() { return profesores; }
    public ArrayList<asignatura> getAsignaturas() { return asignaturas; }
    public ArrayList<cursoEscolar> getCursos() { return cursos; }
    public ArrayList<matricula> getMatriculas() { return matriculas; }
}

