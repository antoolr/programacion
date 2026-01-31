package Tema6.src.actividades.actividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;
import clases.src.ciudad;

public class ProveedorDAW {

    private static final String proveedor = null;
public static void insertar(int codigo, String direccion, String ciudad, String provincia) {
 String sql = "INSERT INTO Proveedor VALUES (?, ?, ?, ?)";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setInt(1, codigo);
 ps.setString(2, direccion);
 ps.setString(3, ciudad);
 ps.setString(4, provincia);
 ps.executeUpdate();
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 }

 // READ (SELECT)
 public static void listar() {
 String sql = "SELECT * FROM Proveedor";
 try (Connection conn = conexionact.getConnection();
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery(sql)) {
 while (rs.next()) {
 System.out.println(
 rs.getInt("codigo") + " - " + rs.getString("provincia") + " - " +rs.getString("ciudad") + " - " +rs.getString("direccion"));
 }
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 
 }

 // UPDATE
 public static void actualizar(int codigo, String nuevaProvincia) {
 String sql = "UPDATE Proveedor SET provincia=? WHERE codigo=?";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setString(1, nuevaProvincia);
 ps.setInt(2, codigo);
 ps.executeUpdate();
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 }
 // DELETE
 public static void borrar(int codigo) {
 String sql = "DELETE FROM Proveedor WHERE codigo=?";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setInt(1, codigo);
 ps.executeUpdate();
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 }

}
