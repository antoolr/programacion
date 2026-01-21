package REjerciciosT5.Actividad7y8;

public class Actividad7 {
    public static void main(String[] args) {
        coche c1 = new coche("Toyota");
        coche c2 = new coche("Honda");

        moto m1 = new moto("Honda");
        moto m2 = new moto("Yamaha");

        System.out.println(m1.arrancar());
        System.out.println(m1.frenar());

    }
}
