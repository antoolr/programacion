package Tema6.src.actividades.actividadLibreria;


import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class autor {

    public static void insertarAutor(int id, String nombre, String apellido1, String apellido2,
                                     String url, String telefono, String direccion, int id_localidad) {
        String sql = "INSERT INTO autor VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, url);
            ps.setString(6, telefono);
            ps.setString(7, direccion);
            ps.setInt(8, id_localidad);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarAutor() {
        String sql = "SELECT * FROM autor";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " - " +
                    rs.getString("apellido2") + " - " +
                    rs.getString("url") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getString("direccion") + " - " +
                    rs.getInt("id_localidad")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarAutor(String nombre, int id) {
        String sql = "UPDATE autor SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarAutor(int id) {
        String sql = "DELETE FROM autor WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

