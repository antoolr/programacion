package Tema4.relacionT4.ejercicio4;

public class modelo {
    private int id;
    private String nombre;

    public modelo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarModelo() {
        System.out.println("Modelo: " + nombre + " (ID: " + id + ")");
    }
    }


