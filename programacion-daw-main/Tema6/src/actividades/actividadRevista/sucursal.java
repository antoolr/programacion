package Tema6.src.actividades.actividadRevista;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class sucursal {

    public static void insertarSucursal(int codigo, String telefono, String direccion, String ciudad, String provincia) {
        String sql = "INSERT INTO sucursal VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setString(4, ciudad);
            ps.setString(5, provincia);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarSucursal() {
        String sql = "SELECT * FROM sucursal";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo") + " - " +
                    rs.getString("telefono") + " - " +
                    rs.getString("direccion") + " - " +
                    rs.getString("ciudad") + " - " +
                    rs.getString("provincia")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarSucursal(String ciudad, int codigo) {
        String sql = "UPDATE sucursal SET ciudad=? WHERE codigo=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, ciudad);
            ps.setInt(2, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarSucursal(int codigo) {
        String sql = "DELETE FROM sucursal WHERE codigo=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

