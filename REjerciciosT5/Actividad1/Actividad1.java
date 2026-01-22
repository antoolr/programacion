package REjerciciosT5.Actividad1;
import java.io.*;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Ruta del primer archivo: ");
        String ruta1 = sc.nextLine();

        System.out.print("Ruta del segundo archivo: ");
        String ruta2 = sc.nextLine();

        System.out.print("Ruta del directorio destino: ");
        String destino = sc.nextLine();

        try {
            File archivo1 = new File(ruta1);
            File archivo2 = new File(ruta2);

            String nombre1 = archivo1.getName().replace(".txt", "");
            String nombre2 = archivo2.getName().replace(".txt", "");
            String nombreFinal = nombre1 + "_" + nombre2 + ".txt";

            File archivoDestino = new File(destino + File.separator + nombreFinal);
            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivoDestino));

            copiarContenido(archivo1, escribir);
            escribir.write(" "); 
            copiarContenido(archivo2, escribir);

            escribir.close();
            System.out.println("Archivo creado: " + archivoDestino.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }

        sc.close();
    }

    public static void copiarContenido(File archivo, BufferedWriter escribir) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            escribir.write(linea);
            escribir.newLine();
        }
        br.close();
    }
}
