package ExamenT5.Ejercicio4;

public abstract class vehiculo implements parkeable {
    protected String matricula;
    static int plazas_ocupadas;
    
    
    public vehiculo(String matricula) {
        matricula = matricula;
    }

    @Override
    public int calcularPrecio(int horas) {
        return 0;
    }

    @Override
    public void entrar() {
        plazas_ocupadas--;
        System.out.println("El vehiculo con "+matricula + " ha entrado al parking");
        
    }

    @Override
    public void salir() {
        plazas_ocupadas++;
        System.out.println("El vehiculo con "+matricula + " ha salido del parking");
        
    }

    public int plazasLibres() {
        return plazas - plazas_ocupadas;
    }
    
}

 
