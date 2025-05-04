package Ejercicio2;

public class CalculadoraBasica implements Calculable {
    private final double a;
    private final double b;


    public CalculadoraBasica(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double sumar() {
        return a + b;
    }

    @Override
    public double restar() {
        return a - b;
    }

    @Override
    public double multiplicar() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}