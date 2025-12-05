import java.text.Normalizer;

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = "Dábale arroz a la zorra el abad";
        if (esPalindromo(frase)) {
            System.out.println("Es palíndroma.");
        } else {
            System.out.println("No es palíndroma.");
        }
    }

    public static boolean esPalindromo(String texto) {
        // Pasar a minúsculas
        texto = texto.toLowerCase();

        // Eliminar tildes
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        // Eliminar espacios y signos de puntuación
        texto = texto.replaceAll("[^a-z]", "");

        // Comparar con su reverso
        String invertido = new StringBuilder(texto).reverse().toString();

        return texto.equals(invertido);
    }
}

