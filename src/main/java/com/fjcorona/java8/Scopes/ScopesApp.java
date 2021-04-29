package com.fjcorona.java8.Scopes;

public class ScopesApp {

    private static double attribute1;
    private double attribute2;

    public void testLocalAttributeJ7() {
        // The variable must be defined as final in order to be able to used in an anonymous class.
        // The value could not be modified.
        final double n3 = 3;
        Operation operation = new Operation() {
            @Override
            public double compute(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        System.out.println(operation.compute(1,2));
    }

    public void testLocalVariableJ8() {
        // The variable must be defined as final in order to be able to used in a lambda expression.
        // The value could not be modified.
        final double z = 3;
        Operation operation = (x, y) -> x+y+z;
        System.out.println(operation.compute(1, 2));
    }

    public void testAttributesStaticVariablesJ7() {
        Operation operation = new Operation() {
            @Override
            public double compute(double n1, double n2) {
                // Wether they are static or not.
                // The class attributes could be used and modified inside an anonymous class.
                attribute1 = n1 + n2;
                attribute2 = attribute1;
                return attribute2;
            }
        };

        System.out.println(operation.compute(1,2));
    }

    public void testAttributesStaticVariablesJ8() {
        Operation operation = (x, y) -> {
            // Wether they are static or not.
            // The class attributes could be used and modified inside a lambda expression.
            attribute1 = x + y;
            attribute2 = attribute1;
            return attribute2;
        };

        System.out.println(operation.compute(1, 2));
    }

    public static void main(String[] args) {
        ScopesApp app = new ScopesApp();
        // app.testLocalVariableJ7();
        app.testLocalVariableJ8();
        // app.testAttributesStaticVariablesJ7();
        app.testAttributesStaticVariablesJ8();
    }

}
