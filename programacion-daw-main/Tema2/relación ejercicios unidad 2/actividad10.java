import java.util.Scanner;
public class actividad10 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

    int contador_par = 0;
    int contador_imp = 0;

    System.out.println("Introduce un numero: ");
    int numero = teclado.nextInt();

    


    while (numero != 0) {
    int digito = numero % 10; 
    if (digito % 2 == 0) {
        contador_par++; 
    } else {
        contador_imp++; 
    }
    numero = numero / 10; 

    }

    System.out.println("El número tiene "+contador_par+" dígitos pares");
    System.out.println("El número tiene "+contador_imp+" dígitos impares");




       teclado.close();
    }
}
