import java.util.Scanner;
public class App {
        //Crear la matriz
        static int[][] matriz ={{0,0,0},{0,0,0},{0,0,0}}; 

        //Variable de turno, que por defecto empieza el jugador 1
       static boolean turno=true;
        final static int juego1=1;
        final static int juego2=2;

            public static void main(String[] args) throws Exception {
                Scanner teclado = new Scanner(System.in);
                int posicion;

                //Mostrar situación inicial
                imprimeMatriz();

                for(int i=0;i<9;i++){

                System.out.print("Introduce coordenda del 1 al 9: ");
                posicion=teclado.nextInt();
                while(!valida(posicion)); 
                jugada(matriz, turno, posicion);
                if (comprobarGanador(turno)){
                    if (turno==true) System.out.println("El jugador 1 ha ganao");
                    else {System.out.println("El jugador 2 ha ganao");}
                    break;
                }
                imprimeMatriz();
                turno=!turno;
                }
                if (!comprobarGanador(turno) && !comprobarGanador(!turno))
                    System.out.println("Hay un empate");
                // do {
                //     System.out.print("Introduce coordenda del 1 al 9: ");
                // posicion=teclado.nextInt();
                // jugada(matriz, turno, posicion);
                // imprimeMatriz();
                // turno=!turno;
                // }while(!comprobarGanador(turno));
                // if(turno==true)System.out.println("El jugador 1 ha ganado");
                // else {System.out.println("El jugador 2 ha ganado");}
                
                
    }

    public static void imprimeMatriz(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]);
            }
                System.out.println();
        }
    }
    
    public static void jugada (int[][] matriz, boolean turno, int posicion){
        int valor;
        if(turno==true) valor=juego1;
        else{valor=juego2;}
        switch (posicion) {
            case 1:
                matriz[0][0]=valor;
                break;
            case 2:
                matriz[0][1]=valor;
                break;
            case 3:
                matriz[0][2]=valor;
                break;
            case 4:
                matriz[1][0]=valor;
                break;
            case 5:
                matriz[1][1]=valor;
                break;
            case 6:
                matriz[1][2]=valor;
                break;
            case 7:
                matriz[2][0]=valor;
                break;
            case 8:
                matriz[2][1]=valor;
                break;
            case 9:
                matriz[2][2]=valor;
                break;
            default:
            System.out.println("Has introducido un valor incorrecto");
            break;
             
        }
        
    }

    public static boolean valida (int posicion){
        boolean control = true;
        switch (posicion){
        case 1:
                if (matriz[0][0]!=0) control=false;
                break;
            case 2:
                if (matriz[0][1]!=0) control=false;
                break;
            case 3:
                if (matriz[0][2]!=0) control=false;
                break;
            case 4:
                if (matriz[1][0]!=0) control=false;
                break;
            case 5:
                if (matriz[1][1]!=0) control=false;
                break;
            case 6:
                if (matriz[1][2]!=0) control=false;
                break;
            case 7:
                if (matriz[2][0]!=0) control=false;
                break;
            case 8:
                if (matriz[2][1]!=0) control=false;
                break;
            case 9:
                if (matriz[2][2]!=0) control=false;
                break;
        }
        return control;
    }

    public static boolean comprobarGanador(boolean turno){
        //Determinar el valor a buscar en la matriz
        int valor;
        if(turno==true) valor=juego1;
        else{valor=juego2;}
        //Gana en la fila 0
        if(compruebaFila(0,valor) || compruebaFila(1,valor) || compruebaFila(2,valor)) return true;
        else if (compruebaColumna(0, valor) || compruebaColumna(1, valor) || compruebaColumna(2, valor)) return true; //Gana por columnas?
        else if (compruebaDiagonal1(valor) || compruebaDiagonal2(valor)) return true; //Gana por diagonales?
        return false; //No has ganao
    }
    public static boolean compruebaDiagonal1 (int valor){
        if (matriz[0][0]==valor && matriz[1][1]==valor && matriz[2][2]==valor) return true;
        return false;
    }
    public static boolean compruebaDiagonal2 (int valor){
        if (matriz[0][2]==valor && matriz[1][1]==valor && matriz[2][0]==valor) return true;
        return false;
    }
    public static boolean compruebaFila(int fila, int valor){
        if(matriz[0][0]==valor && matriz[0][1]==valor && matriz[0][2]==valor) return true;
        return false;
    }

    public static boolean compruebaColumna(int columna, int valor){
        if(matriz[0][columna]==valor && matriz [1][columna]==valor && matriz[2][columna]==valor) return true;
        return false;
    }
    
}
