package Ejercicio3;

public class Perro extends Animal {


    public Perro(String name) {
        super(name);
    }

    @Override
    public void myName() {
        System.out.printf("Soy el perro %s%n", name);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!!!!");
    }
}


