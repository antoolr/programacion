package Tema5.Proyecto;

public class persona implements identificacion {
    protected String DNI;
    protected String nombre;
    protected String pape;
    protected String identificador;

    public persona(String DNI, String nombre, String pape) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.pape = pape;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPape() {
        return pape;
    }
    public void setPape(String pape) {
        this.pape = pape;
    }


    public String getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    
}
