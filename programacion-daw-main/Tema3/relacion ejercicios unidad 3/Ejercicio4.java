import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] ganadores = {5, 12, 23, 34, 41, 45};
        int[] usuario = new int[6];

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tus 6 números de la Bonoloto:");

        for (int i = 0; i < usuario.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            usuario[i] = teclado.nextInt();
        }

        int aciertos = 0;

        for (int i = 0; i < usuario.length; i++) {
            for (int j = 0; j < ganadores.length; j++) {
                if (usuario[i] == ganadores[j]) {
                    aciertos++;
                }
            }
        }

        System.out.println("Has tenido " + aciertos + " aciertos.");
    }
}