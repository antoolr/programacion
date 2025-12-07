package Tema4.relacionT4.ejercicio3;

public class Fabrica {
    private String nombre;
    private String pais;

    public Fabrica(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public void mostrarInfo() {
        System.out.println("Fábrica: " + nombre + " en " + pais);
    }
}

