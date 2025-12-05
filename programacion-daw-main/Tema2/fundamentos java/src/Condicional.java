import java.util.Scanner;

public class Condicional {
    public static void main (String[] args) {

        // int user = 30;
        // if (user <=18) {
        //     System.out.println("User es muy joven");
        // }
        // else if (user > 18 && user <40) {
        //     System.out.println("User está entre 19 y 39 años");
        // }
        // else if (user == 45 || user == 50) {
        //     System.out.println("User esta entre 45 y 50 años");
        // }
        // else {
        //     System.out.println("User tiene 40 años");
        // }
        //    int numero=6;
        //     if (numero%2==0 && numero%3 == 0){
        //         System.out.println("El numero "+numero+" Es divisible por 2 y por 3");
        //      } 
        //      else {
        //     System.out.println("El numero "+numero+" no es divisible por 2 y 3");
        // }

        //leer numero
        //identificar dependiendo del numero el mes que es
        //si introduzco 4, resultado tiene que ser = Abril
        // fin_si


         Scanner teclado=new Scanner(System.in);
         System.out.println("Introduce numero");
         int numero2 = teclado.nextInt();

    //     if(mes==1){
    //         System.out.println("Enero");
    //     }
    //    else if(mes==2){
    //         System.out.println("Febrero");
    //     }
    //    else if(mes==3){
    //         System.out.println("Marzo");
    //     }
    //    else if(mes==4){
    //         System.out.println("Abril");
    //     }
    //   else  if(mes==5){
    //         System.out.println("Mayo");
    //     }
    //    else if(mes==6){
    //         System.out.println("Junio");
    //     }
    //    else if(mes==7){
    //         System.out.println("Julio");
    //     }
    //    else if(mes==8){
    //         System.out.println("Agosto");
    //     }
    //    else if(mes==9){
    //         System.out.println("Septiembre");
    //     }
    //    else if(mes==10){
    //         System.out.println("Octubre");
    //     }
    //     else if(mes==11){
    //         System.out.println("Noviembre");
    //     }
    //     else if(mes==12){
    //         System.out.println("Diciembre");
    //     }
    //     else {
    //         System.out.println("Valor incorrecto");
    //     }

            //Vamos a hacerlo todo con un switch
            switch(numero2){
                case 1: System.out.println("Enero");break;
                case 2: System.out.println("Febrero");break;
                case 3: System.out.println("Marzo");break;
                case 4: System.out.println("Abril");break;
                case 5: System.out.println("Mayo");break;
                case 6: System.out.println("Junio");break;
                case 7: System.out.println("Julio");break;
                case 8: System.out.println("Agosto");break;
                case 9: System.out.println("Septiembre");break;
                case 10: System.out.println("Octubre");break;
                case 11: System.out.println("Noviembre");break;
                case 12: System.out.println("Diciembre");break;


            }

    }
}


            //Comprobar si un numero es divisible entre 2 o 3
            //Si numero %2 es 0 y numero%3 es 0 entonces
            //Sino
            // escribir no es divisible por 2 y 3
            // Fin_si
            



        
    
