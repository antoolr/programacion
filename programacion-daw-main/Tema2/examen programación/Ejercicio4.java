import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
//         4. (2 puntos) Siguiendo este pseudocódigo, genera la función que pasado un número nos diga si es
// primo o no.
// Algoritmo EsPrimo (n)
//  Definir esPrimo como Lógico
//  Si n < 2 Entonces
//  devolver esPrimo ← Falso
//  Sino
//  esPrimo ← Verdadero
//  Para i=2 Hasta n-1 Hacer
//  Si n % i = 0 Entonces
//  devolver esPrimo ← Falso
//  FinSi
//  FinPara
//  FinSi
//  devolver esPrimo ← Verdadero
// FinAlgoritmo
// Una vez lo tengas, usa esa función para obtener los números primos que hay entre dos números
// introducidos por teclado por el usuario. Tienes que comprobar que estos dos números siempre
// tienen que ser mayores que 50.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero=teclado.nextInt();
        int numero2=teclado.nextInt();
       
        
        if (numero<50) {
            System.out.println("El numero tiene que ser mayor");
            return;
        }else if (numero2<50) {
            System.out.println("El numero 2 tiene que ser mayor");
        }

        //Esto supuestamente imprime los numeros primos entre los dos numeros introducidos
        for(numero=50;numero<=100;numero++){
        if(numero%2!=0 && numero2%3!=0){
        System.out.println(numero);
             }
         }

        if (numero % 2 == 0) {
            System.out.println("No es primo");
        } else if (numero % 2 !=0) {
            System.out.println("Son primos");
        }
    }
}
