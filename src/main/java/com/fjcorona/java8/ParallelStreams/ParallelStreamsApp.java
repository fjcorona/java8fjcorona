package com.fjcorona.java8.ParallelStreams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsApp {

    private List<Integer> numbers;

    public void fillIn() {
        numbers = new ArrayList<>();

        for (int idx = 1; idx <= 10; idx ++) {
            numbers.add(idx);
        }
    }

    public void testStream() {
        numbers.stream().forEach(System.out::println);
    }

    public void testParallelStream() {
        numbers.parallelStream().forEach(System.out::println);
    }

    public static void main (String[] args) {
        ParallelStreamsApp app = new ParallelStreamsApp();

        app.fillIn();
        app.testStream();
        app.testParallelStream();
    }
}
