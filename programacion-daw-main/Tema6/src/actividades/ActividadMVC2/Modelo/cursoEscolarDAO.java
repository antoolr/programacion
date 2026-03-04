package actividades.ActividadMVC2.Modelo;


import java.sql.*;
import java.util.ArrayList;

import actividades.conexiones.conexionact;

public class cursoEscolarDAO {

    public void insertar(cursoEscolar c) {
        String sql = "INSERT INTO curso_escolar VALUES (NULL, ?, ?)";

        try (Connection con = conexionact.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, c.getAnioInicio());
            ps.setInt(2, c.getAnioFin());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error insertando curso escolar: " + e.getMessage());
        }
    }

    public ArrayList<cursoEscolar> listar() {
        ArrayList<cursoEscolar> lista = new ArrayList<>();
        String sql = "SELECT * FROM curso_escolar";

        try (Connection con = conexionact.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                cursoEscolar c = new cursoEscolar(
                    rs.getInt("id"),
                    rs.getInt("anio_inicio"),
                    rs.getInt("anio_fin")
                );
                lista.add(c);
            }

        } catch (Exception e) {
            System.out.println("Error listando cursos escolares: " + e.getMessage());
        }

        return lista;
    }
}

