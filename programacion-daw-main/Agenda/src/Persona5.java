public class Persona5 {
    private String nombre;
    private String domicilio;
    private String telefono;

    //Constructor
    public Persona5(){

    }
    public Persona5(String nombre, String domicilio, String telefono){
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.telefono=telefono;

    }

    //Metodos
    public String getDomicilio() {
        return domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void imprimePersona(){
        System.out.println("Se llama "+nombre+" vive en " +domicilio+ " y su telefono es "+telefono);
    }
}
