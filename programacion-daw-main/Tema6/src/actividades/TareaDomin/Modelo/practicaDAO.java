package Tema6.src.actividades.TareaDomin.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

public class practicaDAO {
    public static void insertarPractica(int id, String titulo, String dificultad, int id_profesor, String fecha ) {
        String sql = "INSERT INTO practica VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setString(3, dificultad);
            ps.setInt(4, id_profesor);
            ps.setString(5, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarPractica() {
        String sql = "SELECT * FROM practica";
        try (Connection conn = conexionact.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("titulo") + " - " +rs.getString("dificultad") + " - " +rs.getInt("id_profesor") + " - " +rs.getString("fecha"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarPractica(String titulo, int id) {
        String sql = "UPDATE practica SET titulo=? WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarPractica(int id) {
        String sql = "DELETE FROM practica WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
