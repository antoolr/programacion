import prueba.Matematicas;
import prueba.Persona;

public class Actividad {
    public static void main(String[] args) {
        Persona p= new Persona("Domin",2);
        p.imprimePersona();

        int a=5;
        int b=3;

        System.out.println(Matematicas.multiplicacion(a, b));
        
        System.out.println(p.getNombre());
    }
}
