package Tema6.src.actividades.TareaDomin.Modelo;

public class ExamenTeorico {
    protected int id, numero_preguntas;
    protected String titulo, fecha;

   public ExamenTeorico(int id, int numero_preguntas, String titulo, String fecha) {
        this.id = id;
        this.numero_preguntas = numero_preguntas;
        this.titulo = titulo;
        this.fecha = fecha;
    }

   public int getId() {
    return id;
   }

   public void setId(int id) {
    this.id = id;
   }

   public int getNumero_preguntas() {
    return numero_preguntas;
   }

   public void setNumero_preguntas(int numero_preguntas) {
    this.numero_preguntas = numero_preguntas;
   }

   public String getTitulo() {
    return titulo;
   }

   public void setTitulo(String titulo) {
    this.titulo = titulo;
   }

   public String getFecha() {
    return fecha;
   }

   public void setFecha(String fecha) {
    this.fecha = fecha;
   }

    
}
