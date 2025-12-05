import java.util.Scanner;

public class actividad8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce cuántos términos quieres ver: ");
        int n = teclado.nextInt();

        int a = 0; 
        int b = 1; 

        System.out.println("Serie de Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;

            teclado.close();
        }
    }
}
