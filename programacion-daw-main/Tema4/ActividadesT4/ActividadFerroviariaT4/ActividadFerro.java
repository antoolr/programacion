package ActividadFerroviariaT4;

import ActividadFerroviariaT4.Especialidad;

public class ActividadFerro {
        public static void main(String[] args) {
            
        
    Maquinista maquinista = new Maquinista("Alvarete", "Jefe", "48576362", 1800);
    Maquinista maquinista2 = new Maquinista("Pedrito", "Mozo", "12345678", 1200);

    Mecanico mecanico1 = new Mecanico("Nicolas", "48596710", Especialidad.frenos, 637291045);
    Mecanico mecanico2 = new Mecanico("Maria", "58697801", Especialidad.hidraulica, 681021934);

    Vagon[] vagon1 = new Vagon[3];

    Locomotora locomotora1 = new Locomotora("1234 FSD", "3000 CV", "", 2007);
    Locomotora locomotora2 = new Locomotora("2098 ABC", "4050 CV", "", 1999);

    locomotora2.setMecanico("Nicolas");
    locomotora1.setMecanico("Maria");

    for (int i=0; i<vagon1.length;i++){
        vagon1[i] = new Vagon(10*150*i, 1500+i*20, 20, "madera"); //Completado con lo que haya de BD
    }

    Vagon[] vagones = new Vagon[3];
    Tren tren1 = new Tren();
    tren1.setLocomotora(locomotora2);
    tren1.setVagones(vagon1);
    tren1.setMaquinista(maquinista2);

    tren1.imprimeTren();
}
}


