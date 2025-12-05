package ActividadProfesorT4;

public class ActividadProfesor {
    public static void main(String[] args) {
    Profesor profesor1 = new Profesor("Pedri", "calle", "674598123", "12345678");
    Profesor profesor2 = new Profesor("Domin", "avenida", "612495782", "78965418");

    Alumno alumno1 = new Alumno("Alvarete", "Orellana", "15/07/2009", 1);
    Alumno alumno2 = new Alumno("Adri", "Carrique", "29/01/2001", 2);
    alumno1.setAlumnodelegado(alumno2);

    Modulo modulo1 = new Modulo(1, "Entornos de desarrollo");
    Modulo modulo2 = new Modulo(2, "Bases de datos");

    Alumno_cursa_Modulo[] cursa = new Alumno_cursa_Modulo[4];
    Alumno_cursa_Modulo cursa1 = new Alumno_cursa_Modulo(alumno1, modulo1);
    Alumno_cursa_Modulo cursa2 = new Alumno_cursa_Modulo(alumno2, modulo2);

    System.out.println(cursa1);
    }
    

    
}
