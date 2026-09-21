package com.mycompany.ejercicio1;

import java.util.ArrayList;

public class Ejercicio9 {

    public static ArrayList<Integer> combinarListas(
            ArrayList<Integer> lista1,
            ArrayList<Integer> lista2) {

        ArrayList<Integer> resultado = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < lista1.size() && j < lista2.size()) {

            if (lista1.get(i) <= lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(7);
        lista1.add(10);

        lista2.add(2);
        lista2.add(3);
        lista2.add(8);
        lista2.add(12);

        ArrayList<Integer> resultado = combinarListas(lista1, lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista combinada: " + resultado);
    }
}