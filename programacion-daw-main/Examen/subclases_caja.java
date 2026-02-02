package Examen;

public class subclases_caja {
    public class Animal {
    public void hablar() {
        System.out.println("Soy un animal");
    }
}

public class Perro extends Animal {
    @Override
    public void hablar() {
        System.out.println("Guau");
    }
}

public class Gato extends Animal {
    @Override
    public void hablar() {
        System.out.println("Miau");
    }
}

}
