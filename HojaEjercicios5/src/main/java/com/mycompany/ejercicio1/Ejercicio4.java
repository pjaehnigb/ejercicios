package com.mycompany.ejercicio1;

import java.util.ArrayList;

class HistorialNavegacion {

    private ArrayList<String> historial;

    public HistorialNavegacion() {
        historial = new ArrayList<>();
    }

    public void visitarPagina(String url) {

        historial.add(url);

        if (historial.size() > 10) {
            historial.remove(0);
        }
    }

    public void mostrarHistorial() {

        System.out.println("HISTORIAL DE NAVEGACION:");

        for (String url : historial) {
            System.out.println(url);
        }
    }
}

public class Ejercicio4 {

    public static void main(String[] args) {

        HistorialNavegacion historial = new HistorialNavegacion();

        historial.visitarPagina("google.com");
        historial.visitarPagina("youtube.com");
        historial.visitarPagina("github.com");
        historial.visitarPagina("facebook.com");
        historial.visitarPagina("instagram.com");
        historial.visitarPagina("wikipedia.org");
        historial.visitarPagina("stackoverflow.com");
        historial.visitarPagina("oracle.com");
        historial.visitarPagina("netbeans.apache.org");
        historial.visitarPagina("java.com");
        historial.visitarPagina("github.com/usuarios");

        historial.mostrarHistorial();
    }
}
