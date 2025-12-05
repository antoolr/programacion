public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Comprobar que dos cadenas tienen lo mismo
        char[] cadena1={'A','n','t','o','n','i','o'};
        char[] cadena2={'A','n','t','o','n','i','o'};
        if(comparaCadenas(cadena1,cadena2)) System.out.println("Son iguales");
        else System.out.println("Son diferentes");

        String palabra1="Domingo";
        String palabra2="Alvarete";
        if(palabra1.equals(palabra2)) System.out.println("Son iguales");
        else System.out.println("Son diferentes");

    }
    public static boolean comparaCadenas(char[] cadena1,char[] cadena2){
        if(cadena1.length!=cadena2.length) return false;
        for(int i=0;i<cadena1.length;i++){
            if(cadena1[i]!=cadena2[i]) return false;
        }
        return true;
    }
}
