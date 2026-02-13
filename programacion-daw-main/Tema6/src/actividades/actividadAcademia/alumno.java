package Tema6.src.actividades.actividadAcademia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;
import clases.src.fecha;

public class alumno {
    public static void insertarAlumno(int id, String nif, String grupo, String nombre, String apellido1,
            String apellido2) {
        String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, grupo);
            ps.setString(4, nombre);
            ps.setString(5, apellido1);
            ps.setString(6, apellido2);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarAlumno() {
        String sql = "SELECT * FROM alumno";
        try (Connection conn = conexionact.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) { System.out.println( rs.getInt("id") + " - " + rs.getString("nif") + " - " + rs.getString("grupo") + " - " + rs.getString("nombre") + " - " + rs.getString("apellido1") + " - " + rs.getString("apellido2") ); 
                
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarAlumno(String nombre, int id) {
        String sql = "UPDATE alumno SET nombre=? WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarAlumno(int id) {
        String sql = "DELETE FROM alumno WHERE id=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
