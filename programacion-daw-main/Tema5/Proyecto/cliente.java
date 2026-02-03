package Tema5.Proyecto;

public class cliente extends persona {
    protected String numero;

    public cliente(String DNI, String nombre, String pape, String numero) {
        super(DNI, nombre, pape);
        this.numero = numero;
        this.identificador=identificador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setIdentificador(String identificador) {
        this.identificador = "cliente";
    }
}
