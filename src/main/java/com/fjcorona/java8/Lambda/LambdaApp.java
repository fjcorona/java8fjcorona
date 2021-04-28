package com.fjcorona.java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

    public void sortJ7 () {
        List<String> list = new ArrayList<>();
        list.add("JavoCrown");
        list.add("Javo");
        list.add("Crown");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String element : list) {
            System.out.println(element);
        }
    }

    public void computeJ7 () {
        Operation operation = new Operation() {
            @Override
            public double computeAverage(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };

        System.out.println(operation.computeAverage(2,3) );
    }

    public void computeJ8() {
        // Operation operation = (double x, double y) -> {return (x + y) / 2;};
        // Operation operation = (double x, double y) -> (x + y) / 2;
        Operation operation = (x, y) -> (x + y) / 2;
        System.out.println(operation.computeAverage(3,5));
    }

    public void sortJ8() {
        List<String> list = new ArrayList<>();
        list.add("JavoCrown");
        list.add("Javo");
        list.add("Crown");

        // Collections.sort(list, (String o1, String o2) -> o1.compareTo(o2) );
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2) );
        for (String element: list) {
            System.out.println(element);
        }
    }

    public static void main( String[] args ) {
        LambdaApp app = new LambdaApp();
        // app.sortJ7();
        app.sortJ8();
        // app.computeJ7();
        app.computeJ8();
    }
}
