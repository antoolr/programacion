package Tema5.Actividades.ProyectoHeroes;

import java.io.FileReader;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        Map<String, List<Heroe>> mapa = new HashMap<>();
        try (FileReader reader = new FileReader("Tema5/ProyectoHeroes/heroes.json");) {
            JSONArray array = (JSONArray) parser.parse(reader);
            for (Object obj : array) {
                JSONObject heroeJson = (JSONObject) obj;
                String nombre = (String) (heroeJson.get("superhero") != null ? heroeJson.get("superhero") : heroeJson.get("nombre"));
                String editorial = (String) (heroeJson.get("publisher") != null ? heroeJson.get("publisher") : heroeJson.get("editorial"));
                if (nombre == null) nombre = "Desconocido";
                if (editorial == null) editorial = "Desconocida";
                Heroe h = new Heroe(nombre, editorial);
                mapa.putIfAbsent(editorial, new ArrayList<>());
                mapa.get(editorial).add(h);
            }
        }
        for (String editorial : mapa.keySet()) {
            System.out.println("Editorial: " + editorial);
            for (Heroe h : mapa.get(editorial)) {
                System.out.println(" - " + h.getNombre());
            }
        }
    }
}