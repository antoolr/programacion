package ActividadesT4.src;

public class Categoria {
    private String nombre;
    private int codigo;

    public Categoria(){

    }

    public Categoria(String nombre, int codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void imprimeCategoria(){
       System.out.println("La categoria es "+nombre+"y su codigo es "+codigo); 
    }
    
}
