package Examen.herencia;

public class villano extends personaje implements ipresentable {
    int maldad;


    public villano(String nombre, int edad, int maldad){
        super.personaje(nombre, edad);
        this.maldad = maldad;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy "+nombre+ " tengo "+edad+ " anos y mi maldad es de "+maldad);
        
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    } 
}
