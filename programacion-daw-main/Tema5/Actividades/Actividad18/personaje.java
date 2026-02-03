package Tema5.Actividades.Actividad18;

public abstract class personaje {
    protected String nombre;
    protected int vida;

    public personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) vida = 0;
    }

    public abstract int atacar();

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return nombre + " (vida: " + vida + ")";
    }
}

