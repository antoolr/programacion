package Tema5.Actividades.Actividad17;

public abstract class vehiculo {
    protected String matricula;

    public vehiculo(){}
    public vehiculo(String matricula){
        this.matricula=matricula;
    }
    

    public static void main(String[] args) {
        
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void mostrarInfo(){
        System.out.println("Matricula: "+matricula);
    }
    public abstract int velocidadMaxima();
}
