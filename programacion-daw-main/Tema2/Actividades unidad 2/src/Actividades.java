public class Actividades {
    public static void main(String[] args) throws Exception {
        //Pseudocodigo actividad diapositiva
        // Generar número 1
        // Generar número 2
        // Realizar cuentas (cociente, media, potencia, raiz cuadrada)
        // Imprimir el resultado de cociente, media, potencia y raiz cuadrada
        // fin_programa

        int min=1;
        int max=100;

        int aleatorio=(int) (Math.random()*(max-min+1))+min;
        int aleatorio2=(int) (Math.random()*(max-min+1))+min;

        //Hacer cuentas
        double cociente=aleatorio/aleatorio2;
        double media=(aleatorio+aleatorio2)/2.0;
        double potencia=Math.pow(aleatorio,aleatorio2);
        double raiz1=Math.sqrt(aleatorio);
        double raiz2=Math.sqrt(aleatorio2);

        //Sacar resultados
        System.out.println("Los numeros generados son: "+ aleatorio+" y "+aleatorio2);
        System.out.println("El cociente es: "+cociente);
        System.out.println("La media es: "+media);
        System.out.println("El potencia es: "+potencia);
        System.out.println("El raiz cuadrada de aleatorio es: "+raiz1);
        System.out.println("El raiz cuadrada de aleatorio2 es: "+raiz2);
    }
}
