package Tema5.Actividades;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad9 {
    public static void main(String[] args) {
        try {
            // Leer el archivo JSON (es un ARRAY)
            JSONArray arr = (JSONArray) new JSONParser().parse(new FileReader("Tema5/heroes.json"));

            // Recorrer cada héroe
            for (Object item : arr) {
                JSONObject data = (JSONObject) item;

                String publisher = (String) data.get("publisher");
                String heroe = (String) data.get("superhero");   // ← ESTA ES LA CLAVE CORRECTA
                String alterEgo = (String) data.get("alter_ego");

                // Filtrar solo Marvel
                if (publisher.equalsIgnoreCase("Marvel Comics")) {
                    System.out.println("Héroe: " + heroe);
                    System.out.println("Alter ego: " + alterEgo);
                    System.out.println("Editorial: " + publisher);
                }
            }

        } catch (Exception e) {
            System.out.println("Algo ha fallado");
            e.printStackTrace();
        }
    }
}

