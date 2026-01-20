package Tema5.Proyecto;

public class moto extends vehiculo {
    protected boolean limitador;

    public moto (String matricula, String marca, String modelo, String identificacion, boolean limitador){
        super(matricula, marca, modelo, identificacion);
        this.limitador = limitador;

    }

    public boolean getLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    @Override
    public String toString() {
        return "moto [limitador=" + limitador + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
                + ", identificador=" + identificador + "]";
    }

    
    
}
