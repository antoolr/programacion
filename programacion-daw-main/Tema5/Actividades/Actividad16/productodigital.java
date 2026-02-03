package Tema5.Actividad16;

public class productodigital extends producto {
    private String url;
    private double mb;

    public productodigital() {}
    public productodigital(int id, String nombre, double precio, String url, double mb) {
        super(id, nombre, precio);
        this.url = url;
        this.mb = mb;

    
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public double getMb() {
        return mb;
    }
    public void setMb(double mb) {
        this.mb = mb;
    }
    @Override
    public String toString() {
        return "productodigital [id=" + id + ", url=" + url + ", nombre=" + nombre + ", mb=" + mb + ", precio=" + precio
                + "]";
    }

    
}
