import java.util.ArrayList;

public class Agenda2 {
    public static void main(String[] args) {
        ArrayList<Persona5> lista = new ArrayList<>();
        lista.add(new Persona5("Domingo", "avenida", "66666666"));
        lista.add(new Persona5("Pedrito", "calle", "66666666"));
        lista.add(new Persona5("Antoñito", "portal", "66666666"));
        lista.add(new Persona5("Alvarete", "local", "66666666"));
        lista.add(new Persona5("Adrian", "Otra", "66666666"));
    
    //Orden la lista de personas
    lista.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
    //Mostrar las personas
    for (int i=0;i<lista.size();i++){
        lista.get(i).imprimePersona();
    }
}
}


