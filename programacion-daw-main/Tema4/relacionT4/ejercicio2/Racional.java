package Tema4.relacionT4.ejercicio2;

public class Racional {
    private int numerador;
    private int denominador;

    // Constructor
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            denominador = 1; // evitar división por cero
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Métodos para asignar valores
    public void asignaNumerador(int x) {
        numerador = x;
    }

    public void asignaDenominador(int y) {
        if (y != 0) {
            denominador = y;
        }
    }

    // Método para imprimir
    public void imprimirRacional() {
        System.out.println(numerador + "/" + denominador);
    }

    // Operaciones básicas
    public Racional suma(Racional otro) {
        int nuevoNum = numerador * otro.denominador + otro.numerador * denominador;
        int nuevoDen = denominador * otro.denominador;
        return new Racional(nuevoNum, nuevoDen);
    }

    public Racional resta(Racional otro) {
        int nuevoNum = numerador * otro.denominador - otro.numerador * denominador;
        int nuevoDen = denominador * otro.denominador;
        return new Racional(nuevoNum, nuevoDen);
    }

    public Racional producto(Racional otro) {
        int nuevoNum = numerador * otro.numerador;
        int nuevoDen = denominador * otro.denominador;
        return new Racional(nuevoNum, nuevoDen);
    }

    public Racional division(Racional otro) {
        int nuevoNum = numerador * otro.denominador;
        int nuevoDen = denominador * otro.numerador;
        return new Racional(nuevoNum, nuevoDen);
    }

    // Comparación
    public boolean esIgual(Racional otro) {
        return numerador * otro.denominador == otro.numerador * denominador;
    }
}

