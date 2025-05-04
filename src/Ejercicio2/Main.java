package Ejercicio2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese un numero A");
        double a = t.nextDouble();
        System.out.println("Ingrese un numero B");
        double b = t.nextDouble();

        CalculadoraBasica resultado = new CalculadoraBasica(a, b);

        System.out.println("RESULTADO");
        System.out.printf("Suma: %.0f\n", resultado.sumar());
        System.out.printf("Resta: %.0f\n", resultado.restar());
        System.out.printf("Multiplicacion: %.0f\n", resultado.multiplicar());
        System.out.printf("Division: %.2f", resultado.dividir());


    }
}
