package Tema5.Actividades.Actividad19;

// CajaFiguras.java
import java.util.ArrayList;
import java.util.List;

public class cajafiguras<T extends figura> {
    private List<T> figuras;

    public cajafiguras() {
        this.figuras = new ArrayList<>();
    }

    public void guardar(T figura) {
        figuras.add(figura);
    }

    public void mostrarContenido() {
        if (figuras.isEmpty()) {
            System.out.println("La caja está vacía.");
        } else {
            for (T f : figuras) {
                System.out.println(f);
            }
        }
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (T f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }
}

