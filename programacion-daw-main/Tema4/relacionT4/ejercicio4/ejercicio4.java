package Tema4.relacionT4.ejercicio4;

import Tema4.relacionT4.ejercicio3.Cliente;

public class ejercicio4 {
    public static void main(String[] args) {
        marca marca1 = new marca(1, "SEAT");
        modelo modelo1 = new modelo(1, "Ibiza");
        version version1 = new version(1, "Style", 95, 16000, "Gasolina");
        extra extra1 = new extra(1, "Bluetooth", "Conectividad manos libres");

        cochenuevo cocheNuevo1 = new cochenuevo(1, "1234ABC");
        cocheusado cocheUsado1 = new cocheusado(2, "5678DEF", 8500, "Ibiza 2018");

        cliente cliente1 = new cliente(1, "Antonio", "Lozano", "Martínez", "Calle Mayor 12", "600123456");
        vendedor vendedor1 = new vendedor(1, "Juan", "Pérez", "Gómez", "Av. Andalucía 5", "699987654");

        // Mostrar todo
        marca1.mostrarMarca();
        modelo1.mostrarModelo();
        version1.mostrarVersion();
        extra1.mostrarExtra();
        cocheNuevo1.mostrarcNuevo();
        cocheUsado1.mostrarcUsado();
        cliente1.mostrarCliente();
        vendedor1.mostrarVendedor();
    }
}
