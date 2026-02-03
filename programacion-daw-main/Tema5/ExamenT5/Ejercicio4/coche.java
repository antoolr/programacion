package ExamenT5.Ejercicio4;

public class coche extends vehiculo {
    static final int precio_hora = 2;

    public coche(String matricula) {
        super(matricula);
        this.matricula = matricula;
    }


    @Override
    public int calcularPrecio(int horas) {
        return horas * 2;
    }


    @Override
    public void entrar() {
        System.out.println("El coche con "+matricula + " esta entrando");
    }


    @Override
    public void salir() {
    System.out.println("El coche con "+matricula + " esta saliendo");
    }

    

    

    
}
