package Tema5.Actividades.Actividad19;


public abstract class figura {
    protected String nombre;

    public figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura: " + nombre +
               ", área=" + calcularArea() +
               ", perímetro=" + calcularPerimetro();
    }
}
