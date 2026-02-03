package Tema5.Actividades.Actividad17;

public class coche extends vehiculo {
    public coche(){}
    public coche(String matricula){
        super(matricula);
    }
    
    public int velocidadMaxima(){
        return 150;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Velocidad maxima: "+velocidadMaxima()+"km/h");
    }
}
