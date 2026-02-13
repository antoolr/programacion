package Tema6.src.actividades.actividadRevista;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class empleado {

    public static void insertarEmpleado(int id, String nif, String nombre, String apellido1, String apellido2,
                                        String telefono, int codigo_sucursal) {
        String sql = "INSERT INTO empleado VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, nombre);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, telefono);
            ps.setInt(7, codigo_sucursal);
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
                    rs.getString("nif") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " - " +
                    rs.getString("apellido2") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getInt("codigo_sucursal")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarEmpleado(String nombre, int id) {
        String sql = "UPDATE empleado SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();

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

