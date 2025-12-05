
import java.util.Scanner;
public class actividad5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        //Hacer programa que diga las materias de un dia
        // Si escribe 6 que devuelva todo los días
        // Si escribe 7 sale del programa
     System.out.println("Introduce un dia");
    int dia = teclado.nextInt();
    
    String lunes = "IPE, Sistemas informáticos, Bases de datos, Programación";
    String martes = "Bases de datos, Programación, Lenguaje de marcas, Entornos de desarrollo";
    String miercoles = "Bases de datos, Programación, Lenguaje de marcas, Sostenibilidad";
    String jueves = "Entornos de desarrollo, IPE, Bases de datos, Sostenibilidad";
    String viernes = "Sistemas informáticos, Lenguaje de marcas, IPE, Programación";
    String calendario = 
    "Lunes: IPE, Sistemas informáticos, Bases de datos, Programación\n" +
    "Martes: Bases de datos, Programación, Lenguaje de marcas, Entornos de desarrollo\n" +
    "Miércoles: Bases de datos, Programación, Lenguaje de marcas, Sostenibilidad\n" +
    "Jueves: Entornos de desarrollo, IPE, Bases de datos, Sostenibilidad\n" +
    "Viernes: Sistemas informáticos, Lenguaje de marcas, IPE, Programación";


    if (dia == 1) {
    System.out.println("El horario es: " +lunes);
    } else if (dia == 2) {
    System.out.println("El horario es: "+martes);
    } else if (dia == 3) {
    System.out.println("Es horario es: "+miercoles);
    } else if (dia == 4){
    System.out.println("El horario es: "+jueves);
    } else if (dia ==5){
    System.out.println("El horario es: "+viernes);
    } else if (dia == 6){
    System.out.println("El calendario completo es: "+calendario);
    } else if (dia == 7){
    System.out.println("Saliendo del programa....");
    }
    
    teclado.close();

    }
}
