
package Tema5.Actividades.Actividad18;

public class caballero extends personaje {

    public caballero(String nombre) {
        super(nombre, 110); // vida base del caballero
    }

    @Override
    public int atacar() {
        // El caballero usa espada → daño medio-alto
        return (int)(Math.random() * 15 + 15); // daño entre 15 y 30
    }
}

