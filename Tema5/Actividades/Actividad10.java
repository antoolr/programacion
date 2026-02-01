package Tema5.Actividades;

public class Actividad10 {

    // Método genérico para intercambiar posiciones
    public static <T> void intercambiar(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Pepe"};
        intercambiar(nombres, 0, 2);

        for (String n : nombres) {
            System.out.println(n);
        }
    }
}

