package Tema6.src.actividades.actividadFormacion;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class recibe {

    public static void insertarRecibe(int id_empleado, int id_edicion) {
        String sql = "INSERT INTO recibe VALUES (?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id_empleado);
            ps.setInt(2, id_edicion);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarRecibe() {
        String sql = "SELECT * FROM recibe";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Empleado: " + rs.getInt("id_empleado") +
                    " | Edición: " + rs.getInt("id_edicion")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarRecibe(int id_empleado, int id_edicion) {
        String sql = "DELETE FROM recibe WHERE id_empleado=? AND id_edicion=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id_empleado);
            ps.setInt(2, id_edicion);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

