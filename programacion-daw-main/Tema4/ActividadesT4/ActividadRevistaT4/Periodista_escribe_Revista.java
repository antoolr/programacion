package ActividadRevistaT4;

public class Periodista_escribe_Revista {
    Periodista periodista;
    Revista revista;

    public Periodista_escribe_Revista(){

    }

    public Periodista_escribe_Revista(Periodista periodista, Revista revista) {
        this.periodista = periodista;
        this.revista = revista;
    }

    public void setPeriodista(Periodista periodista) {
        this.periodista = periodista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Periodista getPeriodista() {
        return periodista;
    }
    public Revista getRevista() {
        return revista;
    }

    @Override
    public String toString() {
        if(revista!=null && periodista!=null)
        return "Periodista_escribe_Revista [periodista=" + periodista.toString() + ", revista=" + revista.toString() + "]";
            else return "No hay ni perdiodista ni revista";
    }
    

    
}
