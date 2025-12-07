package Tema4.relacionT4.ejercicio4;

public class marca {
    private int id;
    private String nombre;

    public marca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + nombre + " (ID: " + id + ")");
    }
}
