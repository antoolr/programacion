package prueba;

public class Persona {
    String nombre;
    int edad;

    public Persona(){

    }

    public Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int años){
        this.edad=años;
    }

    public int edad(){
        return this.edad;
    }

    public void imprimePersona(){
        System.out.println("Me llamo "+nombre+" y tengo "+edad+" años.");
    }
}
