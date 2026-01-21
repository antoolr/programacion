package REjerciciosT5.Actividad7y8;

abstract class vehiculo {
    protected String marca;

    public vehiculo(String marca){
        this.marca = marca;
    }
    abstract String arrancar();

    public String frenar(){
        return "El coche " + marca + " esta frenando";
    }
}
