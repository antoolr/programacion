package Examen.herencia2;

public class avion extends maquina implements movible {

    public avion(){}
    public avion(String nombre){
        super.nombre = nombre;
    }
    @Override
    public void encender() {
    System.out.println("El avion "+nombre+ " esta encendiendo motores");        
    }

    @Override
    public void mover() {
    System.out.println("El avion "+nombre+ "esta despegando");        
    }
    
}
