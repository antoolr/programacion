package Tema6.src.actividades.ActividadMVC1.Modelo;

public class curso {
    private int id; 
    private String ano_inicio, ano_fin;

    
    public curso(int id, String ano_inicio, String ano_fin) {
        this.id = id;
        this.ano_inicio = ano_inicio;
        this.ano_fin = ano_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAno_inicio() {
        return ano_inicio;
    }

    public void setAno_inicio(String ano_inicio) {
        this.ano_inicio = ano_inicio;
    }

    public String getAno_fin() {
        return ano_fin;
    }

    public void setAno_fin(String ano_fin) {
        this.ano_fin = ano_fin;
    }

    
}
