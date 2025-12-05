public class Ejercicio6 {
    public static int[][] procesarMatrices(int[][] m1, int[][] m2) {
        int filas = m1.length;
        int columnas = m1[0].length;
        int[][] resultado = new int[columnas][3];

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            int producto = 1;

            for (int i = 0; i < filas; i++) {
                suma += m1[i][j] + m2[i][j];
                producto *= m1[i][j] * m2[i][j];
            }

            int media = suma / (filas * 2);

            resultado[j][0] = suma;
            resultado[j][1] = producto;
            resultado[j][2] = media;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriz2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] resultado = procesarMatrices(matriz1, matriz2);

        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Columna " + (i + 1) + ": Suma = " + resultado[i][0] +
            ", Producto = " + resultado[i][1] +
            ", Media = " + resultado[i][2]);
        }
    }
}

