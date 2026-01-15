package Tema5.Actividad15;

public class mamifero extends animal {
    protected int gestacion;


    public mamifero(){}
    public mamifero(int gestacion, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.gestacion = gestacion;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }
    @Override
    public String toString() {
        return "mamifero [nombre=" + nombre + ", gestacion=" + gestacion + ", edad=" + edad + ", tipo_alimentacion="
                + tipo_alimentacion + "]";
    }
    

}
