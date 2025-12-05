package ActividadTuristaT4;

public class turista {
    int id;
    String direccion, nombre, apellidos, telefono;

    public turista(){
        
    }

    public turista(int id, String direccion, String nombre, String apellidos, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    
    public String getApellidos() {
        return apellidos;
    }
    public String getDireccion() {
        return direccion;
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
        return "turista [id=" + id + ", direccion=" + direccion + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", telefono=" + telefono + "]";
    }

    
}
