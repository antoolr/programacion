import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) { 
        /*
         * Utilizando las funciones de String, vas a diseñar el 
         * juego del ahorcado. De un array de palabras vas a coger una al azar y se 
         * creará el vector con * de la longitud para que cuando el usuario acierte
         * una letra se vaya sustituyendo hasta que o bien la palabra se puede 
         * leer(ganas) o acaba el juego si fallas 7 veces (pierdes)
         */

        Scanner teclado=new Scanner(System.in);
        //Tener una lista de palabras
        String palabras[]={"adrian","domingo","programacion","rafael","antonio","aurora","pedro","marggio"};
        //Hay que elegir 1
        int aleatorio=(int)(Math.random()*(palabras.length-1+1));
        String elegida=palabras[aleatorio];
        System.out.println(elegida);
        //Hay que hacer que tenga *
        char palabraOculta[]=new char[elegida.length()];
        for(int i=0;i<palabraOculta.length;i++){
            palabraOculta[i]='*';
        }
        //Control de fallos y encontrada la palabra
        boolean encontrada=false;
        int fallos=0;
        final int FALLOS=7;
        //Inicio del juego
        System.out.println("Bienvenido al juego del ahorcado!!");
        do{
            System.out.println("Introduce una letra para adivinar la palabra");
            System.out.println("Ahora mismo tienes "+fallos+" fallos");
            for(int i=0;i<palabraOculta.length;i++){
                System.out.print(palabraOculta[i]);
            }
            System.out.println();
            System.out.print("Introduce la letra: ");
            String letra=teclado.nextLine();

            //Busco si letra está en la palabra elegida
            if(elegida.contains(letra)){
                System.out.println("La letra está en la palabra");
                for(int i=0;i<elegida.length();i++){
                    if(elegida.charAt(i)==letra.charAt(0))
                        palabraOculta[i]=letra.charAt(0);
                }   
            }
            else{//Si no está incremento fallos
                System.out.println("La letra no está en la palabra");
                fallos++;
            }
            //Compruebo si he ganado
            int contador=0;
            for(int i=0;i<palabraOculta.length;i++){
                if(palabraOculta[i]=='*') contador++;
            }
            if(contador==0){
                encontrada=true;
            }

        }while(!encontrada && fallos!=FALLOS);
        //FIN DEL JUEGO
        if(encontrada){
            System.out.println("ENHORABUENA!! HAS GANADO!!");
        }
        else{
            System.out.println("QUÉ PENA!! HAS PERDIDO!!");
        }
        teclado.close();
    }
}
