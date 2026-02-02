package Examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONWriter;
import com.mysql.cj.xdevapi.JsonArray;
import clases.src.ciudad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.*;
import org.json.JSONObject;

public class practicar {
    public static void main(String[] args) throws IOException {

        // Copiar informacion de 2 archivos en uno
        String a = Files.readString(Paths.get("a.txt"));
        String b = Files.readString(Paths.get("b.txt"));
        String combinado = a + "\n" + b;
        Files.writeString(Paths.get("c.txt"), combinado);
        System.out.println("Archivos combinados correctamente.");

        // Leer y modificar JSONObject
        String contenido = Files.readString(Paths.get("datos.json"));
        JSONObject obj = new JSONObject(contenido);

        // Leer
        System.out.println(obj.getString("nombre"));
        System.out.println(obj.getInt("edad"));

        // // Modificar
        obj.put("ciudad", "Madrid");

        // Guardar
        Files.writeString(Paths.get("datos.json"), obj.toString(4));

        // Leer y recorrer un JSONArray
        String contenido2 = Files.readString(Paths.get("alumnos.json"));
        JSONArray arr = new JSONArray(contenido);
        for (int i = 0; i < arr.length(); i++) {
            JSONObject alumno = arr.getJSONObject(i);
            System.out.println(alumno.getString("nombre") + " - " +
                    alumno.getInt("edad"));
        }

        // Crear un JSONArray y guardarlo
        JSONArray arr2 = new JSONArray();
        JSONObject a1 = new JSONObject();
        a1.put("nombre", "Pedro");
        a1.put("edad", 22);
        JSONObject a2 = new JSONObject();
        a2.put("nombre", "Lucia");
        a2.put("edad", 19);
        arr.put(a1);
        arr.put(a2);
        Files.writeString(Paths.get("nuevo.json"), arr.toString(4));

        // Leer linea a linea un archivo .txt
        List<String> lineas = Files.readAllLines(Paths.get("datos.txt"));

        for (String linea : lineas) {
            System.out.println(linea);
        }

        // Leer todo el archivo como String
        String contenido3 = Files.readString(Paths.get("datos.txt"));
        System.out.println(contenido3);

        // Sobreescribir archivo .txt
        Files.writeString(Paths.get("salida.txt"), "Hola mundo");

        // Añadir texto sin borrar lo anterior
        Files.writeString(Paths.get("salida.txt"), "Nueva línea\n", StandardOpenOption.APPEND);

        // Filtrar un JSON cuando es JSONObject
        String contenido4 = Files.readString(Paths.get("datos.json"));
        JSONObject obj2 = new JSONObject(contenido4);
        if (obj.getInt("edad") == 18) {
            System.out.println("Tiene 18 años: " + obj2.getString("nombre"));
        }

        //Filtrar un JSON cuando es JSONArray
        String contenido5 = Files.readString(Paths.get("datos.json"));
        JSONArray arr3 = new JSONArray(contenido5);
        for (int i = 0; i < arr3.length(); i++) {
            JSONObject persona = arr3.getJSONObject(i);
            if (persona.getInt("edad") == 18) {
                System.out.println("Tiene 18 años: " + persona.getString("nombre"));
            }
        }

        //Filtrar por nombre que empieza por A
        // if (persona.getString("nombre").startsWith("A")) { ... }

        //Filtrar por persona que tenga mas de 20 años
        // if (persona.getInt("edad") > 20) { ... }


        //Filtrar por ciudad igual a madrid
        // if (persona.getString("ciudad").equals("Madrid")) { ... }

        // Guardar claves String y valores Integer
        HashMap<String, Integer> mapa = new HashMap<>();

        //Guardar claves String y valores String
        HashMap<String, String> diccionario = new HashMap<>();


        // put(clave, valor) → Añadir o actualizar
        mapa.put("BMW", 1);

        //containsKey(clave) → Comprobar si existe
        if (mapa.containsKey("BMW")) { }

        //get(clave) → Obtener el valor
        int veces = mapa.get("BMW");

        //remove(clave) → Eliminar
        mapa.remove("BMW");

        // Recorrer un HashMap
        for (String clave : mapa.keySet()) {
        System.out.println(clave + " → " + mapa.get(clave));
        }

        // Diccionario simple
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");
        capitales.put("Alemania", "Berlín");
        capitales.put("Portugal", "Lisboa");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un país: ");
        String pais = sc.nextLine();

        if (capitales.containsKey(pais)) {
            System.out.println("Capital: " + capitales.get(pais));
        } else {
            System.out.println("No está en el diccionario.");
        }



        // Contar apariciones
        String[] colores = {"rojo", "azul", "rojo", "verde", "azul"};

        HashMap<String, Integer> contador = new HashMap<>();

        for (String color : colores) {
            if (contador.containsKey(color)) {
                contador.put(color, contador.get(color) + 1);
            } else {
                contador.put(color, 1);
            }
        }

        System.out.println(contador);

        //Hashmap inverso
        HashMap<String, String> mapa2 = new HashMap<>();
        mapa2.put("España", "Madrid");
        mapa2.put("Francia", "París");
        mapa2.put("Italia", "Roma");

        HashMap<String, String> inverso = new HashMap<>();

        for (String clave : mapa.keySet()) {
            inverso.put(mapa2.get(clave), clave);
        }

        System.out.println(inverso);

    //Foreach
    String[] nombres = {"Ana", "Luis", "Pedro"};

    for (String n : nombres) {
    System.out.println(n);
    }

    //Foreach ArrayList
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(10);
    lista.add(20);
    lista.add(30);

    for (int num : lista) {
    System.out.println(num);
    }

    //Recorrer hashmap (claves)
    HashMap<String, Integer> edades = new HashMap<>();
    edades.put("Juan", 18);
    edades.put("Ana", 20);

    for (String clave : edades.keySet()) {
    System.out.println(clave + " → " + edades.get(clave));
    }

    //Recorrer JSONArray
    JSONArray arr4 = new JSONArray(contenido);

    for (Object o : arr4) {
    JSONObject persona = (JSONObject) o;
    System.out.println(persona.getString("nombre"));
    }




    }
}
