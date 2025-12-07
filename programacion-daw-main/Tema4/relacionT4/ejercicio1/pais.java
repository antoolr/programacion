package Tema4.relacionT4.ejercicio1;


public class pais {
    private String nombre;
    private int poblacion;
    private double pib;

    public pais(String nombre, int poblacion, double pib) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pib = pib;
    }

    public String getNombre() { return nombre; }
    public int getPoblacion() { return poblacion; }
    public double getPib() { return pib; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPoblacion(int poblacion) { this.poblacion = poblacion; }
    public void setPib(double pib) { this.pib = pib; }

    public double pibPerCapita() {
        return (pib * 100000) / poblacion;
    }
}
