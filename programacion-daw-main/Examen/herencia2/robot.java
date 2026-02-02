package Examen.herencia2;

public class robot extends maquina {
    
    public robot(){}
    public robot(String nombre){
        super.nombre = nombre;
    }
    @Override
    public void encender() {
    System.out.println("El robot "+nombre+ " se ha activado");      
    }
    
}
