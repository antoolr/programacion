package Tema4.ActividadesT4.ActividadCartasT4;

public class carta {
    int valor;
    String palo;

    public carta(){

    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }
    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "carta [valor=" + valor + ", palo=" + palo + "]";
    }

    
}
