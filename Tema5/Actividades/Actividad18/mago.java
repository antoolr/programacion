package Tema5.Actividades.Actividad18;

public class mago extends personaje {

    public mago(String nombre) {
        super(nombre, 80); // el mago tiene menos vida
    }

    @Override
    public int atacar() {
        // El mago usa hechizos → daño variable pero alto
        return (int)(Math.random() * 25 + 5); // daño entre 5 y 30
    }
}

