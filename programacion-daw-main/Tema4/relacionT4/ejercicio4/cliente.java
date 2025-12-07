package Tema4.relacionT4.ejercicio4;

public class cliente {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;

    public cliente(int id, String nombre, String apellido1, String apellido2, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " " + apellido1 + " " + apellido2 +
                           " Dirección: " + direccion + " Tel: " + telefono + " (ID: " + id + ")");
    }
}
