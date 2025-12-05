import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador=0;
        int sumaImpares=0;
        int mayorPar=Integer.MIN_VALUE;
        int menorNumero=Integer.MAX_VALUE;

        do {
            //Lee el numero que se introduce
            System.out.println("Introduce un número (negativo para terminar): ");
            numero=teclado.nextInt();

            //Contador se incrementa si no es negativo
            if (numero>=0) {
                contador++;

                
                if (numero % 2 != 0) {
                    sumaImpares += numero;
                } else {
                    // Lee el mayor numero par que se ha introducido
                    if (numero > mayorPar) {
                        mayorPar = numero;
                    }
                }
                // Si el numero es el mas pequeño de todos, se actualiza en el contador de menorNumero
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
           
        } while (numero >= 0);

        System.out.println("Números introducidos: " + contador);
        System.out.println("Suma de los impares: " + sumaImpares);
        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("Mayor de los pares: " + mayorPar);
        }
        if (menorNumero != Integer.MAX_VALUE) {
            System.out.println("Menor de todos: " + menorNumero);
        } 
        }
    }

