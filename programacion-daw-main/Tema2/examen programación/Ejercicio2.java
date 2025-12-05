import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
//         2. (2,5 puntos) Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada
    // y luego el ordenador genera la suya de manera aleatoria. Para ambos, el valor de la jugada será el
// valor 1 o 2 o 3 que se corresponde con piedra, papel o tijera. Hay que evaluar el resultado y decir
// quién gana o si hay empate. El juego termina cuando el usuario introduce -1 o el ordenador gana 5
// veces. Realiza una función para solicitar la acción del humano, otra para generar la del ordenador y
// el procedimiento con la salida final según si gana o no gana. Puedes crear más funciones si lo crees
// necesario.
        Scanner teclado = new Scanner(System.in);

        int jugada1=0;
        int jugada2=0;
        int jugada3=0;
        
        
        
        
        System.out.println("Introduce tu jugada: 1.Piedra 2.Papel 3.Tijera o -1 para salir");
        int jugada_usuario=teclado.nextInt();
        if (jugada_usuario==-1) {
            System.out.println("Has salido del juego");
            return;
        }
        // System.out.println("Jugada del ordenador: 1.Piedra 2.Papel 3.Tijera o -1 para salir");
        int jugada_ordenador= (int)(Math.random() * (3 - 1 + 1)) + 1;
        System.out.println(jugada_ordenador);

        if (jugada_usuario ==jugada1 && jugada_ordenador==jugada1){
            System.out.println("Empate");
        } else if (jugada_usuario ==jugada2 && jugada_ordenador==jugada2) {
            System.out.println("Empate");
        } else if (jugada_usuario ==jugada3 && jugada_ordenador==jugada3) {
            System.out.println("Empate");
        } else if (jugada_usuario ==jugada1 && jugada_ordenador==jugada3) {
            System.out.println("Gana el usuario");
        } else if (jugada_usuario ==jugada3 && jugada_ordenador==jugada2) {
            System.out.println("Gana el usuario");
        } else if (jugada_usuario ==jugada2 && jugada_ordenador==jugada1) {
            System.out.println("Gana el usuario"); 
        } else if (jugada_usuario ==jugada1 && jugada_ordenador==jugada2) {
            System.out.println("Gana el ordenador");
        } else if (jugada_usuario ==jugada3 && jugada_ordenador==jugada1) {
            System.out.println("Gana el ordenador");
        } else if (jugada_usuario ==jugada2 && jugada_ordenador==jugada3) {
            System.out.println("Gana el ordenador");
        
            
        }
        

       

    }
}

