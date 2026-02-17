package Tema6.src.actividades.TareaDomin.Modelo;

public class profesor {
    private int id;
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public profesor(int id, String nif, String nombre, String ape1, String ape2) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = ape1;
        this.apellido2 = ape2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnif() {
        return nif;
    }

    public void setnif(String nif) {
        this.nif = nif;
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
    
}

