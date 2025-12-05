package ActividadesT4.src;

public class Proveedor_suministra_pieza {
    Pieza pieza;
    Proveedor proveedor;
    int cantidad;
    String fecha;

    public Proveedor_suministra_pieza(){

    }
    public void Proveedor_suministra_pieza(Pieza pieza, Proveedor proveedor, int cantidad, String fecha){

    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }
    public String getFecha() {
        return fecha;
    }
    public Pieza getPieza() {
        return pieza;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
}
