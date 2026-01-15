package Tema5.Actividad15;

public class perro extends mamifero {
    private String raza;

    public perro(){}
    public perro(String raza, String nombre, String tipo_alimentacion, int edad) {
        super(63, nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "perro [nombre=" + nombre + ", gestacion=" + gestacion + ", raza=" + raza + ", edad=" + edad
                + ", tipo_alimentacion=" + tipo_alimentacion + "]";
    }

    
}
