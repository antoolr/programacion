package ExamenT5.Ejercicio4;

public class moto extends vehiculo{
    static final int precio_hora = 1;

    public moto(String matricula) {
        super(matricula);
        this.matricula = matricula;
    }

    @Override
    public int calcularPrecio(int horas) {
        return horas * precio_hora;
    }

    @Override
    public void entrar() {
    System.out.println("La moto con "+matricula + " esta entrando");
    }

    @Override
    public void salir() {
    System.out.println("La moto con "+matricula + " esta saliendo");
    }

    
    
}
