package com.mycompany.ejercicio1;

import java.util.ArrayList;

class Producto {

    int id;
    String nombre;
    double precio;
    int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("----------------------");
    }
}

public class Ejercicio1 {

    public static void aumentarPrecios(
            ArrayList<Producto> productos,
            double porcentaje) {

        for (Producto producto : productos) {

            if (producto.stock < 10) {
                producto.precio = producto.precio
                        + (producto.precio * porcentaje / 100);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Teclado", 150, 5));
        productos.add(new Producto(2, "Mouse", 75, 15));
        productos.add(new Producto(3, "Monitor", 1200, 7));
        productos.add(new Producto(4, "Audifonos", 200, 20));

        System.out.println("PRECIOS ANTES DEL AUMENTO:");

        for (Producto producto : productos) {
            producto.mostrarProducto();
        }

        aumentarPrecios(productos, 10);

        System.out.println("PRECIOS DESPUES DEL AUMENTO:");

        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }
}