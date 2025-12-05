package ActividadFerroviariaT4;

public class Tren {
    Locomotora locomotora=null;
    Vagon []  vagones;
    Maquinista maquinista = null;

    public Tren (){

    }

    

    public Tren(Locomotora locomotora, Vagon[] vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
    }



    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public void imprimeTren() {
        if (locomotora!= null && vagones!=null && maquinista!= null) {
            System.out.println(locomotora);
            System.out.println(vagones);

        } else System.out.println("No hay naica");
        
    }

    


}
