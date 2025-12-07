package Tema4.relacionT4.ejercicio2;

public class ejercicio2 {
    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2); 
        Racional r2 = new Racional(3, 4); 

        System.out.print("R1: "); r1.imprimirRacional();
        System.out.print("R2: "); r2.imprimirRacional();

        Racional suma = r1.suma(r2);
        System.out.print("Suma: "); suma.imprimirRacional();

        Racional resta = r1.resta(r2);
        System.out.print("Resta: "); resta.imprimirRacional();

        Racional producto = r1.producto(r2);
        System.out.print("Producto: "); producto.imprimirRacional();

        Racional division = r1.division(r2);
        System.out.print("División: "); division.imprimirRacional();

        System.out.println("¿Son iguales? " + r1.esIgual(r2));
    }
}
