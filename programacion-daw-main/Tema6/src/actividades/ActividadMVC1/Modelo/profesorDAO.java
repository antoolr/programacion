package actividades.ActividadMVC1.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import actividades.conexiones.conexionact;

public class profesorDAO {
    public void insertar(String nif, String nombre, String ap1, String ap2, String ciudad, String dir, String tel, String fecha, String sexo) {
        String sql = "INSERT INTO profesor (nif, nombre, apellido1, apellido2, ciudad, direccion, telefono, fecha_nacimiento, sexo) VALUES (?,?,?,?,?,?,?,?,?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nif); ps.setString(2, nombre); ps.setString(3, ap1);
            ps.setString(4, ap2); ps.setString(5, ciudad); ps.setString(6, dir);
            ps.setString(7, tel); ps.setString(8, fecha);  ps.setString(9, sexo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar profesor: " + e.getMessage());
        }
    }
}