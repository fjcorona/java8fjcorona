package com.fjcorona.java8.MyCollections;

import java.util.*;

public class MyCollections {

    private List<String> lista;

    public void llenaLista() {
        lista = new ArrayList<>();

        lista.add("JavoCrown");
        lista.add("Javo");
        lista.add("Crown");
    }

    public void usaForEach() {
        // Con un ciclo for común y corriente

        /*
        for (String element : lista) {
            System.out.println(element);
        }
        */

        // Con una expresión lambda
        // lista.forEach( x -> System.out.println(x) );

        // Con referencia a método
        lista.forEach(System.out::println);
    }

    public void usaRemoveIf() {
        // Con un ciclo for. Retorna una excepción
        /*
        for (String element : lista) {
            if (element.equalsIgnoreCase("Crown")) {
                lista.remove(element);
            }
        }
        */

        // Con un iterator
        /*
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase("Crown")) {
                it.remove();
            }
        }
        */

        // Con una expresión lambda
        lista.removeIf(x -> x.equalsIgnoreCase("Crown"));
    }

    public void usaSort() {


        // -------- CON ḾETODO SORT DE COLLECTIONS


        // Clase anónima
        /*
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Expresión lambda
        // Collections.sort(lista, (x, y) -> x.compareToIgnoreCase(y));

        // Referencia a método
        // Collections.sort(lista, String::compareToIgnoreCase);


        // -------- CON ḾETODO SORT PROPIO DE LA LISTA


        // Clase anónima
        /*
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Expresión lambda
        // lista.sort( (x, y) -> x.compareToIgnoreCase(y) );

        // Referencia a método
        lista.sort(String::compareToIgnoreCase);
    }

    public static void main (String[] args) {
        MyCollections app = new MyCollections();

        app.llenaLista();
        app.usaForEach();

        app.usaSort();
        app.usaForEach();

        app.usaRemoveIf();
        app.usaForEach();
    }

}
