import java.util.Scanner;

public class Actividades3 {
    

public static void main (String[] args){

    //Ejercicio 5

    // Entre 50 y 200 los multiplos de 2 y 3
    // Comprobar si numero/2 y numero/3 es igual a 0
    // Imprimir que numeros son los de resto 0
    // Fin

    for(int numero=50;numero<=200;numero++){
    if(numero%2==0 && numero%3==0){
        System.out.println(numero);
             }
         }
   


    //Ejercicio 6

    //Hacer el factorial de un numero
    // Si numero es =5, hace 5*4*3*2*1
    // Imprimir el resultado
    //Fin_si
    //Fin

    int producto=1, factorial=4;
    for(int i=1;i<=factorial;i++){
        producto=producto*i;

    }
    System.out.println(producto);


    //Ejercicio 7

    //Leer numero de edades hasta -1 y entonces sacar el valor máximo y mínimo

    int maximo=0;
    int minimo=0;
    Scanner teclado = new Scanner(System.in);
    int edad;
    do {
        System.out.println("Introduce una edad o -1 para salir: ");
        edad=teclado.nextInt();
        //Establezco la logica para maximo y minimo
        if(maximo>edad){
            maximo=edad;
        }
        if(minimo<edad){
            minimo=edad;
        }
    } while (edad!=-1);
    System.out.println("El maximo es "+maximo);
    System.out.println("El minimo es "+minimo);



        }
    }
