package ActividadRevistaT4;

public class Ejemplar {
    String fecha;
    int num_paginas, num_ejemplares;
    Revista revista=null;

    public Ejemplar(){

    }

    public Ejemplar(String fecha, int num_paginas, int num_ejemplares) {
        this.fecha = fecha;
        this.num_paginas = num_paginas;
        this.num_ejemplares = num_ejemplares;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
    public void setnum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }
    public void setnum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    
    public String getfecha() {
        return fecha;
    }
    public int getnum_ejemplares() {
        return num_ejemplares;
    }
    public int getnum_paginas() {
        return num_paginas;
    }
    public Revista getRevista() {
        return revista;
    }

    @Override
    public String toString() {
        if(revista!=null)
        return "Ejemplar [fecha=" + fecha + ", num_paginas=" + num_paginas + ", num_ejemplares=" + num_ejemplares + "] "+revista.toString();
            else return "Ejemplar [fecha=" + fecha + ", num_paginas=" + num_paginas + ", num_ejemplares=" + num_ejemplares + "] ";
    }

    
}
