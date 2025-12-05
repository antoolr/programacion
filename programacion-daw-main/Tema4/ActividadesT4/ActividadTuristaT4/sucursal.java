package ActividadTuristaT4;

public class sucursal {
    int id;
    String telefono, direccion, ciudad, provincia;

    public sucursal(){

    }
    
    public sucursal(int id, String telefono, String direccion, String ciudad, String provincia) {
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
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
    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
    public String getProvincia() {
        return provincia;
    }
    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return "sucursal [id=" + id + ", telefono=" + telefono + ", direccion=" + direccion + ", ciudad=" + ciudad
                + ", provincia=" + provincia + "]";
    }
    
    
}
