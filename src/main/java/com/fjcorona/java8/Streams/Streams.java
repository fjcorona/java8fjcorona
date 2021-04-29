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
        // Filter those list elements which first letter is "J"
        list.stream()
                .filter( x -> x.startsWith("J") )
                .forEach(System.out::println);
    }

    public void sort() {
        // If not consumer is gotten by "sorted", it sorts ascending by default.
        list.stream()
                .sorted()
                .forEach(System.out::println);

        // Descending sort.
        list.stream()
                .sorted( (x, y) -> y.compareToIgnoreCase(x) )
                .forEach(System.out::println);

    }

    public void transform() {
        // Change to upper case all list elements.
        // list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Change into integer, all string elements from "numbers" list and add 1 to each one.
        numbers.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limit() {
        // Limit the quantity of elements as the parameter indicates.
        list.stream().limit(2).forEach(System.out::println);
        numbers.stream().limit(3).forEach(System.out::println);
    }

    public void count() {
        System.out.println("Elements in list: " + list.stream().count());
        System.out.println("Elements in numbers: " + numbers.stream().count());
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
