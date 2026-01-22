package REjerciciosT5.Actividad4;

public class Caja <T> {
    protected T contenido;

    public Caja(T contenido){ 
        this.contenido = contenido; 
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
}
