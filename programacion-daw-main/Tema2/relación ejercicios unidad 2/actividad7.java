import java.util.Scanner;
public class actividad7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        int contador_pos = 0;
        int contador_neg = 0;
        int numero = 0;

        do {
            System.out.println("Introduce un número (0 para salir): ");
            numero = teclado.nextInt();

            if (numero > 0) {
                contador_pos++;
            } else if (numero < 0) {
                contador_neg++;
            }
        } while (numero != 0);

        System.out.println("La cantidad de números positivos es: "+contador_pos);
        System.out.println("La cantidad de números negativos es: "+contador_neg);

        teclado.close();
    
    }
}
