import java.util.Scanner;

public class Actividad2 {
    

public static void main (String[] args) {

    //Ejercicio 3
    // Lector de notas 
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce numero");
    int nota = teclado.nextInt();

     if(nota==1){
             System.out.println("Suspenso");
         }
    else if(nota==2){
             System.out.println("Suspenso");
         }
    else if(nota==3){
             System.out.println("Suspenso");
         }
    else if(nota==4){
             System.out.println("Suspenso");
         }
       else  if(nota==5){
             System.out.println("Aprobado");
         }
        else if(nota==6){
            System.out.println("Bien");
        }
      else if(nota==7){
     System.out.println("Notable");
      }
     else if (nota==8){
    System.out.println("Notable");
     }
     else if (nota==9){
    System.out.println("Sobresaliente");
     }
     else if (nota==10){
    System.out.println("Sobresaliente");
     }
     else {
               System.out.println("Valor incorrecto");
        }

    //Ejercicio 2

    //Resolución ecuaciones segundo grado
    int a=0,b=0,c=0;
    System.out.println("Introduce los valores a b c: ");
    a=teclado.nextInt();
    b=teclado.nextInt();
    c=teclado.nextInt();

    //Calcular el discriminante
    double x1=0, x2=0;
    double discriminante=Math.pow(b,2)-4*a*c;

    if (discriminante <0){
        System.out.println("No hay soluciones");
    
    }
    else if (discriminante == 0){

        System.out.println("La unica solucion es: "+x1);
    
    }
    else {
        x1=(-b+Math.sqrt(discriminante))/(2*a);
        x2=(-b-Math.sqrt(discriminante))/(2*a);
        System.out.println("La solucion 1 es "+x1);
        System.out.println("La solucion 1 es "+x2);
    }

    //Ejercicio 4

    //Lector de año bisiesto
    System.out.println("Introduce el día: ");
    int dia=teclado.nextInt();
    System.out.println("Introduce el mes: ");
    int mes=teclado.nextInt();
    System.out.println("Introduce el año: ");
    int anio=teclado.nextInt();

    if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
        if(dia>=1 && dia<=31){
            System.out.println("Fecha correcta");
        }
        else {
            System.out.println("Fecha incorrecta");
        }
    }
    if(mes==4 || mes==6 || mes==9 || mes==11){
        if(dia>=1 && dia<=30){
            System.out.println("Fecha correcta");
         }
        }
        else {
            System.out.println("Fecha incorrecta");
            }
           
        if (mes==2){ //Caso febrero
            if (dia>1 && dia==28){
                System.out.println("Fecha correcta");
            } 
        }
        else if (dia==29){
            if( (anio %4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Fecha correcta");
        }
        else{
            System.out.println("Fecha incorrecta");
            }
        }
        else{
            System.out.println("Fecha incorrecta");
        }
    

     teclado.close();

         
    }
}
