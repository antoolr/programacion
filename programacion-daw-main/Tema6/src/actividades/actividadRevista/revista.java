package Tema6.src.actividades.actividadRevista;

import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class revista {

    public static void insertarRevista(int numero_registro, String titulo, String tipo,
                                       String periodicidad, int codigo_sucursal) {
        String sql = "INSERT INTO revista VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, numero_registro);
            ps.setString(2, titulo);
            ps.setString(3, tipo);
            ps.setString(4, periodicidad);
            ps.setInt(5, codigo_sucursal);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarRevista() {
        String sql = "SELECT * FROM revista";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("numero_registro") + " - " +
                    rs.getString("titulo") + " - " +
                    rs.getString("tipo") + " - " +
                    rs.getString("periodicidad") + " - " +
                    rs.getInt("codigo_sucursal")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarRevista(String titulo, int numero_registro) {
        String sql = "UPDATE revista SET titulo=? WHERE numero_registro=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, titulo);
            ps.setInt(2, numero_registro);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarRevista(int numero_registro) {
        String sql = "DELETE FROM revista WHERE numero_registro=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, numero_registro);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

