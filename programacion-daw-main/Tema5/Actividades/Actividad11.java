package Tema5.Actividades;

public class Actividad11 {

    // Método genérico para buscar un elemento
    public static <T> int buscar(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Integer[] numeros = {10, 20, 30, 40};

        int pos = buscar(numeros, 10);
        System.out.println("Posición: " + pos);
    }
}

