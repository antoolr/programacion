package ActividadFerroviariaT4;

public class Locomotora {
    String matricula, potencia, Mecanico;
    int año_fabricacion;

    public Locomotora (){

    }

    public Locomotora(String matricula, String potencia, String mecanico_implicado, int año_fabricacion) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.Mecanico = Mecanico;
        this.año_fabricacion = año_fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMecanico_implicado() {
        return Mecanico;
    }

    public void setMecanico(String mecanico) {
        this.Mecanico = mecanico;
    }

    public int getAño_fabricacion() {
        return año_fabricacion;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    @Override
    public String toString() {
        
        return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", mecanico_implicado="
                + Mecanico + ", año_fabricacion=" + año_fabricacion + "]";
    }

    
}
