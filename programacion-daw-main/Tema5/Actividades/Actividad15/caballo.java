package Tema5.Actividad15;

public class caballo {
    protected String comida;
    protected int ejercicio;

    public caballo(){}
    public caballo (String comida, int ejercicio) {
        this.comida = comida;
        this.ejercicio = ejercicio;

    
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }
    @Override
    public String toString() {
        return "caballo [comida=" + comida + ", ejercicio=" + ejercicio + "]";
    }
    
}
