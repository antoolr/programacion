public class Actividad5 {
    public static void main(String[] args) {
        /*
         * Crea una función que inserta un nuevo entero en la posición que le digas de 
         * parámetro. Si le indicas un parámetro mayor al tamaño actual, rellenará con 0
         */
        int[] vector={1,4,5,6,7,9,4};//tamaño 7
        System.out.println("Vector original");
        imprimeArray(vector);
        System.out.println("Vector añadiendo un 5 en la posición 4");
        int[] resultado=insertaEn(vector,4,5);
        imprimeArray(resultado);
        System.out.println("Vector añadiendo un 5 en la posición 9");
        resultado=insertaEn(vector,9,5);
        imprimeArray(resultado);
    

    }

    // Función para imprimir un array
    public static void imprimeArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    // Función para insertar un valor en una posicion
    public static int[] insertaEn(int[] vector,int pos, int valor){
        // Condición para añadir el valor o el 0 en las posiciones
        if (pos>=vector.length){
            // Crea el nuevo vector para poder copiar el anterior y añadir
            int[] salida=new int[pos+1];  
            for(int i=0;i<vector.length;i++){
                salida[i]=vector[i];
            }  
            for(int i=vector.length;i<pos;i++){
                salida[i]=0;
            }
            salida[pos]=valor;
            return salida;
        }
        else{
            int[] salida=new int[vector.length+1];

            for(int i=0;i<pos;i++){
                salida[i]=vector[i];
            }
            salida[pos]=valor;
            for(int i =pos+1;i<salida.length;i++) {
                salida[i]=vector[i-1];
            }
            return salida;
        }
    }
}
