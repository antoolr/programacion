package Tema5.Actividades;

import java.util.ArrayList;

public class Actividad13<T> {

    private ArrayList<T> pila;

    public Actividad13() {
        pila = new ArrayList<>();
    }

    public void insertar(T elemento) {
        pila.add(elemento);
    }

    public T borrar() {
        if (estaVacia()) {
            return null;
        }
        return pila.remove(pila.size() - 1);
    }

    public int buscar(T elemento) {
        return pila.indexOf(elemento);
    }

    public T devolver() {
        if (estaVacia()) {
            return null;
        }
        return pila.get(pila.size() - 1);
    }

    // Comprobar si está vacía
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    // Mostrar pila
    @Override
    public String toString() {
        return pila.toString();
    }

    public static void main(String[] args) {

        Actividad13<String> pila = new Actividad13<>();

        pila.insertar("Ana");
        pila.insertar("Luis");
        pila.insertar("Pepe");

        System.out.println("Pila: " + pila);

        System.out.println("Último elemento: " + pila.devolver());

        System.out.println("Posición de Luis: " + pila.buscar("Luis"));

        System.out.println("Borrando: " + pila.borrar());
        System.out.println("Pila tras borrar: " + pila);

        System.out.println("¿Está vacía? " + pila.estaVacia());
    }
}

