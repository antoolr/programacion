import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar un número");
            System.out.println("2. Eliminar un número");
            System.out.println("3. Mostrar todos los números");
            System.out.println("4. Comprobar si un número está en la lista");
            System.out.println("5. Eliminar todos los números");
            System.out.println("6. Consultar el tamaño de la lista");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    int numero;
                    do {
                        System.out.print("Introduce un número positivo: ");
                        numero = teclado.nextInt();
                    } while (numero < 0);
                    lista.add(numero);
                    break;

                case 2:
                    System.out.print("Número a eliminar: ");
                    int eliminar = teclado.nextInt();
                    lista.removeIf(n -> n == eliminar);
                    System.out.println("Se han eliminado todas las ocurrencias de " + eliminar);
                    break;

                case 3:
                    System.out.println("Números en la lista:");
                    for (int n : lista) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Número a comprobar: ");
                    int comprobar = teclado.nextInt();
                    if (lista.contains(comprobar)) {
                        System.out.println("El número está en la lista.");
                    } else {
                        System.out.println("El número NO está en la lista.");
                    }
                    break;

                case 5:
                    lista.clear();
                    System.out.println("Todos los números han sido eliminados.");
                    break;

                case 6:
                    System.out.println("Tamaño de la lista: " + lista.size());
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }
}
