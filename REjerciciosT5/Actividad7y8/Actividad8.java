package REjerciciosT5.Actividad7y8;
import java.util.ArrayList;

public class Actividad8 {
    public static void main(String[] args) {
        ArrayList<vehiculo>listavehiculos = new ArrayList<>();

        listavehiculos.add(new helicoptero("Buzzard"));
        listavehiculos.add(new helicoptero("Hydra"));

        listavehiculos.add(new avion("Caza"));
        listavehiculos.add(new avion("Avion Comercial"));

        listavehiculos.add(new coche("Volkswagen"));
        listavehiculos.add(new coche("Ford"));

        for (vehiculo v: listavehiculos){
            System.out.println(v.arrancar());

        if (v instanceof volador) {
            volador voladorvehiculo = (volador) v;
            System.out.println(voladorvehiculo.volar());
            
        }
        }

    }
}
