package Tema5.Actividades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        try {
            Scanner sc = new Scanner(new File("Tema5/Actividades/numeros.txt"));
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                suma += num;
                contador++;
            }
            sc.close();
            if (contador > 0) {
                double media = (double) suma / contador;
                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            } else {
                System.out.println("El archivo no contiene números.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
    }
}
