package com.fjcorona.java8.ParallelStreamsApp;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsApp {

    private List<Integer> numeros;

    public void llenar() {
        numeros = new ArrayList<>();

        for (int idx = 1; idx <= 10; idx ++) {
            numeros.add(idx);
        }
    }

    public void probarStream() {
        numeros.stream().forEach(System.out::println);
    }

    public void probarStreamParalelo() {
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main (String[] args) {
        ParallelStreamsApp app = new ParallelStreamsApp();

        app.llenar();
        app.probarStream();
        app.probarStreamParalelo();
    }
}
