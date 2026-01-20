package Tema5.Proyecto;

public class coche extends vehiculo {
    protected int altura;
    protected int anchura;

    public coche(String matricula, String marca, String modelo, String identificacion, int altura, int anchura){
        super(matricula, marca, modelo, identificacion);
        this.altura = altura;
        this.anchura = anchura;
        this.identificador = identificacion;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getAnchura() {
        return anchura;
    }
    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "coche [altura=" + altura + ", matricula=" + matricula + ", anchura=" + anchura + ", marca=" + marca
                + ", modelo=" + modelo + ", identificador=" + identificador + "]";
    }

    
    
}
