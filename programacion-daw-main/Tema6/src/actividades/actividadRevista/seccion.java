package Tema6.src.actividades.actividadRevista;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class seccion {

    public static void insertarSeccion(int id, String titulo, int extension, int numero_revista) {
        String sql = "INSERT INTO seccion VALUES (?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setInt(3, extension);
            ps.setInt(4, numero_revista);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarSeccion() {
        String sql = "SELECT * FROM seccion";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("titulo") + " - " +
                    rs.getInt("extension") + " - " +
                    rs.getInt("numero_revista")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarSeccion(String titulo, int id) {
        String sql = "UPDATE seccion SET titulo=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, titulo);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarSeccion(int id) {
        String sql = "DELETE FROM seccion WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

