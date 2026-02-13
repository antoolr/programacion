package Tema6.src.actividades.actividadLibreria;


import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class almacen {

    public static void insertarAlmacen(int id, String telefono, String direccion, int id_localidad) {
        String sql = "INSERT INTO almacen VALUES (?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setInt(4, id_localidad);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarAlmacen() {
        String sql = "SELECT * FROM almacen";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getString("direccion") + " - " +
                    rs.getInt("id_localidad")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarAlmacen(String direccion, int id) {
        String sql = "UPDATE almacen SET direccion=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, direccion);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarAlmacen(int id) {
        String sql = "DELETE FROM almacen WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
