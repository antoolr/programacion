import java.util.Scanner;
public class actividad2 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 

       System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana");
       int horas = teclado.nextInt();
       int salario = 0;

       if (horas <=40){
        salario = horas*12;
        System.out.println("El sueldo semanal que le corresponde es de €"+salario);
       }

       else 
       
       if (horas >40) {
        salario = 40*12 + (horas-40)*16;
        System.out.println("El sueldo semanal que le corresponde es de "+salario);

       }
       teclado.close();
    }
}
