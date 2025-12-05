package ActividadProfesorT4;

public class Alumno_cursa_Modulo {
    Alumno alumno=null;
    Modulo modulo=null;

    public Alumno_cursa_Modulo(){

    }

    public Alumno_cursa_Modulo(Alumno alumno, Modulo modulo) {
        this.alumno = alumno;
        this.modulo = modulo;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    public Modulo getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        if(alumno!=null && modulo!=null)
        return "Alumno_cursa_Modulo [alumno=" + alumno.toString() + ", modulo=" + modulo.toString() + "]";
        else return "No hay datos ni de modulo ni de alumno";
    }

    
}
