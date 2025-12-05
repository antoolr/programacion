package ActividadRevistaT4;

public class Sucursal_publica_Revista {
    Revista revista=null;
    Sucursal sucursal=null;

    public Sucursal_publica_Revista(){

    }

    public Sucursal_publica_Revista(Revista revista, Sucursal sucursal) {
        this.revista = revista;
        this.sucursal = sucursal;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Revista getRevista() {
        return revista;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }

    @Override
    public String toString() {
        if(sucursal!= null && revista!=null)
        return "Sucursal_publica_Revista [revista=" + revista.toString() + ", sucursal=" + sucursal.toString() + "] ";
            else return "No hay datos de sucursal y revista";
    }

    
    
}
