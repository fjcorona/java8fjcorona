package com.fjcorona.java8.MyCollections;

import java.util.*;

public class MyCollections {

    private List<String> list;

    public void fillUpList() {
        list = new ArrayList<>();

        list.add("JavoCrown");
        list.add("Javo");
        list.add("Crown");
    }

    public void useForEach() {
        // With a simple for loop

        /*
        for (String element : list) {
            System.out.println(element);
        }
        */

        // With a lambda expression
        // list.forEach( x -> System.out.println(x) );

        // With a reference to method
        list.forEach(System.out::println);
    }

    public void usaRemoveIf() {
        // If a for loop is used, it returns an exception
        /*
        for (String element : list) {
            if (element.equalsIgnoreCase("Crown")) {
                list.remove(element);
            }
        }
        */

        // With an iterator
        /*
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase("Crown")) {
                it.remove();
            }
        }
        */

        // With a lambda expression
        list.removeIf(x -> x.equalsIgnoreCase("Crown"));
    }

    public void useSort() {


        // -------- WITH "SORT" METHOD FROM COLLECTIONS


        // Anonymous class
        /*
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Lambda expression
        // Collections.sort(list, (x, y) -> x.compareToIgnoreCase(y));

        // Reference to method
        // Collections.sort(list, String::compareToIgnoreCase);


        // -------- WITH "SORT" METHOD INHERENT TO THE LIST


        // Anonymous class
        /*
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Lambda expression
        // list.sort( (x, y) -> x.compareToIgnoreCase(y) );

        // Reference to method
        list.sort(String::compareToIgnoreCase);
    }

    public static void main (String[] args) {
        MyCollections app = new MyCollections();

        app.fillUpList();
        app.useForEach();

        app.useSort();
        app.useForEach();

        app.usaRemoveIf();
        app.useForEach();
    }

}
