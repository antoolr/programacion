package ActividadesT4.src;

public class Pieza {
    private String nombre;
    private String color;
    private double precio;
    private int codigo;
    private int codigo_categoria;

    public Pieza(){

    }

    public Pieza(String nombre, String color, double precio, int codigo){
        this.nombre=nombre;
        this.color=color;
        this.precio=precio;
        this.codigo=codigo;
    }

    //Metodos
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getColor() {
        return color;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    public void imprimePieza(){
       System.out.println("La pieza es "+nombre+" es de color "+color+ "su precio es "+precio+ "y su codigo es "+codigo+ "y pertenece a la categoria"+codigo_categoria); 
    }
}
