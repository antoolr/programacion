public class Actividad4 {
    public static void main(String[] args){
        
         /* función que borra un valor en el array Ej: Quitar 2 */
        int vector[] = {2,3,5,7,8,2};
        System.out.println();
        // Imprimimos el vector original 
        System.out.println("Vector original");
        for(int i =0; i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();

        // Iniciamos el nuevo vector 
        int vector2[]=new int[vector.length];

        // Lo recorremos y quitamos los 2
        System.out.println("Vector sin los numeros 2");
        for (int i=0;i<vector.length;i++){
            if(vector[i]!=2){
                vector2[i]=vector[i];
                System.out.print(vector[i]+" ");
            }
            
        }
        System.out.println();
    }
}