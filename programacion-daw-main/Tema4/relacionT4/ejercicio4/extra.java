package Tema4.relacionT4.ejercicio4;

public class extra {
    private int id;
    private String nombre;
    private String descripcion;

    public extra(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void mostrarExtra() {
        System.out.println("Extra: " + nombre + " (ID: " + id + ") Descripción: " + descripcion);
    }
}
