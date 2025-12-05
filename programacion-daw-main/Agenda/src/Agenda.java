public class Agenda {
    public static void main(String[] args) throws Exception {
        //Necesito tener un vector de personas
        Persona5[] lista = new Persona5[5];

        lista[0]=new Persona5("Domingo", "avenida", "66666666");
        lista[1]=new Persona5("Pedrito", "calle", "66666666");
        lista[2]=new Persona5("Antoñito", "portal", "66666666");
        lista[3]=new Persona5("Alvarete", "local", "66666666");
        lista[4]=new Persona5("Adrian", "Otra", "66666666");

        //Imprimir las personas
        for(int i=0;i<lista.length;i++){
            lista[i].imprimePersona();
        }
    }
}
