package Tema6.src.actividades.ActividadMVC1.Modelo;

public class asignatura {
    private int codigo;
    private int numeroHoras;
    private String nombre;
    
    public asignatura(int codigo, int numero_horas, String nombre) {
        this.codigo = codigo;
        this.numeroHoras = numero_horas;
        this.nombre = nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getNumero_horas() {
        return numeroHoras;
    }
    public void setNumero_horas(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
