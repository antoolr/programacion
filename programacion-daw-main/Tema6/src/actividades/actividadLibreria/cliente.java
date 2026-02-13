package Tema6.src.actividades.actividadLibreria;


import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class cliente {

    public static void insertarCliente(int id, String nombre, String apellido1, String apellido2,
                                       String direccion, String telefono, String email, int id_localidad) {
        String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, direccion);
            ps.setString(6, telefono);
            ps.setString(7, email);
            ps.setInt(8, id_localidad);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarCliente() {
        String sql = "SELECT * FROM cliente";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " - " +
                    rs.getString("apellido2") + " - " +
                    rs.getString("direccion") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getString("email") + " - " +
                    rs.getInt("id_localidad")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarCliente(String nombre, int id) {
        String sql = "UPDATE cliente SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

