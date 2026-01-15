package Tema5.Actividad15;

public class gato {
    private String pedigri;

    public gato(){}
    public gato(String pedigri){
        this.pedigri=pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public String toString() {
        return "gato [pedigri=" + pedigri + "]";
    }

    
}
