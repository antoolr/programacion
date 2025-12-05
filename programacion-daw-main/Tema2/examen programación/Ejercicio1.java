import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);

    int entrada_base = 8;
    int entrada_espectador = 5;
    int entrada_pareja = 11;
    double descuento = 10.0 / 100.0 ;
    
    

    System.out.println("Venta de entrada CineCampa");
    System.out.println("Numero de entradas");
    int numero_entradas = teclado.nextInt();
    System.out.println("Día de la semana");
    String dia_semana = teclado.next();
    System.out.println("¿Tiene tarjeta Campa? (si/no)");
    String tarjeta_campa = teclado.next();

    String dia = dia_semana.toLowerCase();

    double subtotal = 0.0;

    if (dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("Miercoles")) {
        //Dia del espectador, la entrada es a 5€
        subtotal = numero_entradas * entrada_espectador;
    } else if (dia.equalsIgnoreCase("jueves")) {
        // Si el dia es jueves, 2 entradas salen a 11€
        int jueves = numero_entradas / 2;
        //Agrupa las entradas de 2 en 2 y calcula el precio
        int resto = numero_entradas % 2;
        subtotal = jueves * entrada_pareja + resto * entrada_base;
    } else {
        //Dia normal, precio base
        subtotal = numero_entradas * entrada_base;
    }

    double total_a_pagar = subtotal;

    //Bucle para calcular el descuento si tiene tarjeta Campa
    if (tarjeta_campa.equalsIgnoreCase("si") || tarjeta_campa.equalsIgnoreCase("sí")) {
        total_a_pagar = total_a_pagar - (total_a_pagar * descuento);
    }

    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    System.out.println("Entradas individuales: " + numero_entradas);
    System.out.println("Total: "+ subtotal);

    //Si tiene tarjeta, se aplica un descuento del 10%
    if (tarjeta_campa.equalsIgnoreCase("si") || tarjeta_campa.equalsIgnoreCase("sí")) {
        System.out.printf("Descuento: %.0f%%\n", descuento * 100);
    }
    System.out.printf("Total a pagar: %.2f", total_a_pagar);

   
}
}
