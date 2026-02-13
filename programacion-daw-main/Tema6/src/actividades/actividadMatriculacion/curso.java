package Tema6.src.actividades.actividadMatriculacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

public class curso {
    public static void insertarCurso(int id, int ano_inicio, int ano_fin) {
        String sql = "INSERT INTO curso_escolar VALUES (?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setInt(2, ano_inicio);
            ps.setInt(3, ano_fin);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarCurso() {
        String sql = "SELECT * FROM curso_escolar";
        try (Connection conn = conexionact.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getInt("ano_inicio") + " - " + rs.getInt("ano_fin"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarCurso(int ano_inicio, int id) {
        String sql = "UPDATE curso_escolar SET ano_inicio=? WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, ano_inicio);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarCurso(int id) {
        String sql = "DELETE FROM curso_escolar WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
