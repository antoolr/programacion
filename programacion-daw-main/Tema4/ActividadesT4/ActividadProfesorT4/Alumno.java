package ActividadProfesorT4;

public class Alumno {
    String nombre, apellidos, fecha_nacimiento;
    int expediente;
    Alumno alumnodelegado;


    public Alumno (){

    }

    public Alumno(String nombre, String apellidos, String fecha_nacimiento, int expediente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.expediente = expediente;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAlumnodelegado(Alumno alumnodelegado) {
        this.alumnodelegado = alumnodelegado;
    }

    public String getApellidos() {
        return apellidos;
    }
    public int getExpediente() {
        return expediente;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public Alumno getAlumnodelegado() {
        return alumnodelegado;
    }

    @Override
    public String toString() {
        if(alumnodelegado!=null)
        return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
                + ", expediente=" + expediente + "] "+alumnodelegado.toString();
        else return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
                + ", expediente=" + expediente + "]";
    }

    

    
}
