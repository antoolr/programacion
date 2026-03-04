package actividades.ActividadMVC2.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import actividades.conexiones.conexionact;

public class alumnoDAO {
    
    public void insertar(alumno al) {
        String sql = "INSERT INTO alumno (numero_matricula, nombre, apellido1, apellido2, telefono, fecha_nacimiento) VALUES (?,?,?,?,?,?)";
        try (Connection conn = conexionact.getConnection(); 
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, al.getNumeroMatricula());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getApellido1());
            ps.setString(4, al.getApellido2());
            ps.setString(5, al.getTelefono());
            ps.setString(6, al.getFechaNacimiento());
            ps.executeUpdate();
        } catch (SQLException e) { System.err.println("Error al insertar alumno: " + e.getMessage()); }
    }

    public List<alumno> listar() {
        List<alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try (Connection conn = conexionact.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new alumno(
                    rs.getInt("numero_matricula"), rs.getString("nombre"), rs.getString("apellido1"),
                    rs.getString("apellido2"), rs.getString("telefono"), rs.getString("fecha_nacimiento")
                ));
            }
        } catch (SQLException e) { System.err.println("Error al listar alumnos: " + e.getMessage()); }
        return lista;
    }

    public void actualizar(alumno al) {
        String sql = "UPDATE alumno SET nombre=?, apellido1=?, apellido2=?, telefono=?, fecha_nacimiento=? WHERE numero_matricula=?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, al.getNombre());
            ps.setString(2, al.getApellido1());
            ps.setString(3, al.getApellido2());
            ps.setString(4, al.getTelefono());
            ps.setString(5, al.getFechaNacimiento());
            ps.setInt(6, al.getNumeroMatricula());
            ps.executeUpdate();
        } catch (SQLException e) { System.err.println("Error al actualizar alumno: " + e.getMessage()); }
    }

    public void eliminar(int matricula) {
        String sql = "DELETE FROM alumno WHERE numero_matricula = ?";
        try (Connection conn = conexionact.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, matricula);
            ps.executeUpdate();
        } catch (SQLException e) { System.err.println("Error al eliminar alumno: " + e.getMessage()); }
    }
}