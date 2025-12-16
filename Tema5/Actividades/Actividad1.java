package Tema5.Actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
    File archivo = null;
    FileReader lector = null;
    BufferedReader buffer = null;

    Scanner teclado = new Scanner(System.in);

    try {
        archivo = new File ("./Tema5/Actividades/numeros.txt");
        lector = new FileReader (archivo);
        buffer = new BufferedReader (lector);

        buffer = new BufferedReader(new FileReader(new File("./Tema5/Actividades/numeros.txt")));
        double contador =0, suma=0, numero;
        double media = 0;

        String linea;
        //Vamos a leer el fichero de principio a fin
        while( (linea = buffer.readLine()) != null) {
            System.out.println(linea);
            numero = Integer.parseInt(linea);
            suma += numero;
            contador++;

        }
        media = suma/contador;
        System.out.println("Hay "+contador+ " numeros y su media es "+media+ " y su suma es " +suma);
        

    }catch (Exception e){
        e.printStackTrace();
    
}
}
}
