package Tema5.Proyecto;

public class vehiculo implements identificacion {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String identificador;

    public vehiculo(String matricula, String marca, String modelo, String identificador){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.identificador = identificador;
        
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String getIdentificador() {
        return identificador;
    }
    @Override
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    

    
}
