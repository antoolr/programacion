package Tema6.src.actividades.actividadFormacion;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class empleado {

    public static void insertarEmpleado(int id, String nombre, String apellido1, String apellido2, String telefono, String direccion, String tipo) {
        String sql = "INSERT INTO empleado VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            ps.setString(7, tipo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarEmpleado() {
        String sql = "SELECT * FROM empleado";
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
                    rs.getString("direccion") + " - " +
                    rs.getString("tipo")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarEmpleado(int id) {
        String sql = "DELETE FROM empleado WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
