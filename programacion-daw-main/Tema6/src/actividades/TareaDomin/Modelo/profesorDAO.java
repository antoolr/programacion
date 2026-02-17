package Tema6.src.actividades.TareaDomin.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

public class profesorDAO {
    public static void insertarProfesor(int id, String nif, String nombre, String apellido1, String apellido2) {
        String sql = "INSERT INTO profesor VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, nombre);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarProfesor() {
        String sql = "SELECT * FROM profesor";
        try (Connection conn = conexionact.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + rs.getString("nif") + " - " + rs.getString("nombre") + " - " + rs.getString("apellido1") + " - " + rs.getString("apellido2"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarProfesor(String nombre, int id) {
        String sql = "UPDATE profesor SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarProfesor(int id) {
        String sql = "DELETE FROM profesor WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
