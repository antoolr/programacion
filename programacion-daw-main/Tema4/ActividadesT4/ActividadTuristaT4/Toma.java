package ActividadTuristaT4;

public class Toma {
    vuelo vuelo=null;
    turista turista=null;
    sucursal sucursal=null;
    String clase;

    public Toma (){
        
    }
    public Toma(ActividadTuristaT4.vuelo vuelo, ActividadTuristaT4.turista turista,
            ActividadTuristaT4.sucursal sucursal, String clase) {
        this.vuelo = vuelo;
        this.turista = turista;
        this.sucursal = sucursal;
        this.clase = clase;
    }

    public void setSucursal(sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public void setTurista(turista turista) {
        this.turista = turista;
    }
    public void setVuelo(vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }

    public sucursal getSucursal() {
        return sucursal;
    }
    public turista getTurista() {
        return turista;
    }
    public vuelo getVuelo() {
        return vuelo;
    }
    public String getClase() {
        return clase;
    }


    public void imprimeToma() {
        if (vuelo!=null && turista!=null && clase!=null){
        System.out.println(vuelo);
        System.out.println(turista);
        System.out.println(sucursal);
        System.out.println(clase);
        }else System.out.println("No hay na de na");
        }
    
    }

    
    

