package REjerciciosT5.Actividad3;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class Actividad3 {
    public static void main(String[] args) {
        try {
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("REjerciciosT5/Actividad3/asignatura.json"));
        // Convertir objeto a JSON y procesarlo
        JSONObject js = (JSONObject) ob;
        JSONArray arr = (JSONArray) js.get("alumnos");


        HashMap<String,Integer> mapa = new HashMap<>();
        for (Object item : arr) {

    JSONObject alumno = (JSONObject) item;
    String nombre = (String) alumno.get("nombre");
    JSONArray notas = (JSONArray) alumno.get("notas");

    int suma = 0;
    for (Object notaObj : notas) {
        long nota = (long) notaObj;
        suma += nota;

        if (nota < 5) {
            mapa.put("Suspensos", mapa.getOrDefault("Suspensos", 0) + 1);
        } else if (nota <= 6) {
            mapa.put("Aprobados", mapa.getOrDefault("Aprobados", 0) + 1);
        } else if (nota <= 8) {
            mapa.put("Notables", mapa.getOrDefault("Notables", 0) + 1);
        } else {
            mapa.put("Sobresalientes", mapa.getOrDefault("Sobresalientes", 0) + 1);
        }
    }

    double media = (double) suma / notas.size();
    String categoria;

if (media < 5) {
    categoria = "Suspenso";
} else if (media <= 6) {
    categoria = "Aprobado";
} else if (media <= 8) {
    categoria = "Notable";
} else {
    categoria = "Sobresaliente";
}

System.out.printf("Alumno: %-10s Media: %.2f %s\n", nombre, media, categoria);


   

}

    }catch (Exception e) {
        e.printStackTrace();
}
}
}
