package Examen.herencia;

public class main extends personaje implements ipresentable {
    public static void main(String[] args) {

        heroe h1 = new heroe("Superman", 48, 59);
        heroe h2 = new heroe("Batman", 38, 24);
        heroe h3 = new heroe("Luciernaga", 58, 78);
        villano v1 = new villano("Coco", 39, 30);
        villano v2 = new villano("Murcielago", 30, 50);
        villano v3 = new villano("Lanzarocas", 59, 60);
        //Declarar un array de la interfaz
        ipresentable[] heroes = new ipresentable[6];
        heroes [0] = h1;
        heroes [1] = h2;
        heroes [2] = h3;
        heroes [3] = v1;
        heroes [4] = v2;
        heroes [5] = v3;

        //Recorrer array
        for(int i = 0; i<heroes.length; i++){
           heroes[i].presentarse();
        }
        

        

        }

    @Override
    public void presentarse() {
        
    }
}
