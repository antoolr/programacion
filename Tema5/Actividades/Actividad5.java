package Tema5.Actividades;
 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la palabra a buscar: ");
        String palabra = teclado.nextLine();

        int contador = 0;

        try {
            Scanner sc = new Scanner(new File("Tema5/Actividades/texto.txt"));

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] palabras = linea.split("\\s+");

                for (String p : palabras) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }

            sc.close();

            System.out.println("La palabra aparece " + contador + " veces.");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
    }
}

