package com.fjcorona.java8.FunctionalInterface;

public class FunctionalInterface {

    public double opera(double n1, double n2) {
        Operation operation = (x, y) -> x + y;
        return operation.calcula(n1, n2);
    }

    public static void main (String[] args) {
        FunctionalInterface app = new FunctionalInterface();
        System.out.println(app.opera(2, 3));
    }
}
