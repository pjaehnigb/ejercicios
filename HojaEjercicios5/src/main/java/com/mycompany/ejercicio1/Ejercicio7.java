package com.mycompany.ejercicio1;

import java.util.ArrayList;

class ItemCarrito {

    String producto;
    int cantidad;
    double precioUnitario;

    public ItemCarrito(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
}

class CarritoCompras {

    private ArrayList<ItemCarrito> items;

    public CarritoCompras() {
        items = new ArrayList<>();
    }

    public void agregarItem(String producto, int cantidad, double precioUnitario) {

        for (ItemCarrito item : items) {

            if (item.producto.equalsIgnoreCase(producto)) {
                item.cantidad += cantidad;
                return;
            }
        }

        items.add(new ItemCarrito(producto, cantidad, precioUnitario));
    }

    public void eliminarItem(String producto) {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).producto.equalsIgnoreCase(producto)) {
                items.remove(i);
                return;
            }
        }
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void mostrarCarrito() {

        System.out.println("CARRITO DE COMPRAS:");

        for (ItemCarrito item : items) {

            System.out.println(
                    "Producto: " + item.producto
                    + " | Cantidad: " + item.cantidad
                    + " | Precio: Q" + item.precioUnitario
                    + " | Subtotal: Q" + item.calcularSubtotal()
            );
        }

        System.out.println("TOTAL: Q" + calcularTotal());
    }
}

public class Ejercicio7 {

    public static void main(String[] args) {

        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem("Teclado", 1, 150);
        carrito.agregarItem("Mouse", 2, 75);

        // Se agrega nuevamente el teclado
        carrito.agregarItem("Teclado", 2, 150);

        carrito.mostrarCarrito();

        System.out.println("\nEliminando Mouse...");

        carrito.eliminarItem("Mouse");

        carrito.mostrarCarrito();

        System.out.println("\nVaciando carrito...");

        carrito.vaciarCarrito();

        carrito.mostrarCarrito();
    }
}