package ActividadRevistaT4;

public class Periodista {
    int id;
    String nombre, apellido, telefono, especialidad;

    public Periodista(){

    }

    public Periodista(int id, String nombre, String apellido, String telefono, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Periodista [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
                + ", especialidad=" + especialidad + "]";
    }
    
    
    
}
