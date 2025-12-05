package Tema4.ActividadesT4.JuegoT4;

public class personaje {
    public static final personaje Caballero = null;
    String nombre;
    int vida, daño, defensa;
    Tipo tipo;
    
    public personaje (Tipo tipo){
        this.tipo = tipo;
    }

    public Tipo gettipo (){
        return tipo;
    }
    public void settipo (Tipo tipo){
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void Atacar (personaje enemigo){
        int atacar = this.daño - enemigo.defensa;
        if (atacar < 0) atacar = 0; // Mínimo 0 de daño
        enemigo.vida -= atacar;
    }

    public void Defender (int daño){
        int recibir = daño - this.defensa;
        if (recibir < 0) recibir = 0; // Mínimo 0 de daño recibido
        this.vida -= recibir;
    }

    public void estarVivo (){
        if (this.vida == 0){
            System.out.println(this.nombre + " ha muerto.");
        } else {
            System.out.println(this.nombre + " sigue vivo con " + this.vida + " puntos de vida.");
        }
    }

    @Override
    public String toString() {
        return "personaje [nombre=" + nombre + ", vida=" + vida + ", daño=" + daño + ", defensa=" + defensa + ", tipo="
                + tipo + "]";
    }

    

    
}
