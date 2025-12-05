package clases.src;

public class fecha {
    int dia;
    int mes;
    int anyo;

    public fecha(){}
    public fecha(int dia, int mes, int anyo){
        this.dia=dia;
        this.mes=mes;
        this.anyo=anyo;
    }
    public void mostrarFecha() {
    System.out.println(dia + "/" + mes + "/" + anyo);
}

public void cambiarDia(int nuevoDia) {
    this.dia = nuevoDia;
}

public void cambiarMes(int nuevoMes) {
    this.mes = nuevoMes;
}

public void cambiarAnyo(int nuevoAnyo) {
    this.anyo = nuevoAnyo;
}

}
