package Tema6.actividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class actividad3 {
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
        //  crearPersona(9393, "Adriancito", "Colombia", 2.05, 90, "Base", "Timberwolves");
        //  eliminarPersona("Adriancito");

    }

    public static void eliminarPersona(String Nombre) {
 String sql = "DELETE FROM jugadores WHERE Nombre = ? ";
 try (Connection conn = conexionact.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
 ps.setString(1, Nombre);
 ps.executeUpdate();
 System.out.println("Persona eliminada.");
 } catch (SQLException e) {
 System.err.println("Error al borrar: " + e.getMessage());
 }
}

    public static void listarPersonas() {
    String sql = "Select * From jugadores";


    try (Connection conn = conexionact.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql);

    ResultSet rs = ps.executeQuery()) {
    while (rs.next()) {
    System.out.println(
    rs.getInt("codigo") + ": " +
    rs.getString("Nombre") + ": " +
    rs.getString("Procedencia") + ": " +
    rs.getString("Altura") + ": " +
    rs.getInt("Peso") + " - " +
    rs.getString("Posicion") + " - " +
    rs.getString("Nombre_equipo"));
    }

    } catch (SQLException e) {
    System.err.println("Error al leer: " + e.getMessage());
        }

    }



    public static void crearPersona(int codigo,String Nombre, String Procedencia, String Altura, int Peso, String Posicion, String Nombre_equipo) {
    String sql = "INSERT INTO jugadores (codigo, Nombre, Procedencia, Altura, Peso, Posicion, Nombre_equipo) Values (?, ?, ?, ?, ?, ?, ?)";
    try (Connection conn = conexionact.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, codigo);
    ps.setString(2, Nombre);
    ps.setString(3, Procedencia);
    ps.setString(4, Altura);
    ps.setInt(5, Peso);
    ps.setString(6, Posicion);
    ps.setString(7, Nombre_equipo);
    ps.executeUpdate();
    System.out.println("Persona creada.");
    } catch (SQLException e) {
     System.err.println("Error al insertar: " + e.getMessage());
    }


    
 }
}
