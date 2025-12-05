package ExamenT3;
import java.util.*;

public class ejercicio1 {
    public static void main(String[] args) {
        //Generar arrays de opositor y de las bolas
        ArrayList<Integer> opositor = new ArrayList<>(Arrays.asList(4,11,23,34,35,36,39,50,60,65));
        ArrayList<Integer> bolas = generarVectorAleatorio(65, 5);

        //Mostrar las bolas que se han generado
        System.out.println("Bolas sacadas: " + bolas);
        ArrayList<Integer> coincidentes = validarCoincidencias(opositor, bolas);

        //Ver si coincide alguna bola con los temas y mostrar mensaje de ambas situaciones
        if (coincidentes.isEmpty()) {
            System.out.println("Lo sentimos, no hay coincidencias.");
        } else {
            Collections.sort(coincidentes);
            System.out.println("Temas coincidentes: " + coincidentes + ". Enhorabuena");
        }
    }

    public static ArrayList<Integer> generarVectorAleatorio(int max, int cantidad) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        while (lista.size() < cantidad) {
            int num = random.nextInt(max) + 1;
            if (!lista.contains(num)) lista.add(num);
        }
        return lista;
    }

    public static ArrayList<Integer> validarCoincidencias(ArrayList<Integer> opositor, ArrayList<Integer> bolas) {
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int num : bolas) {
            if (opositor.contains(num)) resultado.add(num);
        }
        return resultado;
    }
}


