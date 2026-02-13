package Tema6.src.actividades.actividadRevista;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class periodista {

    public static void insertarPeriodista(int id, String nombre, String apellido1, String apellido2,
                                          String telefono, String especialidad) {
        String sql = "INSERT INTO periodista VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, telefono);
            ps.setString(6, especialidad);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarPeriodista() {
        String sql = "SELECT * FROM periodista";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " - " +
                    rs.getString("apellido2") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getString("especialidad")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarPeriodista(String nombre, int id) {
        String sql = "UPDATE periodista SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarPeriodista(int id) {
        String sql = "DELETE FROM periodista WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

