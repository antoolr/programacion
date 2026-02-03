package Tema5.Actividad16;

public class productofisico extends producto {
    protected double peso;
    protected double coste_envio;

    
    

    public productofisico(int id, String nombre, double precio, double peso, double coste_envio) {
        super(id, nombre, precio);
        this.peso = peso;
        this.coste_envio = coste_envio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCoste_envio() {
        return coste_envio;
    }

    public void setCoste_envio(double coste_envio) {
        this.coste_envio = coste_envio;
    }

    @Override
    public String toString() {
        if (peso > 2.0) {
            return "productofisico [id=" + id + ", peso=" + peso + ", nombre=" + nombre + ", coste_envio=" + coste_envio
                    + ", precio=" + precioFinal() + "]";
        } else
        return "productofisico [id=" + id + ", peso=" + peso + ", nombre=" + nombre + ", coste_envio=" + coste_envio
                + ", precio=" + precio + "]";
    }

    
}
