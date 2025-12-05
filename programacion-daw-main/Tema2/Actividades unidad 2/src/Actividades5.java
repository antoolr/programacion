import java.util.Scanner;

public class Actividades5 {

    
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
    public static boolean esDivisible3(int n) {
        return n % 3 == 0;
    }
    public static void imprimirParesDiv3() {
    for (int i = 1; i <= 20; i++) {
        if (esPar(i) && esDivisible3(i)) {
            System.out.println(i);
        }
    }
}
    final static double PI= 3.14159;
    public static void main(String[] args) {
        
        //Actividad 13 funciones diapositivas
        //Leer de teclado la altura y el radio
        Scanner teclado = new Scanner(System.in);

        double altura;
        double radio;

        //Leer parametros
        System.out.println("Escribe la altura del cilindro");
        altura = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe el radio del cilindro");
        radio = Double.parseDouble(teclado.nextLine());
        imprimeCilindro(altura, radio);

       
    }
    public static void imprimeCilindro(double altura, double radio){
        System.out.println("El area del cilindro es: "+(altura*radio*PI));
        System.out.println("El volumen del cilindro es: "+(altura*radio*PI));
    

        //Actividad 14 funciones diapositivas
        imprimirParesDiv3();

  
    
    }
}
