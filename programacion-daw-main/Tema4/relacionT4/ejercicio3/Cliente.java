package Tema4.relacionT4.ejercicio3;

public class Cliente {
    private String dni;
    private String nombre;
    private Tarjeta tarjeta; // relación 1,1 con Tarjeta

    public Cliente(String dni, String nombre, Tarjeta tarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " (DNI: " + dni + ")");
        if (tarjeta != null) {
            tarjeta.mostrarInfo();
        }
    }
}
