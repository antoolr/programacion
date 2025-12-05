package clases.src;

public class libro {
    //Ahtributos 
    private String isbn;
    String titulo;
    int anyo;
    double precio;
    private editorial editorial1;

    public void editorial(){}
    public void editorial(int codigo, String nombre, int anyo2){
        this.codigo=codigo;
        this.nombre=nombre;
        this.anyo2=anyo2;
    }
    int codigo;
    String nombre;
    int anyo2;
    
    //Constructores
    

    public libro(){}
    public libro(String isbn, String titulo, int anyo, double precio){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anyo=anyo;
        this.precio=precio;
    }

    
    //Metodos get y set
    public void setISBN(String isbn){
        this.isbn=isbn;
    }
    public String getISBN(){
        return this.isbn;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAnyo(int anyo){
        this.anyo=anyo;
    }
    public int getAnyo(){
        return this.anyo;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }

   

    public void setcodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return this.nombre;
    }

    public void setanyo2(int anyo2){
        this.anyo2=anyo2;
    }
    public int getanyo2(){
        return this.anyo2;
    }

    public void setEditorial(editorial ed){
        this.editorial1=ed;
        this.editorial1=new editorial();
        editorial1.setanyo2(ed.getanyo2());
        editorial1.setnombre(ed.getnombre());
        editorial1.setcodigo(ed.getCodigo());
    }


    public void imprimeEditorial(){
        System.out.println("ISBN del libro: "+this.isbn);
        System.out.println("Nombre de la editorial "+this.nombre);
        System.out.println("Año del libro: "+this.anyo2);
        System.out.println("Precio del libro: "+this.precio);
    }
}
