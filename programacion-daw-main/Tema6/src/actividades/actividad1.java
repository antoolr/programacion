package Tema6.src.actividades;

import java.sql.Statement;

import Tema6.src.actividades.conexiones.conexionact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class actividad1 {
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
    String sql = "Select codigo, Nombre, Procedencia, Nombre_equipo From jugadores where Procedencia = 'Spain' and Nombre_equipo = 'Lakers' ";

    try (Connection conn = conexionact.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql);

    ResultSet rs = ps.executeQuery()) {
    while (rs.next()) {
    System.out.println(
    rs.getInt("codigo") + " " +
    rs.getString("Nombre") + " " +
    rs.getString("Procedencia") + " " +
    rs.getString("Nombre_equipo") + " ");
    }

    } catch (SQLException e) {
    System.err.println("Error al leer: " + e.getMessage());
        }

    }
}
