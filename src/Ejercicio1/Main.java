package Ejercicio1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cont = 0;
        Scanner t  = new Scanner(System.in);
        Producto[] productos = new Producto[2];


        System.out.println("Venta de productos");
        System.out.println("---STOCK DE PRODUCTOS---");
        do {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = t.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = t.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int stock = t.nextInt();

            productos[cont] = new Producto();
            productos[cont].setName(nombre);
            productos[cont].setPrecio(precio);
            productos[cont].setStock(stock);
            t.nextLine();
            cont++;
        }while(cont<productos.length);
        String salida;
        int lista;
        System.out.println("VENTA DE PRODUCTOS");
        do {

            System.out.println("Ingrese el numero del producto vendido (1-10)");
            lista = t.nextInt()-1;
            System.out.println("Ingrese la cantidad de productos vendidos");
            int cantidad = t.nextInt();
            t.nextLine();

            System.out.println("=============================================");
            System.out.println("Valor venta: "+productos[lista].vender(cantidad));
            System.out.println("Stock del producto: "+productos[lista].getStock());
            System.out.println("Desea ingresar la venta de otro producto (S/N)");
            salida = t.nextLine();

        }while (salida.equalsIgnoreCase("s"));




    }
}