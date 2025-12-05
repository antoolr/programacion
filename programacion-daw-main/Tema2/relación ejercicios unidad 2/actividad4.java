import java.util.Scanner;
public class actividad4 {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tus notas");
        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();
        resultado = (nota1+nota2)/2;

        if (resultado >= 5) {
         System.out.println("Estás aprobado");
        } else {
        System.out.println("Estás suspenso y tienes que hacer la recuperación");
        
        System.out.println("¿Cual ha sido el resultado de tu recuperacion?");
        int recuperacion = teclado.nextInt();

        if (recuperacion >=5){
            System.out.println("Apto");
        }
        else if (recuperacion <=5){
            System.out.println("No apto");
        }
        }

        
        teclado.close();
        
    }
}
