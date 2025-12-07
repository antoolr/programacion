package Tema4.relacionT4.ejercicio3;

public class ejercicio3 {
     public static void main(String[] args) {
        // Crear tarjeta y cliente
        Tarjeta tarjeta1 = new Tarjeta("1234-5678", "12/2026");
        Cliente cliente1 = new Cliente("11111111A", "Antonio", tarjeta1);

        Producto producto1 = new Producto("P01", "Teclado", 29.99);
        Fabrica fabrica1 = new Fabrica("Razer", "EEUU");

        Empleado empleado1 = new Empleado("Juan Pérez", "E001");
        Sucursal sucursal1 = new Sucursal("S01", "Almería");

        // Mostrar relaciones
        cliente1.mostrarInfo();
        producto1.mostrarInfo();
        fabrica1.mostrarInfo();
        empleado1.mostrarInfo();
        sucursal1.mostrarInfo();
    }
}
