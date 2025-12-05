package ActividadFerroviariaT4;

public class Maquinista {
    String nombre, rango, DNI;
    int sueldo;

    public Maquinista(){

    }

    public Maquinista(String nombre, String rango, String dNI, int sueldo) {
        this.nombre = nombre;
        this.rango = rango;
        DNI = dNI;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public String getDNI() {
        return DNI;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Maquinista [nombre=" + nombre + ", rango=" + rango + ", DNI=" + DNI + ", sueldo=" + sueldo + "]";
    }

    

}
