package Tema6.src.actividades.actividadLibreria;


import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class libro {

    public static void insertarLibro(int id, String isbn, String titulo, int ano_publicacion,
                                     String descripcion, String tipo) {
        String sql = "INSERT INTO libro VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, isbn);
            ps.setString(3, titulo);
            ps.setInt(4, ano_publicacion);
            ps.setString(5, descripcion);
            ps.setString(6, tipo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarLibro() {
        String sql = "SELECT * FROM libro";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("isbn") + " - " +
                    rs.getString("titulo") + " - " +
                    rs.getInt("ano_publicacion") + " - " +
                    rs.getString("descripcion") + " - " +
                    rs.getString("tipo")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarLibro(String titulo, int id) {
        String sql = "UPDATE libro SET titulo=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, titulo);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarLibro(int id) {
        String sql = "DELETE FROM libro WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

