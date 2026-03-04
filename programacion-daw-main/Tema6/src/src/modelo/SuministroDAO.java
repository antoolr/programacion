package src.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SuministroDAO {
    
    public void insertar(int codigo_proveedor, int codigo_pieza, int cantidad, java.sql.Date fecha) {
        String sql = "INSERT INTO suministra (codigo_proveedor, codigo_pieza, cantidad, fecha) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.setInt(3, cantidad);
            ps.setDate(4, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }

    public List<Suministro> listar() {
        List<Suministro> lista = new ArrayList<>();
        String sql = "SELECT * FROM suministra";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Suministro(
                    rs.getInt("codigo_proveedor"),
                    rs.getInt("codigo_pieza"),
                    rs.getInt("cantidad"),
                    rs.getDate("fecha")));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }

    public void actualizarCantidad(int codProv, int codPieza, int nuevaCantidad) {
        // Importante: Cantidad es el 1º ?, Proveedor el 2º y Pieza el 3º
        String sql = "UPDATE suministra SET cantidad=? WHERE codigo_proveedor=? AND codigo_pieza=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevaCantidad);
            ps.setInt(2, codProv);
            ps.setInt(3, codPieza);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar: " + e.getMessage());
        }
    }

    public void borrar(int codProv, int codPieza) {
        String sql = "DELETE FROM suministra WHERE codigo_proveedor=? AND codigo_pieza=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codProv);
            ps.setInt(2, codPieza);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
    }
}