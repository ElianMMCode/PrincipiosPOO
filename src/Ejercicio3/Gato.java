package Ejercicio3;

public class Gato extends Animal {


    public Gato(String name) {
        super(name);
    }


    public void myName() {
        System.out.printf("Soy el gato %s%n", name);
    }

    public void hacerSonido() {
        System.out.println("Miau");
    }


}
