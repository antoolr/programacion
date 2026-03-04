package actividades.ActividadMVC1.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import actividades.conexiones.conexionact;

public class alumnoDAO {
    
    public void insertar(alumno al) {
        String sql = "INSERT INTO alumno (numero_matricula, nombre, apellido1, apellido2, telefono, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, al.getNumero_matricula());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getApellido1());
            ps.setString(4, al.getApellido2());
            ps.setString(5, al.getTelefono());
            ps.setString(6, al.getFecha_nacimiento());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar alumno: " + e.getMessage());
        }
    }

    public List<alumno> listar() {
        List<alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try (Connection conn = conexionact.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new alumno(
                    rs.getString("nombre"), rs.getString("apellido1"), rs.getString("apellido2"),
                    rs.getString("telefono"), rs.getString("fecha_nacimiento"), rs.getInt("numero_matricula")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar alumnos: " + e.getMessage());
        }
        return lista;
    }
}