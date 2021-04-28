package com.fjcorona.java8.Scopes;

public class Scopes {

    private static double atributo1;
    private double atributo2;

    public void pruebaLocalVariableJ7() {
        // La variable debe ser definida como final para usarse en la clase anónima
        // El valor no se puede modificar;
        final double n3 = 3;
        Operacion operacion = new Operacion() {
            @Override
            public double calcula(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        System.out.println(operacion.calcula(1,2));
    }

    public void pruebaLocalVariableJ8() {
        // La variable debe ser definida como final para usarse en la expresión lambda
        // El valor no se puede modificar;
        final double z = 3;
        Operacion operacion = (x, y) -> x+y+z;
        System.out.println(operacion.calcula(1, 2));
    }

    public void pruebaAtributosStaticVariablesJ7() {
        Operacion operacion = new Operacion() {
            @Override
            public double calcula(double n1, double n2) {
                // Los atributos de clase (estáticos o no)
                // Pueden ser usados y modificados dentro de la clase anónima
                atributo1 = n1 + n2;
                atributo2 = atributo1;
                return atributo2;
            }
        };

        System.out.println(operacion.calcula(1,2));
    }

    public void pruebaAtributosStaticVariablesJ8() {
        Operacion operacion = (x, y) -> {
            // Los atributos de clase (estáticos o no)
            // Pueden ser usados y modificados dentro de la expresión lambda
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo2;
        };

        System.out.println(operacion.calcula(1, 2));
    }

    public static void main(String[] args) {
        Scopes scopes = new Scopes();
        // scopes.pruebaLocalVariableJ7();
        scopes.pruebaLocalVariableJ8();
        // scopes.pruebaAtributosStaticVariablesJ7();
        scopes.pruebaAtributosStaticVariablesJ8();
    }

}
