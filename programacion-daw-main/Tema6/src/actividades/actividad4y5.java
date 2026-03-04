package actividades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import actividades.conexiones.conexionact;

public class actividad4y5 {

    public static void main(String[] args) {
        System.out.println("--- EJECUTANDO CONSULTAS RESTANTES ---");
        
        consultaEquiposLocalesGanadores();
        
        consultaMaximosAnotadoresTemporada();
    }

   
    public static void consultaEquiposLocalesGanadores() {
        String sql = "SELECT DISTINCT equipo_local FROM partidos " +
                     "WHERE puntos_local > 100 " +
                     "AND puntos_local > puntos_visitante " +
                     "AND temporada = '02/03'";

        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Equipos locales ganadores (>100 pts) en 02/03 ---");
            while (rs.next()) {
                System.out.println("Equipo: " + rs.getString("equipo_local"));
            }

        } catch (SQLException e) {
            System.err.println("Error en consulta 4: " + e.getMessage());
        }
    }

   
    public static void consultaMaximosAnotadoresTemporada() {
        String sql = "SELECT j.Nombre, e.temporada, e.Puntos_por_partido " +
                     "FROM jugadores j, estadisticas e " +
                     "WHERE e.jugador = j.codigo " +
                     "AND (e.temporada, e.Puntos_por_partido) IN " +
                     "(SELECT temporada, MAX(Puntos_por_partido) FROM estadisticas GROUP BY temporada) " +
                     "ORDER BY e.temporada";

        try (Connection conn = conexionact.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Máximos anotadores por cada temporada ---");
            while (rs.next()) {
                System.out.println("Temporada: " + rs.getString("temporada") + 
                                   " | Jugador: " + rs.getString("Nombre") + 
                                   " | Puntos: " + rs.getFloat("Puntos_por_partido"));
            }

        } catch (SQLException e) {
            System.err.println("Error en consulta 5: " + e.getMessage());
        }
    }
}