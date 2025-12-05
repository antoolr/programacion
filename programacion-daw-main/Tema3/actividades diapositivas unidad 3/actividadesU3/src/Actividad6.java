public class Actividad6 {
    // Fubción para imprimir una Matriz
     public static void imprimeMatriz(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Función para ordenar una matriz
    public static int[][] ordenarMatriz(int[][] matriz,int filas,int columnas){
         for (int i = 0; i < filas * columnas - 1; i++) {
            for (int j = 0; j < filas * columnas - i - 1; j++) {
                // Obtener índices (fila, columna) del elemento actual y siguiente
                int fila1 = j / columnas;
                int col1 = j % columnas;
                int fila2 = (j + 1) / columnas;
                int col2 = (j + 1) % columnas;

                // Comparar y hacer swap si es necesario
                if (matriz[fila1][col1] > matriz[fila2][col2]) {
                    int temp = matriz[fila1][col1];
                    matriz[fila1][col1] = matriz[fila2][col2];
                    matriz[fila2][col2] = temp;
                }
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        /*
         *  Hacer un vector con todo el contenido de la matriz y ordenarlo
         */
        //Ordenar una matriz
        int[][] matriz={{3,7,1},{4,-4,2},{5,0,5}};
        System.out.println("Matriz original");
        imprimeMatriz(matriz);
        System.out.println("Matriz ordenada");
        int[][] resultado=ordenarMatriz(matriz, matriz.length,matriz[0].length);
        imprimeMatriz(resultado);

        // Pasar de matriz a vector
        int[] vector= new int[matriz.length*matriz[0].length];
        for(int r=0;r<matriz.length;r++){
            for(int c=0;c<matriz[0].length;c++){
                int valor=matriz[r][c];
                vector[r*matriz[0].length+c]=valor;
            }
        }

        // Imprimir array
        System.out.println("Matriz pasada a array");
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
}
