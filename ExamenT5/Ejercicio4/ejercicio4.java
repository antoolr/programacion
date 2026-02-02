package ExamenT5.Ejercicio4;

import java.util.Random;

public class ejercicio4 {

  
    public static void main(String[] args) {

        Random random = new Random();

        coche c1 = new coche("1234 ASD");
        coche c2 = new coche("6839 NDU");

        moto m1 = new moto("382 CWU");
        moto m2 = new moto("914 FSD");

        c1.entrar(); 
        int horas1 = random.nextInt(3) + 1; 
        System.out.println("Precio: " + c1.calcularPrecio(horas1)); 
         

        c2.entrar(); 
        int horas2 = random.nextInt(7) + 1; 
        System.out.println("Precio: " + c1.calcularPrecio(horas2)); 
        c2.salir();

        m1.entrar(); int horas3 = random.nextInt(5) + 1; 
        System.out.println("Precio: " + m1.calcularPrecio(horas3)); 
        m1.salir(); 

        m2.entrar(); int horas4 = random.nextInt(6) + 1; 
        System.out.println("Precio: " + m2.calcularPrecio(horas4)); 

        c1.salir();

        
        System.out.println("Plazas libres: " +m2.plazasLibres()); 
    }

    
}
        
   
