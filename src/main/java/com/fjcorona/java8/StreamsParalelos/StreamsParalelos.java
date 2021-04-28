package com.fjcorona.java8.StreamsParalelos;

import java.util.ArrayList;
import java.util.List;

public class StreamsParalelos {

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
        StreamsParalelos app = new StreamsParalelos();

        app.llenar();
        app.probarStream();
        app.probarStreamParalelo();
    }
}
