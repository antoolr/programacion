package REjerciciosT5.Actividad7y8;

public class avion extends vehiculo implements volador {

    public avion(String marca) {
        super(marca);
    }

    @Override
    public String volar() {
        return "El avion vuela";
    }

    @Override
    String arrancar() {
        return "El avion " + marca + " arranca";
    }
    
    }
