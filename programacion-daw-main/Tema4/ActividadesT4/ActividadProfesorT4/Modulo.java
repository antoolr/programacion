package ActividadProfesorT4;

public class Modulo {
    int codigo;
    String nombre;
    

    public Modulo(){

    }

    public Modulo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    

    @Override
    public String toString() {
        return "Modulo [codigo=" + codigo + ", nombre=" + nombre + "]";
    }

    
}
