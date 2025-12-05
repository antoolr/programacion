package ActividadTuristaT4;

public class vuelo {
    int id,plazasTotales;
    String destino, origen, hora, fecha;

    public vuelo(){
        
    }
    
    public vuelo(int id, int plazasTotales, String destino, String origen, String hora, String fecha) {
        this.id = id;
        this.plazasTotales = plazasTotales;
        this.destino = destino;
        this.origen = origen;
        this.hora = hora;
        this.fecha = fecha;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public String getDestino() {
        return destino;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }
    public int getId() {
        return id;
    }
    public String getOrigen() {
        return origen;
    }
    public int getPlazasTotales() {
        return plazasTotales;
    }
    
    @Override
    public String toString() {
        return "vuelo [id=" + id + ", plazasTotales=" + plazasTotales + ", destino=" + destino + ", origen=" + origen
                + ", hora=" + hora + ", fecha=" + fecha + "]";
    }

    
}
