package Tema4.relacionT4.ejercicio3;

public class Producto {
    private String codigo;
    private String nombre;
    private double precioVenta;

    public Producto(String codigo, String nombre, double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " (" + codigo + ") Precio: " + precioVenta);
    }
}
