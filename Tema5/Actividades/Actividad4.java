package Tema5.Actividades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Actividad4 {

    public static void main(String[] args) throws IOException {

        int[] numeros = new int[6];
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int n;
            boolean repetido;

            do {
                n = r.nextInt(49) + 1;
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (numeros[j] == n) {
                        repetido = true;
                        break;
                    }
                }

            } while (repetido);

            numeros[i] = n;
        }

        // Guardar en archivo
        FileWriter fw = new FileWriter("Tema5/Actividades/bonoloto.txt");

        for (int i = 0; i < 6; i++) {
            fw.write(numeros[i] + (i < 5 ? " " : ""));
        }

        fw.close();

        System.out.println("Bonoloto generada y guardada.");
    }
}

