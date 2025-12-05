package ActividadRevistaT4;

public class Seccion {
    String titulo, extension;
    Revista revista=null;

    public Seccion(){

    }

    public Seccion(String titulo, String extension) {
        this.titulo = titulo;
        this.extension = extension;
    }

    public String getextension() {
        return extension;
    }
    public String gettitulo() {
        return titulo;
    }
    public Revista getRevista() {
        return revista;
    }
    
    public void setextension(String extension) {
        this.extension = extension;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        if (revista!=null) 
        return "Seccion [titulo=" + titulo + ", extension=" + extension + "] "+revista.toString();
    else return "Seccion [titulo=" + titulo + ", extension=" + extension + "] ";
    }
    
    
}
