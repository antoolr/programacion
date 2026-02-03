package ExamenT5.Ejercicio1;

import java.util.*;
import java.io.*;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo: ");
        //   Ruta:  ExamenT5/Ejercicio1/ejemplo.txt
        String nombre = teclado.nextLine();

        File archivo = new File(nombre);
        if (!archivo.exists()) {
            System.out.println("El archivo no existe");
            return;
        }

        ArrayList<String> lineas = new ArrayList<>();

        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = leer.readLine()) != null) {
                if (!linea.trim().startsWith("/")) {
                    lineas.add(linea);
                }
            }
           

            PrintWriter escribir = new PrintWriter(new FileWriter(archivo));
            for (String l : lineas) {
                escribir.println(l);
            }
            

            System.out.println("Archivo procesado correctamente.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

