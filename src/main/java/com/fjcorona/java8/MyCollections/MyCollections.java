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
        // Con un ciclo for común y corriente

        /*
        for (String element : list) {
            System.out.println(element);
        }
        */

        // Con una expresión lambda
        // list.forEach( x -> System.out.println(x) );

        // Con referencia a método
        list.forEach(System.out::println);
    }

    public void usaRemoveIf() {
        // Con un ciclo for. Retorna una excepción
        /*
        for (String element : list) {
            if (element.equalsIgnoreCase("Crown")) {
                list.remove(element);
            }
        }
        */

        // Con un iterator
        /*
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase("Crown")) {
                it.remove();
            }
        }
        */

        // Con una expresión lambda
        list.removeIf(x -> x.equalsIgnoreCase("Crown"));
    }

    public void useSort() {


        // -------- CON ḾETODO SORT DE COLLECTIONS


        // Clase anónima
        /*
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Expresión lambda
        // Collections.sort(list, (x, y) -> x.compareToIgnoreCase(y));

        // Referencia a método
        // Collections.sort(list, String::compareToIgnoreCase);


        // -------- CON ḾETODO SORT PROPIO DE LA LISTA


        // Clase anónima
        /*
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Expresión lambda
        // list.sort( (x, y) -> x.compareToIgnoreCase(y) );

        // Referencia a método
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
