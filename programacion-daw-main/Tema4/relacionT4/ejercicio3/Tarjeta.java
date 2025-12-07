package Tema4.relacionT4.ejercicio3;

public class Tarjeta {
    private String numero;
    private String fechaVenc;

    public Tarjeta(String numero, String fechaVenc) {
        this.numero = numero;
        this.fechaVenc = fechaVenc;
    }

    public void mostrarInfo() {
        System.out.println("Tarjeta nº " + numero + " vence en " + fechaVenc);
    }
}

