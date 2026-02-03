package ExamenT5.Ejercicio3;
import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {

        HashMap<String, String> traductor = new HashMap<>();

        traductor.put("caliente", "hot");
        traductor.put("rojo", "red");
        traductor.put("ardiente", "hot");
        traductor.put("verde", "green");
        traductor.put("agujetas", "stiff");
        traductor.put("abrasador", "hot");
        traductor.put("hierro", "iron");
        traductor.put("grande", "big");

        Scanner teclado = new Scanner(System.in);
        String palabra;

        while (true) {
            System.out.print("Escribe una palabra (o dalir): ");
            palabra = teclado.nextLine();

            if (palabra.equalsIgnoreCase("salir")) 
                return;

            if (traductor.containsKey(palabra)) {
                System.out.println("En inglés es: " + traductor.get(palabra));
            } else {
                System.out.println("Palabra no encontrada.");
            }
        }
    }
}
