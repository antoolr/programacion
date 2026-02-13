package Tema6.src.actividades.actividadMatriculacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

public class alumno {
    public static void insertarAlumno(int numero_matricula, String nombre, String apellido1, String apellido2, String fecha_nacimiento, String telefono) {
        String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numero_matricula);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, fecha_nacimiento);
            ps.setString(6, telefono);
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
            while (rs.next()) {
                System.out.println(rs.getInt("numero_matricula") + " - " + rs.getString("nombre") + " - "
                        + rs.getString("apellido1") + " - " + rs.getString("apellido2") + " - "
                        + rs.getDate("fecha_nacimiento") + " - " + rs.getString("telefono"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarAlumno(String nombre, int numero_matricula) {
        String sql = "UPDATE alumno SET nombre=? WHERE numero_matricula=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setInt(2, numero_matricula);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarAlumno(int numero_matricula) {
        String sql = "DELETE FROM alumno WHERE numero_matricula=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numero_matricula);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
