package Tema5.Actividades;

//InputMismatchException en Java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) throws IOException {
    File archivo = null;
    FileReader lector = null;
    BufferedReader buffer = null;

    archivo = new File ("./Tema5/Actividades/numeros.txt");
    lector = new FileReader(archivo);
    buffer = new BufferedReader(lector);

    String linea = buffer.readLine();
    System.out.println(linea);
    String[] numeros = linea.split(",");
    System.out.println(numeros.length);
    
}
}