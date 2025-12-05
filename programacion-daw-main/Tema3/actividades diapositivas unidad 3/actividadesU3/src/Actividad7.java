import java.util.ArrayList;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        /*
         * Usa un ArrayList<String> para almacenar nombres
         * introducidos por el usuario hasta que escriba “fin”. Interesa que no se
         * repitan nombres y al terminar muestra todos los nombres ordenados.
         */
        ArrayList<String> lista=new ArrayList<>(); // Creación de una lista vacía
        Scanner teclado= new Scanner(System.in);
        String palabra;
        do{
        System.out.println();
        System.out.println("Introduzca una palabra o fin para terminar");
        palabra=teclado.nextLine();
        if(!palabra.equals("fin") && !lista.contains(palabra)) {
            lista.add(palabra);
        }
        }while(!palabra.equals("fin"));
        // Ordenamos la lista
        // lista.sort(String.CASE_INSENSITIVE_ORDER); // Le da igual las mayusculas

        lista.sort((a,b)->{return a.compareTo(b);}); // Primero las mayúsculas y luego las minúsculas
        // Sacar las palabras guardadas
        System.out.print("Contenido de la lista: ");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println();

        teclado.close();
    }
}
