package REjerciciosT5.Actividad7y8;

public class helicoptero extends vehiculo implements volador {

    public helicoptero(String marca) {
        super(marca);
    }

    public String volar() {
        return "El helicoptero " + marca + " vuela";
    }

    String arrancar() {
        return "El helicoptero " + marca + " arranca";
    } 
}
