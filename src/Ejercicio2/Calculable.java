package Ejercicio2;

public interface Calculable {

    double sumar();

    double restar();

    double multiplicar();

    double getA();

    double getB();

    default double dividir() {
        if (getB() == 0) {
            return 0; // si el divisor es 0 dara como resultado cero
        }
        return getA() / getB();
    }
}
