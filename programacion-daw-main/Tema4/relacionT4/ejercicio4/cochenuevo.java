package Tema4.relacionT4.ejercicio4;

public class cochenuevo {
    private int id;
    private String matricula;

    public cochenuevo(int id, String matricula) {
        this.id = id;
        this.matricula = matricula;
    }

    public void mostrarcNuevo() {
        System.out.println("Coche nuevo: Matrícula " + matricula + " (ID: " + id + ")");
    }
}
