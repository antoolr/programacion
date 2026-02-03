package Tema5.Actividades.Actividad19;

public class actividad19 {
    public static void main(String[] args) {
        cajafiguras<figura> caja = new cajafiguras<>();

        figura circulo1 = new circulo("Círculo 1", 2);
        figura rectangulo1 = new rectangulo("Rectángulo 1", 4, 6);

        caja.guardar(circulo1);
        caja.guardar(rectangulo1);

        caja.mostrarContenido();

        double areaTotal = caja.calcularAreaTotal();
        System.out.println("Área total de las figuras en la caja: " + areaTotal);
    }
}
