package ActividadTuristaT4;


public class ActividadTurista {

    
    public static void main(String[] args) {
        hotel hotel1= new hotel(1, 200, "Parrilla", "648301921", "Albox", "calle");
        hotel hotel2 = new hotel(2, 37, "BaiLong", "690231546", "Okinawa", "alpino");

        turista turista1 = new turista(1, "avenida", "Tezcat", "Froste", "612345987");
        turista turista2 = new turista(2, "parador", "Axel", "Evans", "689876789");

        vuelo vuelo1 = new vuelo(1, 33, "Kioto", "Albox", "17:45", "17/05/2025");
        vuelo vuelo2 = new vuelo(2, 58, "Nara", "Hokkaido", "13:30", "01/01/2001");

        sucursal sucursal1 = new sucursal(1, "657893215", "avenida", "Fuji", "Almería");
        sucursal sucursal2 = new sucursal(2, "609876543", "calle", "Ehine", "Granada");

        Toma[] toma = new Toma[2];
        Toma toma1 = new Toma(vuelo1, turista1, sucursal1, "pobre");
        Toma toma2 = new Toma(vuelo2, turista2, sucursal2, "proletariao");

        Reserva[] reserva = new Reserva[2];
        Reserva reserva1 = new Reserva(hotel1, turista1, sucursal1, 12, 17, "Pension completa");
        Reserva reserva2 = new Reserva(hotel2, turista2, sucursal2, 10, 11, "Nada");

    
        reserva2.imprimeReserva();
    }
}
