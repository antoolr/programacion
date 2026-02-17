package Tema6.src.actividades.TareaDomin.Controlador;

import Tema6.src.actividades.TareaDomin.Modelo.alumnoDAO;
import Tema6.src.actividades.TareaDomin.Modelo.profesorDAO;
import Tema6.src.actividades.TareaDomin.Modelo.practicaDAO;
import Tema6.src.actividades.TareaDomin.Modelo.ExamenTeoricoDAO;
import Tema6.src.actividades.TareaDomin.Vista.vista;

public class ControladorGeneral {

    private alumnoDAO alumnoDao;
    private profesorDAO profesorDao;
    private practicaDAO practicaDao;
    private ExamenTeoricoDAO examenDao;
    private vista view;

    public ControladorGeneral() {
        alumnoDao = new alumnoDAO();
        profesorDao = new profesorDAO();
        practicaDao = new practicaDAO();
        examenDao = new ExamenTeoricoDAO();
        view = new vista();
    }

    public void iniciar() {
        int opcion;

        try {
            do {
                opcion = view.mostrarMenu();

                switch (opcion) {

                    //listar
                    case 1:
                        alumnoDAO.listarAlumno();
                        view.mostrarMensaje("Listado de alumnos mostrado");
                        break;

                    case 2:
                        profesorDAO.listarProfesor();
                        view.mostrarMensaje("Listado de profesores mostrado");
                        break;

                    case 3:
                        practicaDAO.listarPractica();
                        view.mostrarMensaje("Listado de prácticas mostrado");
                        break;

                    case 4:
                        ExamenTeoricoDAO.listarExamen();
                        view.mostrarMensaje("Listado de exámenes mostrado");
                        break;

                   //insertar

                    case 5:
                        insertarAlumno();
                        view.mostrarMensaje("Alumno insertado");
                        break;

                    case 6:
                        insertarProfesor();
                        view.mostrarMensaje("Profesor insertado");
                        break;

                    case 7:
                        insertarPractica();
                        view.mostrarMensaje("Práctica insertada");
                        break;

                    case 8:
                        insertarExamen();
                        view.mostrarMensaje("Examen insertado");
                        break;

                 
                        //actualizar
                    case 9:
                        actualizarAlumno();
                        view.mostrarMensaje("Alumno actualizado");
                        break;

                    case 10:
                        actualizarProfesor();
                        view.mostrarMensaje("Profesor actualizado");
                        break;

                    case 11:
                        actualizarPractica();
                        view.mostrarMensaje("Práctica actualizada");
                        break;

                    case 12:
                        actualizarExamen();
                        view.mostrarMensaje("Examen actualizado");
                        break;

                    //borrar
                    case 13:
                        borrarAlumno();
                        view.mostrarMensaje("Alumno borrado");
                        break;

                    case 14:
                        borrarProfesor();
                        view.mostrarMensaje("Profesor borrado");
                        break;

                    case 15:
                        borrarPractica();
                        view.mostrarMensaje("Práctica borrada");
                        break;

                    case 16:
                        borrarExamen();
                        view.mostrarMensaje("Examen borrado");
                        break;

                    case 0:
                        view.mostrarMensaje("Saliendo...");
                        break;

                    default:
                        view.mostrarMensaje("Opción incorrecta");
                        break;
                }

            } while (opcion != 0);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   //metodos

    private void insertarAlumno() {
        int id = view.pedirId("ID");
        String nif = view.pedirString("NIF");
        String grupo = view.pedirString("Grupo");
        String nombre = view.pedirString("Nombre");
        String a1 = view.pedirString("Apellido1");
        String a2 = view.pedirString("Apellido2");

        alumnoDAO.insertarAlumno(id, nif, grupo, nombre, a1, a2);
    }

    private void insertarProfesor() {
        int id = view.pedirId("ID");
        String nif = view.pedirString("NIF");
        String nombre = view.pedirString("Nombre");
        String a1 = view.pedirString("Apellido1");
        String a2 = view.pedirString("Apellido2");

        profesorDAO.insertarProfesor(id, nif, nombre, a1, a2);
    }

    private void insertarPractica() {
        int id = view.pedirId("ID");
        String titulo = view.pedirString("Título");
        String dificultad = view.pedirString("Dificultad");
        int idProfesor = view.pedirId("ID profesor");
        String fecha = view.pedirString("Fecha");

        practicaDAO.insertarPractica(id, titulo, dificultad, idProfesor, fecha);
    }

    private void insertarExamen() {
        int id = view.pedirId("ID");
        String titulo = view.pedirString("Título");
        int numPreguntas = view.pedirId("Número de preguntas");
        String fecha = view.pedirString("Fecha");
        int idProfesor = view.pedirId("ID profesor");

        ExamenTeoricoDAO.insertarExamen(id, titulo, numPreguntas, fecha, idProfesor);
    }

    private void actualizarAlumno() {
        int id = view.pedirId("ID del alumno");
        String nombre = view.pedirString("Nuevo nombre");
        alumnoDAO.actualizarAlumno(nombre, id);
    }

    private void actualizarProfesor() {
        int id = view.pedirId("ID del profesor");
        String nombre = view.pedirString("Nuevo nombre");
        profesorDAO.actualizarProfesor(nombre, id);
    }

    private void actualizarPractica() {
        int id = view.pedirId("ID de la práctica");
        String titulo = view.pedirString("Nuevo título");
        practicaDAO.actualizarPractica(titulo, id);
    }

    private void actualizarExamen() {
        int id = view.pedirId("ID del examen");
        String titulo = view.pedirString("Nuevo título");
        ExamenTeoricoDAO.actualizarExamen(titulo, id);
    }

    private void borrarAlumno() {
        int id = view.pedirId("ID del alumno");
        alumnoDAO.borrarAlumno(id);
    }

    private void borrarProfesor() {
        int id = view.pedirId("ID del profesor");
        profesorDAO.borrarProfesor(id);
    }

    private void borrarPractica() {
        int id = view.pedirId("ID de la práctica");
        practicaDAO.borrarPractica(id);
    }

    private void borrarExamen() {
        int id = view.pedirId("ID del examen");
        ExamenTeoricoDAO.borrarExamen(id);
    }
}
