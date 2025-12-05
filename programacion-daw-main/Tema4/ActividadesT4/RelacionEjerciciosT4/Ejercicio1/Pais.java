package RelacionEjerciciosT4.Ejercicio1;

public class Pais {
    String nombre;
    int poblacion;
    double PIB;

    public Pais(){

    }

    

    public Pais(String nombre, int poblacion, double pIB) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        PIB = PIB;
    }



    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getPIB() {
        return PIB;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setPIB(double pIB) {
        PIB = pIB;
    }

    public void calcularPIB(){
        PIB = (PIB*100000) / poblacion;
        
    }

    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", poblacion=" + poblacion + ", PIB=" + PIB + "]";
    }

    
    
}
