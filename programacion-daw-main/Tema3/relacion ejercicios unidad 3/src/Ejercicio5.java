import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
       int[] valores = {5, 12, 23, 34, 41, 45};
    ArrayList<Integer> numerosGanadores = new ArrayList<>();
    for (int n : valores) {
    numerosGanadores.add(n);
}



        ArrayList<Integer> numerosUsuario = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tus 6 números de la Bonoloto:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = teclado.nextInt();
            numerosUsuario.add(numero);
        }

        int aciertos = contarAciertos(numerosGanadores, numerosUsuario);
        System.out.println("Has tenido " + aciertos + " aciertos.");
    }

    public static int contarAciertos(ArrayList<Integer> ganadores, ArrayList<Integer> usuario) {
        int contador = 0;

        for (int numero : usuario) {
            if (ganadores.contains(numero)) {
                contador++;
            }
        }

        return contador;
    }
}