package Tema4.relacionT4.ejercicio4;

public class cocheusado {
     private int id;
    private String matricula;
    private double precioTasacion;
    private String nombre;

    public cocheusado(int id, String matricula, double precioTasacion, String nombre) {
        this.id = id;
        this.matricula = matricula;
        this.precioTasacion = precioTasacion;
        this.nombre = nombre;
    }

    public void mostrarcUsado() {
        System.out.println("Coche usado: " + nombre + " Matrícula: " + matricula +
                           " Precio tasación: " + precioTasacion + " (ID: " + id + ")");
    }
}
