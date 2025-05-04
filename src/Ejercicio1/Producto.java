package Ejercicio1;

public class Producto {
    private String name;
    private double precio;
    private int stock;

    public double vender(int cantidad){
        stock-=cantidad;
        return cantidad * precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
