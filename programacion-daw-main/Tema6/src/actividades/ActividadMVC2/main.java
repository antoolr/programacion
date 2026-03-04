package actividades.ActividadMVC2;


import actividades.ActividadMVC2.Controlador.controlador;
import actividades.ActividadMVC2.Modelo.alumno;
import actividades.ActividadMVC2.Modelo.alumnoDAO;
import actividades.ActividadMVC2.Modelo.profesor;
import actividades.ActividadMVC2.Modelo.profesorDAO;
import actividades.ActividadMVC2.Modelo.asignatura;
import actividades.ActividadMVC2.Modelo.asignaturaDAO;
import actividades.ActividadMVC2.Modelo.cursoEscolar;
import actividades.ActividadMVC2.Modelo.cursoEscolarDAO;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // Instancia del controlador (si lo usas)
        controlador ctrl = new controlador();

        // DAOs
        profesorDAO profesorDAO = new profesorDAO();
        asignaturaDAO asignaturaDAO = new asignaturaDAO();
        cursoEscolarDAO cursoDAO = new cursoEscolarDAO();

      
        profesor p1 = new profesor(0, "Juan", "García", "López", "Matemáticas", "600123123");
        profesor p2 = new profesor(0, "Ana", "Martínez", "Sánchez", "Informática", "611222333");

        profesorDAO.insertar(p1);
        profesorDAO.insertar(p2);

       
        cursoEscolar c1 = new cursoEscolar(0, 2023, 2024);
        cursoEscolar c2 = new cursoEscolar(0, 2024, 2025);

        cursoDAO.insertar(c1);
        cursoDAO.insertar(c2);

      
        ArrayList<profesor> profesores = profesorDAO.listar();

        if (profesores.size() >= 2) {
            asignatura a1 = new asignatura(101, "Programación", 200, profesores.get(1));
            asignatura a2 = new asignatura(102, "Bases de Datos", 160, profesores.get(0));

            asignaturaDAO.insertar(a1);
            asignaturaDAO.insertar(a2);
        }

        
        System.out.println("=== PROFESORES ===");
        for (profesor p : profesorDAO.listar()) {
            System.out.println(p.getId() + " - " + p.getNombre() + " " + p.getApellido1());
        }

        System.out.println("\n=== CURSOS ESCOLARES ===");
        for (cursoEscolar c : cursoDAO.listar()) {
            System.out.println(c.getId() + " - " + c.getAnioInicio() + "/" + c.getAnioFin());
        }

        System.out.println("\n=== ASIGNATURAS ===");
        for (asignatura a : asignaturaDAO.listar()) {
            System.out.println(a.getCodigo() + " - " + a.getNombre() + " (Profesor: " + a.getProfesor().getNombre() + ")");
        }

        System.out.println("\n=== FIN DE LA EJECUCIÓN ===");
    }
}

