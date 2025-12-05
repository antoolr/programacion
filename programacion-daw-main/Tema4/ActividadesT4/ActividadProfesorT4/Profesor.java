package ActividadProfesorT4;

public class Profesor {
    String nombre, direccion, telefono, DNI;

    public Profesor(){

    }

    public Profesor(String nombre, String direccion, String telefono, String dNI) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        DNI = dNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", DNI=" + DNI
                + "]";
    }

    
}
