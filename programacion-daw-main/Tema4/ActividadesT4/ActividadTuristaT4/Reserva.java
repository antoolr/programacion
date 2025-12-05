package ActividadTuristaT4;

public class Reserva {
    hotel hotel=null;
    turista turista=null;
    sucursal sucursal=null;
    int fecha_entrada, fecha_salida;
    String regimen;

   public Reserva(){

   }

    public Reserva(ActividadTuristaT4.hotel hotel, ActividadTuristaT4.turista turista,
            ActividadTuristaT4.sucursal sucursal, int fecha_entrada, int fecha_salida, String regimen) {
        this.hotel = hotel;
        this.turista = turista;
        this.sucursal = sucursal;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.regimen = regimen;
    }

    public void setHotel(hotel hotel) {
        this.hotel = hotel;
    }
    public void setSucursal(sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public void setTurista(turista turista) {
        this.turista = turista;
    }

    public hotel getHotel() {
        return hotel;
    }
    public sucursal getSucursal() {
        return sucursal;
    }
    public turista getTurista() {
        return turista;
    }

    
    public void imprimeReserva() {
        if (hotel!=null && turista!=null && sucursal!=null){
            System.out.println(hotel);
            System.out.println(turista);
            System.out.println(sucursal);
            System.out.println("Hora entrada " +fecha_entrada);
            System.out.println("Hora salida "+fecha_salida);
            System.out.println("Regimen de "+regimen);
        }else System.out.println("No hay naica");

    }

}
