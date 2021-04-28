package com.fjcorona.java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Streams {

    private List <String> list;
    private List <String> numbers;

    public Streams() {
        list = new ArrayList<>();
        list.add("JavoCrown");
        list.add("Javo");
        list.add("Crown");
        list.add("Francisco");
        list.add("Javier");
        list.add("Corona");
        list.add("Sánchez");

        numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
    }

    public void filter() {
        // Filtrar los elementos de la lista que empiezan con "J"
        list.stream()
                .filter( x -> x.startsWith("J") )
                .forEach(System.out::println);
    }

    public void sort() {
        // Si sorted no recibe un consumer, por default ordena de manera ascendente
        list.stream()
                .sorted()
                .forEach(System.out::println);

        // Ordenamos de manera descendente
        list.stream()
                .sorted( (x, y) -> y.compareToIgnoreCase(x) )
                .forEach(System.out::println);

    }

    public void transform() {
        // Convertir a mayúsculas todos los elementos de lista
        // list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Convertir los elemntos string de la lista numbers, a formato int y sumarles 1
        numbers.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limit() {
        // Limita el número de elementos según se indique
        list.stream().limit(2).forEach(System.out::println);
        numbers.stream().limit(3).forEach(System.out::println);
    }

    public void count() {
        System.out.println("Elementos en lista: " + list.stream().count());
        System.out.println("Elementos en numbers: " + numbers.stream().count());
    }

    public static void main (String[] args) {
        Streams app = new Streams();

        app.filter();
        app.sort();
        app.transform();
        app.limit();
        app.count();
    }
}
