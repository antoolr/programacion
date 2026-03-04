package actividades.ActividadMVC1.Modelo;

import java.sql.*;
import actividades.conexiones.conexionact;

public class cursoDAO {
    public void insertar(int inicio, int fin) {
        String sql = "INSERT INTO curso_escolar (anyo_inicio, anyo_fin) VALUES (?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, inicio);
            ps.setInt(2, fin);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar curso: " + e.getMessage());
        }
    }
}