package com.fjcorona.java8.Lambda;

import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

    public void ordenaJ7 () {
        List<String> lista = new ArrayList<>();
        lista.add("JavoCrown");
        lista.add("Javo");
        lista.add("Crown");

        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void calculaJ7 () {
        Operacion operacion = new Operacion() {
            @Override
            public double calculaPromedio(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };

        System.out.println(operacion.calculaPromedio(2,3) );
    }

    public void calculaJ8() {
        // Operacion operacion = (double x, double y) -> {return (x + y) / 2;};
        // Operacion operacion = (double x, double y) -> (x + y) / 2;
        Operacion operacion = (x, y) -> (x + y) / 2;
        System.out.println(operacion.calculaPromedio(3,5));
    }

    public void ordenaJ8() {
        List<String> lista = new ArrayList<>();
        lista.add("JavoCrown");
        lista.add("Javo");
        lista.add("Crown");

        // Collections.sort(lista, (String o1, String o2) -> o1.compareTo(o2) );
        Collections.sort(lista, (o1, o2) -> o1.compareTo(o2) );
        for (String elemento: lista) {
            System.out.println(elemento);
        }
    }

    public static void main( String[] args ) {
        LambdaApp lambdaApp = new LambdaApp();
        // lambdaApp.ordenaJ7();
        lambdaApp.ordenaJ8();
        // lambdaApp.calculaJ7();
        lambdaApp.calculaJ8();
    }
}
