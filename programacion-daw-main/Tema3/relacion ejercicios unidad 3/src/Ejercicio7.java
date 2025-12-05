import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        // Generar matriz original con números aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(101); // entre 0 y 100
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int[][] rotada = rotarUnaPosicion(matriz);

        System.out.println("\nMatriz rotada una posición (sentido horario):");
        mostrarMatriz(rotada);
    }

    public static int[][] rotarUnaPosicion(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];

        // Copiar matriz original a una lista lineal
        int[] lineal = new int[n * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                lineal[k++] = matriz[i][j];
            }
        }

        // Rotar una posición a la derecha
        int[] rotada = new int[n * n];
        rotada[0] = lineal[n * n - 1];
        for (int i = 1; i < n * n; i++) {
            rotada[i] = lineal[i - 1];
        }

        // Volver a convertir en matriz
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = rotada[k++];
            }
        }

        return resultado;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}

