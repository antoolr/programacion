public class Ejercicio3 {
    public static int[] Minimo_maximo(int[] datos) {
        if (datos == null || datos.length == 0) {
            return new int[]{0, 0}; 
        }

        int min = datos[0];
        int max = datos[0];

        for (int i = 1; i<datos.length; i++) {
            if (datos[i]<min) {
                min = datos[i];
            }
            if (datos[i]>max) {
                max = datos[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] ejemplo = {12, 5, 8, 0, 3};
        int[] resultado = Minimo_maximo(ejemplo);
        System.out.println("Mínimo: " +resultado[0]);
        System.out.println("Máximo: " +resultado[1]);
        };

    }
