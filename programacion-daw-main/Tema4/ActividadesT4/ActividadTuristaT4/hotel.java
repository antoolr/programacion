package ActividadTuristaT4;

public class hotel {
    int id,plazas;
    String nombre, telefono, ciudad, direccion;

    public hotel(){

    }
    
    public hotel(int id, int plazas, String nombre, String telefono, String ciudad, String direccion) {
        this.id = id;
        this.plazas = plazas;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;

    
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
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
    public int getPlazas() {
        return plazas;
    }
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "hotel [id=" + id + ", plazas=" + plazas + ", nombre=" + nombre + ", telefono=" + telefono + ", ciudad="
                + ciudad + ", direccion=" + direccion + "]";
    }
    

    
}
