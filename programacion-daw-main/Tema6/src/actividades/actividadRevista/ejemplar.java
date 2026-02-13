package Tema6.src.actividades.actividadRevista;


import java.sql.*;
import Tema6.src.actividades.conexiones.conexionact;

public class ejemplar {

    public static void insertarEjemplar(int id, Date fecha, int numero_paginas,
                                        int numero_ejemplares, int numero_revista) {
        String sql = "INSERT INTO ejemplar VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setDate(2, fecha);
            ps.setInt(3, numero_paginas);
            ps.setInt(4, numero_ejemplares);
            ps.setInt(5, numero_revista);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listarEjemplar() {
        String sql = "SELECT * FROM ejemplar";
        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getDate("fecha") + " - " +
                    rs.getInt("numero_paginas") + " - " +
                    rs.getInt("numero_ejemplares") + " - " +
                    rs.getInt("numero_revista")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizarEjemplar(int numero_paginas, int id) {
        String sql = "UPDATE ejemplar SET numero_paginas=? WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, numero_paginas);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrarEjemplar(int id) {
        String sql = "DELETE FROM ejemplar WHERE id=?";
        try (Connection conn = conexionact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

