package ActividadRevistaT4;

public class Revista {
    int numero;
    String titulo, tipo, periodicidad;

    public Revista(){

    }

    public Revista(int numero, String titulo, String tipo, String periodicidad) {
        this.numero = numero;
        this.titulo = titulo;
        this.tipo = tipo;
        this.periodicidad = periodicidad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getNumero() {
        return numero;
    }
    public String getPeriodicidad() {
        return periodicidad;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Revista [numero=" + numero + ", titulo=" + titulo + ", tipo=" + tipo + ", periodicidad=" + periodicidad
                + "]";
    }

    
}
