package ActividadFerroviariaT4;

public class Vagon {
    int numero, carga_maxima, carga_actual;
    String tipo_mercancia;
    public int length;

    public Vagon(){

    }

    public Vagon(int numero, int carga_maxima, int carga_actual, String tipo_mercancia) {
        this.numero = numero;
        this.carga_maxima = carga_maxima;
        this.carga_actual = carga_actual;
        this.tipo_mercancia = tipo_mercancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(int carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public int getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(int carga_actual) {
        this.carga_actual = carga_actual;
    }

    public String getTipo_mercancia() {
        return tipo_mercancia;
    }

    public void setTipo_mercancia(String tipo_mercancia) {
        this.tipo_mercancia = tipo_mercancia;
    }

    @Override
    public String toString() {
        return "Vagon [numero=" + numero + ", carga_maxima=" + carga_maxima + ", carga_actual=" + carga_actual
                + ", tipo_mercancia=" + tipo_mercancia + "]";
    }

    
}
