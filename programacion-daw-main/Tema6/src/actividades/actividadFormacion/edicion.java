package Tema6.src.actividades.actividadFormacion;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class edicion {

    public static void insertarEdicion(int id, Date inicio, Date fin, String horario, String lugar, int id_curso) {
        String sql = "INSERT INTO edicion VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setDate(2, inicio);
            ps.setDate(3, fin);
            ps.setString(4, horario);
            ps.setString(5, lugar);
            ps.setInt(6, id_curso);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarEdicion() {
        String sql = "SELECT * FROM edicion";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getDate("fecha_inicio") + " - " +
                    rs.getDate("fecha_fin") + " - " +
                    rs.getString("horario") + " - " +
                    rs.getString("lugar") + " - " +
                    rs.getInt("id_curso")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarEdicion(int id) {
        String sql = "DELETE FROM edicion WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

