package Tema4.relacionT4.ejercicio3;

public class Sucursal {
    private String codigo;
    private String ciudad;

    public Sucursal(String codigo, String ciudad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
    }

    public void mostrarInfo() {
        System.out.println("Sucursal: " + codigo + " en " + ciudad);
    }
}

