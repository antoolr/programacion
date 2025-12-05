import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        
        while (opcion != 0) {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion != 0) {
                double resultado = 0;
                boolean primerNumero = true;

                System.out.println("Introduce números (escribe -1 para terminar):");
                double num = teclado.nextDouble();

                while (num != -1) {
                    if (primerNumero) {
                        resultado = num;
                        primerNumero = false;
                    } else {
                        if (opcion == 1) {
                            resultado = resultado + num;   // suma
                        } else if (opcion == 2) {
                            resultado = resultado - num;   // resta
                        } else if (opcion == 3) {
                            resultado = resultado * num;   // multiplicación
                        } else if (opcion == 4) {
                            if (num != 0) {
                                resultado = resultado / num; // división
                            } else {
                                System.out.println("⚠️ No se puede dividir entre 0, número ignorado.");
                            }
                        }
                    }
                    num = teclado.nextDouble();
                }

                if (!primerNumero) {
                    System.out.println("Resultado = " + resultado);
                } else {
                    System.out.println("No introdujiste ningún número válido.");
                }
                System.out.println();
            } else {
                System.out.println("Saliendo...");
            }
        }
        
        teclado.close();
    }
}
