package Examen;

import Examen.subclases_caja.Animal;
import Examen.subclases_caja.Gato;
import Examen.subclases_caja.Perro;

public class generica {
    public static class Caja<T> {
        private T contenido;

        public void guardar(T valor) {
            contenido = valor;
        }

        public T obtener() {
            return contenido;
        }
    }

    public static void main(String[] args) {

        Caja<Animal> cajaAnimales = new Caja<>();

        cajaAnimales.guardar(new Perro());
        cajaAnimales.obtener().hablar();  // Guau

        cajaAnimales.guardar(new Gato());
        cajaAnimales.obtener().hablar();  // Miau
    }
}



