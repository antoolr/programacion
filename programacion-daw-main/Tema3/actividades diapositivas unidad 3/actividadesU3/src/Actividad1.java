import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        /* Realiza una función que busca un número en un array e indica dónde está o devuelve -1 */
        Scanner teclado= new Scanner(System.in);

        // Pedimos la longitud del array
        System.out.println();
        System.out.println("¿Cuántos numeros deseas introducir?");
        int longitud=teclado.nextInt();
        
        // Añadimos numeros a una array
        int array[]= new int[longitud];
         for (int i = 0; i < longitud; i++) {
            System.out.println("¿Qué número deseas añadir en la posición "+i+"?");
            int numero = teclado.nextInt();
            array[i]=numero;
        }

        System.out.println("¿Qué número desea buscar?");
        int numero=teclado.nextInt();
        // Recorremos la matriz para buscar el numero
        int posicion=-1;
        for (int i = 0; i < array.length; i++) {
            // Condicion para poner la posicion en la variable
            if (numero==array[i]) {
                posicion=i;
            }
        }
        // Condicion para saber si esta el numero o no
        if (posicion!=-1) {
                System.out.println("El número esta en la posición "+posicion);
            }
            else{
                System.out.println(posicion);
            }

        // Mostramos el array para ver si es correcta la solución
        System.out.println("Array para comprobar la posicion ");
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        teclado.close();
    }
}
