package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

class Factura {

    int idFactura;
    String cliente;
    double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }
}

public class Ejercicio8 {

    public static HashMap<String, Double> generarResumen(ArrayList<Factura> facturas) {

        HashMap<String, Double> resumen = new HashMap<>();

        for (Factura factura : facturas) {

            if (resumen.containsKey(factura.cliente)) {

                double totalActual = resumen.get(factura.cliente);
                resumen.put(factura.cliente, totalActual + factura.monto);

            } else {

                resumen.put(factura.cliente, factura.monto);
            }
        }

        return resumen;
    }

    public static void main(String[] args) {

        ArrayList<Factura> facturas = new ArrayList<>();

        facturas.add(new Factura(1, "Ana", 1500));
        facturas.add(new Factura(2, "Carlos", 2500));
        facturas.add(new Factura(3, "Ana", 1000));
        facturas.add(new Factura(4, "Maria", 3000));
        facturas.add(new Factura(5, "Carlos", 1500));

        HashMap<String, Double> resumen = generarResumen(facturas);

        System.out.println("RESUMEN DE FACTURAS POR CLIENTE:");

        for (String cliente : resumen.keySet()) {

            System.out.println(
                    "Cliente: " + cliente
                    + " | Total facturado: Q" + resumen.get(cliente)
            );
        }
    }
}