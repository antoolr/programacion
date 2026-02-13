package Tema6.src.actividades.ActividadMVC1.Modelo;

public class asignatura {
    private int codigo, numero_horas;
    private String nombre;
    
    public asignatura(int codigo, int numero_horas, String nombre) {
        this.codigo = codigo;
        this.numero_horas = numero_horas;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getNumero_horas() {
        return numero_horas;
    }
    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
