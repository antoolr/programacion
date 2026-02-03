//InputMismatchException en Java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // // File archivo = null;
    // FileReader lector = null;
    // BufferedReader buffer = null;

    // try {
    //     // archivo = new File ("./Tema5/Actividades/numeros.txt");
    //     lector = new FileReader (archivo);
    //     buffer = new BufferedReader (lector);

    //     String linea;
    //     //Vamos a leer el fichero de principio a fin
    //     while( (linea = buffer.readLine()) != null) {
    //         System.out.println(linea);
    //     }
    // } 
    // catch (Exception e){
    //     e.printStackTrace();
        
    // }finally {
    //     try{
    //         if (null != lector){
    //             //Vamos a cerrar el descriptor del archivo
    //             lector.close();

    //         }
    //     }catch (Exception e2){
    //         e2.printStackTrace();
    //     }
    //     }

        String contenido = "Este es un ejemplo de uso de BufferedWriter en Java.";
 try {
 FileWriter archivo = new FileWriter("./Tema5/Actividades/numeros.txt"); 
 BufferedWriter escritor = new BufferedWriter(archivo);
 escritor.write(contenido); // Escribimos la cadena en el archivo
 escritor.newLine(); // Añadimos una nueva línea pene
 escritor.flush(); // Aseguramos que se escriban los datos
 escritor.close(); // Cerramos el BufferedWriter
 System.out.println("¡Archivo escrito con éxito!");
 } catch (IOException e) {
 e.printStackTrace();
 }

    }
    
    }


