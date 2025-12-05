package ActividadFerroviariaT4;

public class Mecanico {
    String nombre, DNI;
    int telefono;
    Especialidad especialidad;

    public Mecanico (){

    }

    public Mecanico(String nombre, String dNI, Especialidad especialidad, int telefono) {
        this.nombre = nombre;
        DNI = dNI;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = DNI;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Mecanico [nombre=" + nombre + ", DNI=" + DNI + ", especialidad=" + especialidad + ", telefono="
                + telefono + "]";
    }

    
}
