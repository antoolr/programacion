package Tema5.Actividades.Actividad16;

public class actividad16 {
    public static void main(String[] args) {
        productofisico p1 = new productofisico(2, "auriculares", 29.99, 1.75, 4.0);
        productodigital p2 = new productodigital(3, "suscripcion netflix", 9.99, "https:/tontoelquelolea.com", 23.5);

        System.out.println(p1);
        System.out.println(p2);
    }
}
