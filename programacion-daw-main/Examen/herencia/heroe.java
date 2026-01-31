package Examen.herencia;

public class heroe extends personaje implements ipresentable{
    int poder;

    
    public heroe(String nombre, int edad, int poder){
        super.personaje(nombre,edad);
        this.poder = poder;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Soy "+nombre+ " tengo "+edad+ " anos y mi poder es de "+poder);
    }

    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
    
}
