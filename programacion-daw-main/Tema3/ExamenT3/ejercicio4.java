package ExamenT3;

import java.util.*;

public class ejercicio4 {
    public static boolean verificaAnagrama(String palabra1, String palabra2) {
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        if (palabra1.length() != palabra2.length()) return false;

        char[] p1 = palabra1.toCharArray();
        char[] p2 = palabra2.toCharArray();

        Arrays.sort(p1);
        Arrays.sort(p2);

        return Arrays.equals(p1, p2);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra: ");
        String p1 = teclado.nextLine();
        System.out.println("Introduce la palabra: ");
        String p2 = teclado.nextLine();

        if (verificaAnagrama(p1, p2)) {
            System.out.println("Son anagramas.");
        } else {
            System.out.println("No son anagramas.");
        }
    }
}
    

