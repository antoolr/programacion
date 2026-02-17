package Tema6.src.actividades.TareaDomin.Modelo;

public class alumno {
    private int id;
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String grupo;

    public alumno(int id, String DNI, String nombre, String ape1, String ape2, String grupo) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = ape1;
        this.apellido2 = ape2;
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}

