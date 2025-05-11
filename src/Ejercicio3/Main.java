package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Perro("Parchis");
        animals[1] = new Gato("Mr");
        animals[2] = new Perro("Max");
        animals[3] = new Gato("Kira");


        for (int i = 0; i < animals.length; i++) {
            animals[i].myName();
            animals[i].hacerSonido();
        }


    }

}
