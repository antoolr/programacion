import java.util.Scanner;

public class actividad6{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el cargo de empleado (1-3)");

        int salario1 = 950;
        int salario2 = 1200;
        int salario3 = 1600;
        int trabajos = teclado.nextInt();

        if (trabajos == 1) {
        System.out.println("El salario es de "+salario1);
        } 
        else if (trabajos == 2) {
        System.out.println("El salario es de "+salario2);
        }
        else if (trabajos == 3){
        System.out.println("El salario es de "+salario3);
        }

        System.out.print("Introduce el número de días que has estado fuera:");
        int dias_fuera = teclado.nextInt();

        int valor_dieta = 30;
        int dietas = dias_fuera * valor_dieta;

        System.out.println("El valor de las dietas es: " + dietas);

        
        if (dias_fuera < 0) {
        System.out.println("Los días no pueden ser negativos.");
        }

        int salario_bruto = 0;

        if (trabajos == 1) {
        salario_bruto = salario1 + dietas;
    } else if (trabajos == 2) {
        salario_bruto = salario2 + dietas;
    } else if (trabajos == 3) {
        salario_bruto = salario3 + dietas;
    }
    
    System.out.println("Has ganado un total de " + salario_bruto + " euros brutos");

    System.out.println("Introduce tu estado civil (1 = Soltero, 2 = Casado):");
    int estado_civil = teclado.nextInt();
    double irpf = 0;

    if (estado_civil == 1) {
    irpf = salario_bruto * 0.25;
    } else if (estado_civil == 2) {
    irpf = salario_bruto * 0.20;
    } else {
    System.out.println("Estado civil no válido.");
    }

    if (estado_civil == 1 || estado_civil == 2) {
    System.out.println("IRPF aplicado: " + irpf + " euros");
    System.out.println("Salario neto: " + (salario_bruto - irpf) + " euros");
    }

    }
}