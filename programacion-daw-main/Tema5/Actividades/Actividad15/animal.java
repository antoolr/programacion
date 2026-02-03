package Tema5.Actividad15;

public class animal {
    protected String nombre;
    protected int edad;
    protected String tipo_alimentacion;

    public animal(){}
    public animal (String nombre,String tipo_alimentacion, int edad){
        this.nombre=nombre;
        this.tipo_alimentacion=tipo_alimentacion;
        this.edad=edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }
    @Override
    public String toString() {
        return "animal [nombre=" + nombre + ", edad=" + edad + ", tipo_alimentacion=" + tipo_alimentacion + "]";
    }
    
}
