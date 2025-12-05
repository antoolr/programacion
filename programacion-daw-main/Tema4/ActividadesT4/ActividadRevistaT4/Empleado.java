package ActividadRevistaT4;

public class Empleado {
    int id;
    String DNI;
    String nombre;
    String apellidos;
    String telefono;
    Sucursal trabajo;

    //Constructor
    public Empleado(){

    }

    public Empleado(int id, String DNI, String nombre, String apellidos, String telefono){
        this.id=id;
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
    }

    public String getApellidos() {
        return apellidos;
    }
    public String getDNI() {
        return DNI;
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
    public Sucursal getTrabajo() {
        return trabajo;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDNI(String dNI) {
        DNI = DNI;
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
    public void setTrabajo(Sucursal trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        if(trabajo!=null)
        return "Empleado [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
                + telefono + "]+ "+trabajo.toString();
        else return "Empleado [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
                + telefono + "]";
    }

   

}
