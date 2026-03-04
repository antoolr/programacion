package actividades.ActividadMVC2.Modelo;

public class asignatura {
    private int codigo;
    private String nombre;
    private int numeroHoras;
    private profesor profesor;

    public asignatura(int codigo, String nombre, int numeroHoras, profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.profesor = profesor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(profesor profesor) {
        this.profesor = profesor;
    }

    
}

