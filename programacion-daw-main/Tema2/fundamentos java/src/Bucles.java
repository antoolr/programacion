import java.util.Scanner;

public class Bucles {
    public static void main (String[] args) {
        // for(int i=0;i<5;i++){  //Conozco cuantas veces se va a ejecutar
        //     System.out.println(i);
        // }
        // int j=0;
        // while (j<5){
        //     System.out.println(j);
        //     j++;

        // }
        // //Bucle infinito
        // int k=0;
        // do{  //Haz mientras se cumpla condición, pero al menos 1
        //     System.out.println(k);
        //     k++;
        // }while(k<5);
        
        


        // //Cosas que no quiero ver en vuestro codigo
        // for(int i=0; i<5;i++){
        //     System.out.println(i);
        //     if (i==3) break;
        // }

        // Hacerlo mejor con un bucle while
        // int k=0;
        // boolean continuar=true;
        // while(k<5 && continuar){
        //     System.out.println(k);
        //     if (k==3) continuar=false;
        //     k++;
        
        // }
        // Scanner teclado = new Scanner(System.in);
        // int numero=0;
        // do{
        // System.out.println("Escribe un numero entre 1 y 5: ");
        //  numero=teclado.nextInt();
        //     }while(numero<1||numero>5);

            //Bucles anidados
            for (int i=1;i<=10;i++){
                for (int j=1; j<=10;j++){
                    System.out.println(i+"*"+j+"= "+(i*j));
                }
                
            }
        }
        
    }

