package actividades.ActividadMVC2.Modelo;


import java.sql.*;
import java.util.ArrayList;
import actividades.conexiones.conexionact;
public class profesorDAO {

    public void insertar(profesor p) {
        String sql = "INSERT INTO profesor VALUES (NULL, ?, ?, ?, ?, ?)";

        try (Connection con = conexionact.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido1());
            ps.setString(3, p.getApellido2());
            ps.setString(4, p.getEspecialidad());
            ps.setString(5, p.getTelefono());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error insertando profesor: " + e.getMessage());
        }
    }

    public ArrayList<profesor> listar() {
        ArrayList<profesor> lista = new ArrayList<>();
        String sql = "SELECT * FROM profesor";

        try (Connection con = conexionact.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                profesor p = new profesor(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido1"),
                    rs.getString("apellido2"),
                    rs.getString("especialidad"),
                    rs.getString("telefono")
                );
                lista.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error listando profesores: " + e.getMessage());
        }

        return lista;
    }
}

