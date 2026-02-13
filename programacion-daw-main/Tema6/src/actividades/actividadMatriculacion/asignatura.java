package Tema6.src.actividades.actividadMatriculacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

public class asignatura {
    public static void insertarAsignatura(int codigo, String nombre, int numero_horas, int id_profesor) {
        String sql = "INSERT INTO asignatura VALUES (?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, numero_horas);
            ps.setInt(4, id_profesor);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarAsignatura() {
        String sql = "SELECT * FROM asignatura";
        try (Connection conn = conexionact.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("codigo") + " - " + rs.getString("nombre") + " - "
                        + rs.getInt("numero_horas") + " - " + rs.getInt("id_profesor"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarAsignatura(String nombre, int codigo) {
        String sql = "UPDATE asignatura SET nombre=? WHERE codigo=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarAsignatura(int codigo) {
        String sql = "DELETE FROM asignatura WHERE codigo=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
