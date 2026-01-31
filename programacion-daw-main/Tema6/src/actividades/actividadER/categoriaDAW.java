package Tema6.src.actividades.actividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

public class categoriaDAW {

private static final String categoria = null;
public static void insertar(int codigo, String nombre) {
 String sql = "INSERT INTO categoria VALUES (?, ?)";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setInt(1, codigo);
 ps.setString(2, nombre);
 ps.executeUpdate();
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 }
 // READ (SELECT)
 public static void listar() {
 String sql = "SELECT * FROM categoria";
 try (Connection conn = conexionact.getConnection();
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery(sql)) {
 while (rs.next()) {
 System.out.println(
 rs.getInt("codigo") + " - " + rs.getString("nombre")
 );
 }
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 
 }

 // UPDATE
 public static void actualizar(int codigo, String nuevoNombre) {
 String sql = "UPDATE categoria SET nombre=? WHERE codigo=?";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setString(1, nuevoNombre);
 ps.setInt(2, codigo);
 ps.executeUpdate();
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 }
 // DELETE
 public static void borrar(int codigo) {
 String sql = "DELETE FROM categoria WHERE codigo=?";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setInt(1, codigo);
 ps.executeUpdate();
 } catch (SQLException e) {
 System.err.println(e.getMessage());
 }
 }



}