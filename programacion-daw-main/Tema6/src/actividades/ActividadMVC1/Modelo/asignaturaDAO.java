package actividades.ActividadMVC1.Modelo;

import java.sql.*;
import actividades.conexiones.conexionact;

public class asignaturaDAO {
    public void insertar(String nombre, float creditos, String tipo, int curso, int cuatri, int idProf, int idCurso) {
        String sql = "INSERT INTO asignatura (nombre, creditos, tipo, curso, cuatrimestre, id_profesor, id_curso_escolar) VALUES (?,?,?,?,?,?,?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setFloat(2, creditos);
            ps.setString(3, tipo);
            ps.setInt(4, curso);
            ps.setInt(5, cuatri);
            ps.setInt(6, idProf);
            ps.setInt(7, idCurso);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar asignatura: " + e.getMessage());
        }
    }
}