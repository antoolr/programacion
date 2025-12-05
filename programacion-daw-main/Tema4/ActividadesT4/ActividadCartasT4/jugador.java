package Tema4.ActividadesT4.ActividadCartasT4;

public class jugador {
    String nombre;
    int puntuacion;

    public jugador(){

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
    }

    
}
