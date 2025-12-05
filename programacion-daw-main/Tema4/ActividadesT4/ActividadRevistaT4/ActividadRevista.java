package ActividadRevistaT4;

public class ActividadRevista {
    public static void main(String[] args) {
        Periodista periodista = new Periodista(1, "Antonio", "Lozano", "666777888", "Investigacion");
        Periodista periodista2 = new Periodista(2, "Pedrito", "Moreno", "678102345", "Inazuma");

        Revista revista = new Revista(1, "Programacion", "Informatica", "diario");
        Revista revista2 = new Revista(2, "Lenguaje", "Informatica", "diario");
        Ejemplar ejemplar = new Ejemplar("13/04/2007", 45, 1);
        Seccion seccion = new Seccion("Informatica", "123");

        seccion.setRevista(revista); ejemplar.setRevista(revista2);

        Sucursal sucursal = new Sucursal(1, "calle", "654321789", "Albox", "Almeria");
        

        Empleado empleado = new Empleado(1, "33445566", "Alvarete", "Martinez", "675392102");
        Empleado empleado2 = new Empleado(2, "4444444", "Adri", "Lopez", "671290854");
        Empleado empleado3 = new Empleado(3, "9999999", "Domin", "Rodriguez", "674567892");
        empleado.setTrabajo(sucursal); empleado2.setTrabajo(sucursal); empleado3.setTrabajo(sucursal);

        Sucursal_publica_Revista[] publica = new Sucursal_publica_Revista[5];
        Sucursal_publica_Revista p1= new Sucursal_publica_Revista(revista2, sucursal);
        Sucursal_publica_Revista p2= new Sucursal_publica_Revista(revista, sucursal);

        publica[0]=p1;
        publica[1]=p2;

        Periodista_escribe_Revista[] escribe = new Periodista_escribe_Revista[3];
        Periodista_escribe_Revista e1 = new Periodista_escribe_Revista(periodista2, revista2);
        Periodista_escribe_Revista e2 = new Periodista_escribe_Revista(periodista2, revista2);

        escribe[0]=e1;
        escribe[1]=e2;

        System.out.println(periodista);

        System.out.println(empleado);

        if(empleado.getTrabajo().getCodigo()==1)
            System.out.println(empleado);

    }
}
