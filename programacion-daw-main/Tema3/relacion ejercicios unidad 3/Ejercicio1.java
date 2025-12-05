public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        //Crea el vector dinámico
       int [] vector=null;
       //Inserta un valor
        vector=push(vector, 3);
        //Inserta un valor
        vector=push(vector, 5);
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+ " ");
        }
        //Elimina el ultimo
        int valor = pop(vector);
        System.out.println(valor);
    }
    public static int[] push(int[] array, int valor){
        int longitud;
        if (array==null) longitud=0;
        else longitud=array.length;
        //Crea el array con +1 de tamaño
        int[] salida=new int[longitud+1];
        //Copiar lo que haya en ese momento
        for(int i=0;i<longitud;i++){
            salida[i]=array[i];
    }
    salida[longitud]=valor;
    return salida;
    }

    public static int pop(int [] array) {
        if (array == null) return -1;
        //Sacar el valor último
        int valor=array[array.length-1];
        //Generar el vector con uno menos
        int[] nuevo=new int[array.length-1];
        //Copiar hasta el tamaño nuevo
        for (int i=0;i<nuevo.length;i++){
            nuevo[i]=array[i];
        }
        array=nuevo;
        return valor;

    }
}


