public class Vehiculo {
    //Datos miembro de la clase
    boolean usedFlag;
    String model;
    int numTires;

    //Constructor
    public Vehiculo(boolean useF, String modelo, int numT){    
        usedFlag=useF;
        model=modelo;
        numTires=numT;
    }

    //Metodos de la clase
    public void Start(){
        System.out.println("Comenzar a moverse");
    }
    public void turnLeft(){
        System.out.println("Moverse a la izquierda");
    }
    public void turnRight(){
        System.out.println("Moverse a la derecha");
    }
    public void stop(){
        System.out.println("Parar de moverse");
    }
    public void forward(int speed){
        System.out.println("Moverse hacia delante a una velocidad"+speed);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de vehiculo y objeto");
        //Objetos de la clase vehiculo
        Vehiculo moto = new Vehiculo (false,"Honda",2);
        Vehiculo coche = new Vehiculo(true,"Toyota",4);
        //Usando los objetos
        moto.Start();
        moto.turnLeft();
        moto.forward(120);
        moto.stop();

        coche.Start();
        coche.turnRight();
        coche.forward(120);

        coche.forward(20);

        

    }
}
