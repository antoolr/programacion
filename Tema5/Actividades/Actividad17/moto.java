package Tema5.Actividades.Actividad17;

public class moto extends vehiculo {
     public moto(){}
    public moto(String matricula){
        super(matricula);
    }
    public int velocidadMaxima(){
        return 180;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Velocidad maxima: "+velocidadMaxima()+"km/h");
    }
}
