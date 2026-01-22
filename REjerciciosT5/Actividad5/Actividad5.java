package REjerciciosT5.Actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Actividad5 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new FileReader("REjerciciosT5/Actividad5/credenciales.txt"));
        HashMap<String, String> credenciales = new HashMap<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("-");
            if (partes.length == 2) {
                credenciales.put(partes[0], partes[1]); // usuario → contraseña
            }
        }
        br.close();

        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Usuario: ");
            String usuario = teclado.nextLine();
            System.out.print("Contraseña: ");
            String contraseña = teclado.nextLine();
            if (credenciales.containsKey(usuario) && credenciales.get(usuario).equals(contraseña)) {
                System.out.println("Ha accedido al área restringida");
                break;
            } else {
                intentos--;
                System.out.println("Lo siento, no tiene acceso al área restringida, le quedan " + intentos + " intentos.");
            }
        }
    }
}
