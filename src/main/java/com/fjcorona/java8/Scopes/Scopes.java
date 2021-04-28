package com.fjcorona.java8.Scopes;

public class Scopes {

    private static double attribute1;
    private double attribute2;

    public void testLocalAttributeJ7() {
        // La variable debe ser definida como final para usarse en la clase anónima
        // El valor no se puede modificar;
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
        // La variable debe ser definida como final para usarse en la expresión lambda
        // El valor no se puede modificar;
        final double z = 3;
        Operation operation = (x, y) -> x+y+z;
        System.out.println(operation.compute(1, 2));
    }

    public void testAttributesStaticVariablesJ7() {
        Operation operation = new Operation() {
            @Override
            public double compute(double n1, double n2) {
                // Los atributos de clase (estáticos o no)
                // Pueden ser usados y modificados dentro de la clase anónima
                attribute1 = n1 + n2;
                attribute2 = attribute1;
                return attribute2;
            }
        };

        System.out.println(operation.compute(1,2));
    }

    public void testAttributesStaticVariablesJ8() {
        Operation operation = (x, y) -> {
            // Los atributos de clase (estáticos o no)
            // Pueden ser usados y modificados dentro de la expresión lambda
            attribute1 = x + y;
            attribute2 = attribute1;
            return attribute2;
        };

        System.out.println(operation.compute(1, 2));
    }

    public static void main(String[] args) {
        Scopes scopes = new Scopes();
        // scopes.testLocalVariableJ7();
        scopes.testLocalVariableJ8();
        // scopes.testAttributesStaticVariablesJ7();
        scopes.testAttributesStaticVariablesJ8();
    }

}
