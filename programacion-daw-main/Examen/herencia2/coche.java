package Examen.herencia2;

public class coche extends maquina implements movible {

    public coche(){}
    public coche(String nombre){
        super.nombre = nombre;
    }

    public void encender() {
    System.out.println("El coche "+nombre+ " esta arrancando");
    }

    @Override
    public void mover() {
        System.out.println("El coche "+nombre+ " esta circulando ");
    }

    
    
}
