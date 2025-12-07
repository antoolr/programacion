package Tema4.relacionT4.ejercicio4;

public class version {
    private int id;
    private String nombre;
    private int potencia;
    private double precioBase;
    private String tipoCombustible;

    public version(int id, String nombre, int potencia, double precioBase, String tipoCombustible) {
        this.id = id;
        this.nombre = nombre;
        this.potencia = potencia;
        this.precioBase = precioBase;
        this.tipoCombustible = tipoCombustible;
    }

    public void mostrarVersion() {
        System.out.println("Versión: " + nombre + " (ID: " + id + ") Potencia: " + potencia +
                           " Precio base: " + precioBase + " Combustible: " + tipoCombustible);
    }
}
