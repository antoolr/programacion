package Examen.herencia2;

abstract class  maquina {
    protected String nombre;

    public maquina(){}
    public maquina(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract void encender();

    public void apagar(){
        System.out.println(nombre+ " se esta apagando");
    }
}
