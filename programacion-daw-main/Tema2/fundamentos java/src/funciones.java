import java.time.LocalDateTime;
import static java.lang.Math.*;




public class funciones {
    public static void main(String[] args) {
        //Tratamiento de fechas en Java
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        System.out.println(hoy.getDayOfWeek());

        //Tratamiento de Math
        System.out.println(pow(2, 8));

        //Números aleatorios
        int min=1;
        int max=15;
        int aleatorio=(int) (Math.random()*(max-min+1))+min;
        System.out.println(aleatorio);


        
      

        //Operadores 
        //++ y --
        // No es lo mismo variable++ que ++variable
        int valor=1;
        valor=++valor;
        System.out.println(valor);
        valor=valor+1;
        System.out.println(valor);

        //Expresiones relacionales
        System.out.println((5>3)||(5>6));

        //Operador opera-asigna
        int numero11=3;
        int numero12=4;
        numero11= numero11+numero12;
        System.out.println(numero11);

    //Operador ternario
    int a=5;
    int b=6;
    int x=a==10?b*2:a;
    System.out.println(x);
    }
}
