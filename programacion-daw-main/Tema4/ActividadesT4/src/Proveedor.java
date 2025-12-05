package ActividadesT4.src;

public class Proveedor {
    private String domicilio;
    private String ciudad;
    private String provincia;
    private int codigo;

    
    //Actividad 3

    //Constructor
    public Proveedor(){

    }
    
    public Proveedor(String domicilio, String ciudad, String provincia, int codigo){
        this.domicilio=domicilio;
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.codigo=codigo;
    }

    //Metodos
    public String getCiudad() {
        return ciudad;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getProvincia() {
        return provincia;
    }

    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

     public void imprimeProveedor(){
       System.out.println("El codigo del proveedor es "+codigo+" su ciudad de residencia es "+ciudad+ "de "+provincia+ "y su domicilio es "+domicilio); 
    }
    
    }

