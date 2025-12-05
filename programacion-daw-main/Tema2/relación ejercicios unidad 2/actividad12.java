import java.util.Scanner;

public class actividad12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = teclado.nextInt();

        
        int num1 = a;
        int num2 = b;

        
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }

        
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        int mcd = a;

        
        int mcm = (num1 * num2) / mcd;

        
        System.out.println("El MCD es: " + mcd);
        System.out.println("El MCM es: " + mcm);

        teclado.close();
    }
}
