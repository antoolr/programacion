import java.util.Scanner;


public class EntradaSalida {
    public static void main (String[] args){

        
        //     //Instrucciones de salida por pantalla
        //     int valor=9;
        //     System.out.println(valor);

        //     //Usar printf
        //     double precio=13.38587;
        //     System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d", "", precio, valor);


        //     // Incluir un icono
        //     System.out.println(" Que ganas tengo de unas vacaciones \u26F1");

        //     //Formato reciente
        //     System.out.println("El precio del producto "+"Tablet "+"tiene un valor de "+precio+" y se han comprado "+valor+"");

        //     //Formato salida texto
        //     System.out.printf("%10s, %-10s", "Domingo", "Informático");

        //     //Formato tabla
        //     System.out.println();
        //     System.out.println("|---------|----------|---------|");
        //     System.out.printf("|%-10s|%-10s|%-10s|\n", "Producto","Cantidad","Valor");
        //     System.out.println("|---------|----------|---------|");
        //     System.out.printf("|%-10s|%d     |%f   |\n", "Producto",10,3.5);
        //     System.out.println("|---------|----------|---------|");



        //     System.out.println("|---------|----------|---------|");
        //     System.out.println("|"+"Producto"+"  |"+"Cantidad"+"  |"+"Precio"+"   |");
        //     System.out.println("|---------|----------|-----------|");
        //     System.out.printf("|%-10s|%d     |%f   |\n", "Producto",10,3.5);
        //     System.out.println("|---------|----------|-----------|");
 
        // Operaciones de entrada por teclado

        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce: Nombre");
        //Lee Nombre
        String nombre = teclado.nextLine();


        //Lee Apellido
        System.out.println("Introduce Apellido");
        String apellido = teclado.nextLine();
        
;  
        
        //Leer edad
        System.out.println("Introduce Edad");
        int edad = teclado.nextInt();
        teclado.nextLine();
        //Leer profesion
        System.out.println("Introduce Profesión");
        String profesion = teclado.nextLine(); 

        System.out.println("El usuario se llama "+nombre+" "+apellido+". Tiene " +edad+ " años y trabaja de "+profesion+"");
        teclado.close(); //Cierras el flujo de teclado

        

         }
}
