package Tema5.Proyecto;

public class propietario extends persona {
    protected String direccion;

    public propietario(String DNI, String nombre, String pape, String direccion){
        super(DNI, nombre, pape);
        this.direccion = direccion;
        this.DNI=DNI;
        this.nombre=nombre;
        this.pape=pape;
        this.identificador="propietario";
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
