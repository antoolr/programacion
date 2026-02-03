package REjerciciosT5.Actividad7y8;

public class moto extends vehiculo {
    public moto(final String marca) {
        super(marca);
    }

    @Override
    public String arrancar() {
        return "La moto " + marca + " arranca";
    }

    @Override
    public String frenar() {
        return super.frenar();
    }
    
}
