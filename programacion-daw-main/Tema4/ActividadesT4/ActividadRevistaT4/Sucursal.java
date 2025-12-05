package ActividadRevistaT4;

public class Sucursal {
    int codigo;
    String direccion, telefono, ciudad, provincia;

    public Sucursal(){

    }

  


    public Sucursal(int codigo, String direccion, String telefono, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    public int getCodigo() {
        return codigo;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getTelefono() {
        return telefono;
    }




    @Override
    public String toString() {
        return "Sucursal [codigo=" + codigo + ", direccion=" + direccion + ", telefono=" + telefono + ", ciudad="
                + ciudad + ", provincia=" + provincia + "]";
    }

    
}
