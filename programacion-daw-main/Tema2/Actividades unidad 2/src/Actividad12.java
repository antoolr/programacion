public class Actividad12 {
     public static int suma(int numero1, int numero2){
        return numero1+numero2;
    }
    public static double suma(double numero1, double numero2){
        return numero1+numero2;
    }
  public static void escribir(){
        System.out.println("Hola domingo");
        System.out.println("Hola pedro");
        System.out.println("Hola adri");
  }


  //Función que devuelve el maximo de 2 numeros
  public static int maximo(int numero1, int numero2){
    if(numero1>=numero2) return numero1;
    return numero2;
  }



    public static void main(String[] args) {
        
        escribir();

        //Operación
        System.out.println(maximo(maximo(3,7), 22));
    }
}
