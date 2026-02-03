package REjerciciosT5.Actividad7y8;

public class coche extends vehiculo {
    public coche(String marca) {
        super(marca);
    }

    @Override
    public String arrancar() {
        return "El coche " + marca + " arranca";
    }

    @Override
    public String frenar() {
        return super.frenar();
    }
    
}
