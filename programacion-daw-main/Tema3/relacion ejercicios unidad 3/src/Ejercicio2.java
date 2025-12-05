import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = teclado.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Vector original: " + Arrays.toString(numeros));

        Arrays.sort(numeros); 

        System.out.print("Vector ordenado: ");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}

