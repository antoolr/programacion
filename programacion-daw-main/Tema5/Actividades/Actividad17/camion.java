package Tema5.Actividades.Actividad17;

public class camion extends vehiculo {
     public camion(){}
    public camion(String matricula){
        super(matricula);
    }
    public int velocidadMaxima(){
        return 120;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Velocidad maxima: "+velocidadMaxima()+"km/h");
    }
}
