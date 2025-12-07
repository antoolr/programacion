package Tema4.relacionT4.ejercicio3;

public class Empleado {
    private String nombre;
    private String legajo;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " (Legajo: " + legajo + ")");
    }
}

