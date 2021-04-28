package com.fjcorona.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Streams {

    private List <String> lista;
    private List <String> numeros;

    public Streams() {
        lista = new ArrayList<>();
        lista.add("JavoCrown");
        lista.add("Javo");
        lista.add("Crown");
        lista.add("Francisco");
        lista.add("Javier");
        lista.add("Corona");
        lista.add("Sánchez");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
    }

    public void filtrar() {
        // Filtrar los elementos de la lista que empiezan con "J"
        lista.stream()
                .filter( x -> x.startsWith("J") )
                .forEach(System.out::println);
    }

    public void ordenar() {
        // Si sorted no recibe un consumer, por default ordena de manera ascendente
        lista.stream()
                .sorted()
                .forEach(System.out::println);

        // Ordenamos de manera descendente
        lista.stream()
                .sorted( (x, y) -> y.compareToIgnoreCase(x) )
                .forEach(System.out::println);

    }

    public void transformar() {
        // Convertir a mayúsculas todos los elementos de lista
        // lista.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
        lista.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Convertir los elemntos string de la lista numeros, a formato int y sumarles 1
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limitar() {
        // Limita el número de elementos según se indique
        lista.stream().limit(2).forEach(System.out::println);
        numeros.stream().limit(3).forEach(System.out::println);
    }

    public void contar() {
        System.out.println("Elementos en lista: " + lista.stream().count());
        System.out.println("Elementos en numeros: " + numeros.stream().count());
    }

    public static void main (String[] args) {
        Streams app = new Streams();

        app.filtrar();
        app.ordenar();
        app.transformar();
        app.limitar();
        app.contar();
    }
}
