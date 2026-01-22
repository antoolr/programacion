package REjerciciosT5.Actividad2;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("REjerciciosT5/Actividad2/heroes.json"));
        // Convertir objeto a JSON y procesarlo
        JSONArray arr = (JSONArray) ob;
                
        //Recorrer cada elemento de ese array JSON
        for (Object item : arr) {
            JSONObject data = (JSONObject) item;
            String publisher = (String) data.get("publisher");
            String superhero = (String) data.get("superhero");

          if (publisher.equals("DC Comics") && superhero.startsWith("G")) { 
            System.out.println(superhero + " - " + publisher); 
            }
        
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

