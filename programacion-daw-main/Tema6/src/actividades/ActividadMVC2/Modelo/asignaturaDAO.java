package actividades.ActividadMVC2.Modelo;


import java.sql.*;
import java.util.ArrayList;

import actividades.conexiones.conexionact;

public class asignaturaDAO {

    public void insertar(asignatura a) {
        String sql = "INSERT INTO asignatura VALUES (?, ?, ?, ?)";

        try (Connection con = conexionact.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getNombre());
            ps.setInt(3, a.getNumeroHoras());
            ps.setInt(4, a.getProfesor().getId());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error insertando asignatura: " + e.getMessage());
        }
    }

    public ArrayList<asignatura> listar() {
        ArrayList<asignatura> lista = new ArrayList<>();

        String sql = """
            SELECT a.codigo, a.nombre, a.numero_horas,
                   p.id AS pid, p.nombre AS pnombre, p.apellido1, p.apellido2, p.especialidad, p.telefono
            FROM asignatura a
            JOIN profesor p ON a.id_profesor = p.id
        """;

        try (Connection con = conexionact.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                profesor p = new profesor(
                    rs.getInt("pid"),
                    rs.getString("pnombre"),
                    rs.getString("apellido1"),
                    rs.getString("apellido2"),
                    rs.getString("especialidad"),
                    rs.getString("telefono")
                );

                asignatura a = new asignatura(
                    rs.getInt("codigo"),
                    rs.getString("nombre"),
                    rs.getInt("numero_horas"),
                    p
                );

                lista.add(a);
            }

        } catch (Exception e) {
            System.out.println("Error listando asignaturas: " + e.getMessage());
        }

        return lista;
    }
}

