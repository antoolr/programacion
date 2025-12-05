import java.util.Scanner;

public class Actividad 8 {
    public static void main (String[] args){
    
        Scanner teclado = new Scanner(System.in);

        int suma=0;
        int mayores_edad=0;
        int contador=0;
        int edad=0;

        do {
            System.out.print("Introduce la edad del alumno (-1 para salir): ");
            edad = teclado.nextInt();

            if (edad != -1) {
                suma += edad;            
                contador++;               
                if (edad >= 18) {
                    mayores_edad++;      
                }
            }
        } while (edad != -1);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Suma: "+suma);
            System.out.println("Número de alumnos: "+contador);
            System.out.println("Media: "+media);
            System.out.println("Mayores de edad: "+mayores_edad);
        } else {
            System.out.println("No se introdujeron alumnos.");
        }
}
}
