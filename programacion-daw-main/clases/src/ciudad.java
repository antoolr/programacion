package clases.src;

public class ciudad {
    int codigo;
    String nombre;
    int indicativo;

    public ciudad(){}
    public ciudad(int codigo, String nombre, int indicativo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.indicativo=indicativo;
}

public void mostrarCiudad() {
    System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Indicativo: " + indicativo);
}

public void cambiarNombre(String nuevoNombre) {
    this.nombre = nuevoNombre;
}

public void cambiarIndicativo(int nuevoIndicativo) {
    this.indicativo = nuevoIndicativo;
}

}
