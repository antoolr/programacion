package REjerciciosT5.Actividad4;

public class Actividad4 extends Caja {

   public Actividad4(Object contenido) {
        super(contenido);
        
    } 

    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<String>("Domin");
        Caja<Integer> cajaInteger = new Caja<Integer>(2026);
        Caja<Double> cajaDouble = new Caja<Double>(3.5);
        Caja<Character> cajaCharacter = new Caja<Character>('P');

        System.out.println("Contenido caja 1 " +cajaString.getContenido());
        System.out.println("Contenido caja 2 " +cajaInteger.getContenido());
        System.out.println("Contenido caja 3 " +cajaDouble.getContenido());
        System.out.println("Contenido caja 4 " +cajaCharacter.getContenido());
    }
}
