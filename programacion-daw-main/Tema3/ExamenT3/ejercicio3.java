package ExamenT3;
import java.util.*;

public class ejercicio3 {
    

    public static int[][] matriz = new int[5][5];

    public static void generaFila(int fila, int min, int max) {
        Random random = new Random();
        for (int j = 0; j < 5; j++) {
            matriz[fila][j] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void mostrarMatriz() {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor+" ");
            }
            System.out.println();
        }
    }

    public static void calcularValores() {
        // Suma filas
        for (int i = 0; i < 5; i++) {
            int suma = 0;
            for (int j = 0; j < 5; j++) suma += matriz[i][j];
            System.out.println("Suma fila " + i + ": " + suma);
        }
        // Suma columnas
        for (int j = 0; j < 5; j++) {
            int suma = 0;
            for (int i = 0; i < 5; i++) suma += matriz[i][j];
            System.out.println("Suma columna " + j + ": " + suma);
        }
        // Máximo y mínimo
        int max = matriz[0][0], min = matriz[0][0];
        int filaMax=0,colMax=0,filaMin=0,colMin=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(matriz[i][j]>max){max=matriz[i][j];filaMax=i;colMax=j;}
                if(matriz[i][j]<min){min=matriz[i][j];filaMin=i;colMin=j;}
            }
        }
        System.out.println("Máximo: "+max+" en ("+filaMax+","+colMax+")");
        System.out.println("Mínimo: "+min+" en ("+filaMin+","+colMin+")");
    }

    public static void modificarValor(int fila, int col, int nuevo) {
        if (fila>=0 && fila<5 && col>=0 && col<5) {
            matriz[fila][col] = nuevo;
        } else {
            System.out.println("Coordenadas fuera de rango.");
        }
    }

    public static void main(String[] args) {
        generaFila(0,1,10);
        generaFila(1,11,20);
        generaFila(2,21,30);
        generaFila(3,31,40);
        generaFila(4,41,50);

        mostrarMatriz();
        calcularValores();
        modificarValor(2,3,99);
        mostrarMatriz();
    }
}


