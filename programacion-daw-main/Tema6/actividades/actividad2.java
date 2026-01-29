package Tema6.actividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class actividad2 {
    public static void main(String[] args) {
        String sql = "Create table if not exists persona (id int auto_increment primary key, nombre varchar (30), email varchar (60))";
          try {
             Connection conn = conexionact.getConnection();
              Statement stat = conn.createStatement();
             stat.executeUpdate(sql);
             

         } catch (SQLException e) {
            System.out.println("Error al conectar: " +e.getMessage());
         }

    listarPersonas();
        
}
public static void listarPersonas() {
    String sql = "Select codigo, Nombre, Procedencia From jugadores where Procedencia = 'Spain' and Nombre_equipo = 'Lakers' ";

    try (Connection conn = conexionact.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql);

    ResultSet rs = ps.executeQuery()) {
    while (rs.next()) {
    System.out.println(
    rs.getInt("codigo") + " " +
    rs.getString("Nombre") + " " +
    rs.getString("Procedencia") + " ");
    }

    } catch (SQLException e) {
    System.err.println("Error al leer: " + e.getMessage());
        }

    }

// public static void actualizarPersona(int codigo, String Procedencia) {
//  String sql = "UPDATE jugadores SET Procedencia = ? WHERE codigo = ?";
//  try (Connection conn = conexionact.getConnection();
//  PreparedStatement ps = conn.prepareStatement(sql)) {
//  ps.setString(1, Procedencia);
//  ps.setInt(2, codigo);
//  ps.executeUpdate();
//  System.out.println("Persona actualizada.");
//  } catch (SQLException e) {
//  System.err.println("Error al actualizar: " + e.getMessage());
//  }
// }
}
