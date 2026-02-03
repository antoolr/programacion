package Tema5.Actividades.Actividad18;

public class ogro extends personaje {
    public ogro(String nombre) {
        super(nombre, 120);
    }

    @Override
    public int atacar() {
        return (int)(Math.random() * 20 + 10); // daño entre 10 y 30
    }
}


