package com.fjcorona.java8.FunctionalInterface;

public class FunctionalInterface {

    public double perform(double n1, double n2) {
        Operation operation = (x, y) -> x + y;
        return operation.calculate(n1, n2);
    }

    public static void main (String[] args) {
        FunctionalInterface app = new FunctionalInterface();
        System.out.println(app.perform(2, 3));
    }
}
