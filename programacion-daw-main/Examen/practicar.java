package Examen;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

import clases.src.ciudad;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class practicar {
    public static void main(String[] args) throws IOException {

        // // 1. Crear un objeto JSON
        //  JSONObject objeto = new JSONObject(); 
        //  objeto.put("nombre","Antonio"); 
        //  objeto.put("edad", 25); 
        //  objeto.put("ciudad", "Albox");

        //  //2. Guardarlo en un archivo
        // try
        // (FileWriter fw = new FileWriter("programacion-daw-main/Examen/datos.json")) { 
        // fw.write(objeto.toString(4)); // 4 = sangría bonita 
        // System.out.println("Archivo JSON creado correctamente."); 
        // } catch (IOException e) { 
        //     e.printStackTrace(); } 

        // // 3. Leer el archivo JSON 
        // try {
        // String contenido = new String(Files.readAllBytes(Paths.get("programacion-daw-main/Examen/datos.json"))); 
        // JSONObject leido = new JSONObject(contenido); 
        
        // // 4. Mostrar los datos 
        // System.out.println("Nombre leído: " + leido.getString("nombre")); 
        // System.out.println("Edad leída: " + leido.getInt("edad")); 
        // System.out.println("Ciudad leída: "+leido.getString("ciudad"));
        // } catch (IOException e) 
        // { e.printStackTrace(); }


        JSONArray personas = new JSONArray();
        JSONObject p1 = new JSONObject();
        p1.put("nombre", "Sofia");
        p1.put("edad", "18");
        personas.put(p1);

        JSONObject p2 = new JSONObject();
        p2.put("nombre", "Antonio");
        p2.put("edad", "19");
        personas.put(p2);

        JSONObject p3 = new JSONObject();
        p3.put("nombre", "Manue");
        p3.put("edad", "24");
        personas.put(p3);


        try {
            FileWriter escribir = new FileWriter("programacion-daw-main/Examen/personas.json");
            escribir.write(personas.toString(4));
            escribir.close();
            System.out.println("Creado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileReader leer = new FileReader("programacion-daw-main/Examen/personas.json");
            System.out.println("Se ha leido guay");
            leer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        String contenido = new String(Files.readAllBytes(Paths.get("programacion-daw-main/Examen/personas.json")));
        JSONArray array = new JSONArray(contenido);

        


    }
}