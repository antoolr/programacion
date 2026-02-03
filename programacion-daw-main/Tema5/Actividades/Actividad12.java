package Tema5.Actividades;

public class Actividad12 {

    // Método genérico para obtener el máximo
    public static <T extends Comparable<T>> T maximo(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public static void main(String[] args) {

        System.out.println(maximo(10, 20));
        System.out.println(maximo("Hola", "Adios"));
    }
}

