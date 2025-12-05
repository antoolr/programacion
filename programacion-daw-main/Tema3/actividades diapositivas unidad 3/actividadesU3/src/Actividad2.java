import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que muestra tu horario y qué clases tienes hoy
         */
        Scanner teclado=new Scanner(System.in);
        String [][] horario={
            {"LUNES","MARTES","MIERC","JUEVES","VIERNES"},
            {"IPE.1","LMSGI","GBD  ","PROG ","GBD  "},
            {"SIST ","SIST ","GBD  ","ENT.I","DIGI "},
            {"GBD  ","SIST ","SIST ","ENT.I","LMSGI"},
            {"GBD  ","PROG ","SIST ","IPE.1","LMSGI"},
            {"PROG ","PROG ","PROG ","GBD  ","IPE.1"},
            {"PROG ","ENT.I","PROG ","SOST ","PROG "},
            };
        
        // Mostramos el horario
        System.out.println("Horario");
        for(int i=0;i<horario.length;i++){ 
            for (int j=0;j<horario[i].length;j++){ 
                System.out.print(horario[i][j]+"     ");
            }
            System.out.println(); 
        }

        // Ver las clases de ese dia 
        System.out.println("¿Qué día desea ver? Escribalo en mayúsculas con las mismas letras que en el horario");
        String eleccion=teclado.nextLine();
        System.out.println("Estas son las clases que tienes que tienes el");
        for(int i=0;i<horario.length;i++){
            for (int j=0;j<horario[i].length;j++){ 
                if (horario[0][j].equals(eleccion)) {
                    System.out.print(horario[i][j]+"     ");
                }
            }
            System.out.println(); 
        }
        teclado.close();
    }
}
