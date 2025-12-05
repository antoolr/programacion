import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    // String nombre;
    // byte edad;
    // double estatura;
    

    // public Persona(){
        
    // }

    
    // public Persona (String nombre, byte edad, double estatura){
    //     this.nombre=nombre;
    //     this.edad=edad;
    //     this.estatura=estatura;
    // }

    // public void setNombre(String nombre){
    //     this.nombre=nombre;
    // }

    // public void setedad(byte edad){
    //     this.edad=edad;
    // }
    // public byte edad(){
    //     return edad;
    // }

    // public void setaltura(double estatura){
    //     this.estatura=estatura;
    // }
    // public double estatura(){
    //     return estatura;
    // }

    // public void saludar(){
    //     System.out.println("Hola a todos mi nombre es "+nombre);
    //     System.out.println("Tengo "+edad+" años");
    //     System.out.println("Mido "+estatura+" metros");

    // }
    // public static void main(String[] args) {
    //     Persona p1=new Persona();
    //     Persona p2=new Persona();
    //     Persona p3=new Persona();
    //     Persona p4= new Persona("Antoñillo", (byte)30, 1.65);
        

    //     p1.setNombre("Pepa");
    //     p2.setNombre("Paco");
    //     p3.setNombre("Miguel");

    //     p1.edad=(18);
    //     p2.edad=(51);
    //     p3.edad=(27);

    //     p1.setaltura(1.87);
    //     p2.setaltura(1.68);
    //     p3.setaltura(1.79);

    //     p1.saludar();
    //     p2.saludar();
    //     p3.saludar();
    //     p4.saludar();

        String nombre;
        LocalDate fechaNacimiento;
        double estatura;
        final String DNI;
        static int hijos;
        Persona pareja;

        public Persona(String DNI,String fecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt);
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
        }

        public void obtenerEdad(){
            Period periodo = Period.between(fechaNacimiento, LocalDate.now());
            System.out.println("Tienes "+periodo.getYears()+" años");
        }

        public void asignaPareja(Persona p){
            //Hace referencia a la existente
            this.pareja=p;
        }

        public static void main (String[] args) {
        Persona p=new Persona("12345678A","15/08/1985");
        p.obtenerEdad();
        System.out.println("Tienes "+p.hijos+" hijos");
        Persona p2=new Persona("12345678B","01/07/1987");
        p.hijos=3;
        System.out.println("Tienes "+p2.hijos+" hijos");  
    }
}


