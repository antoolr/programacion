package Tema5.Actividades;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ActividadJSON {
     public static void main(String[] args) {
        try {
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("./Tema5/heroes.json"));
        // Convertir objeto a JSON y procesarlo
        JSONObject js = (JSONObject) ob;
        //Accediendo a cada componente clave del JSON
        
        // Leyendo el array guardado en la clave phoneNumber
        JSONArray arr = (JSONArray) js.get("heroes.json");
        //Recorrer cada elemento de ese array JSON
        for (Object item : arr) {
            JSONObject data = (JSONObject) item;
            String publisher = (String) data.get("publisher");
            String alterEgo = (String) data.get("alter_ego");
            System.out.println(publisher + " - " + alterEgo);

            if (publisher.equals("Marvel Comics")) {
                System.out.println(alterEgo);
            }
        
        }
    }
    catch (Exception e){
        System.out.println("Algo ha fallado");
    }
}
}
