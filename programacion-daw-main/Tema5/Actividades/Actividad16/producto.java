package Tema5.Actividad16;

public class producto {
    protected int id;
    protected String nombre;
    protected double precio;
    
    public producto() {}
    public producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double precioFinal() {
        return precio*1.21;
    }
    @Override
    public String toString() {
        return "producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "PrecioIVA: "+ precioFinal() +"]";
    }

    
}
