package Tema6.src.actividades.actividadLibreria;


import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class editorial {

    public static void insertarEditorial(int id, String nombre, String direccion,
                                         String telefono, String url, int id_localidad) {
        String sql = "INSERT INTO editorial VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.setString(4, telefono);
            ps.setString(5, url);
            ps.setInt(6, id_localidad);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarEditorial() {
        String sql = "SELECT * FROM editorial";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("direccion") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getString("url") + " - " +
                    rs.getInt("id_localidad")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarEditorial(String nombre, int id) {
        String sql = "UPDATE editorial SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarEditorial(int id) {
        String sql = "DELETE FROM editorial WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

