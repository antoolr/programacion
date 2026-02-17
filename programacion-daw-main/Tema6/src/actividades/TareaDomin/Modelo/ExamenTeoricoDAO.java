package Tema6.src.actividades.TareaDomin.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Tema6.src.actividades.conexiones.conexionact;


    public class ExamenTeoricoDAO {
    public static void insertarExamen(int id, String titulo, int numero_preguntas, String fecha, int id_profesor) {
        String sql = "INSERT INTO examen_teorico VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setInt(3, numero_preguntas);
            ps.setString(4, fecha);
            ps.setInt(5, id_profesor);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarExamen() {
        String sql = "SELECT * FROM examen_teorico";
        try (Connection conn = conexionact.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("titulo"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarExamen(String titulo, int id) {
        String sql = "UPDATE examen_teorico SET titulo=? WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarExamen(int id) {
        String sql = "DELETE FROM examen_teorico WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    }