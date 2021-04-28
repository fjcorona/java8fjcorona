package com.fjcorona.java8.Optionals;

import java.util.Optional;

public class Optionals {

    public void probar(String value) {
        // Si el valor es null devuelve un NullPointerException
        // System.out.println(value.toLowerCase().contains("javo"));

        Optional<String> op = Optional.empty();
        // Al ser un optional vacío el método get arroja una excepción
        // Por lo cual hay que manejarlo en un bloque try catch
        try {
            op.get();
        } catch (Exception e) {
            System.out.println("No such value");
        }
    }

    public void orElse(String value) {
        // Si el valor es null devuelve un exception
        // Optional<String> op = Optional.of(value);
        // System.out.println(op.get());

        // Hay que indicar que el valor puede ser nulleable
        // Optional<String> op = Optional.ofNullable(value);
        // System.out.println(op.get());

        // No sólo basta con indicar nulleable
        // Además hay que agregar un valor por default
        Optional<String> op = Optional.ofNullable(value);
        System.out.println(op.orElse("No such element"));
    }

    public void orElseThrow(String value) {
        // Funciona parecido a orElseThrow
        // Pero en lugar de un valor por defecto retorna una excepción
        Optional<String> op = Optional.ofNullable(value);
        String retorno = op.orElseThrow(NullPointerException::new);
        System.out.println(retorno);
    }

    public void isPresent(String value) {
        // isPresent sólo indica si el valor ha sido inicializado o no
        // Optional<String> op = Optional.of(value);
        // Debe ser un optional de nulleable para poder ecibir nulos
        Optional<String> op = Optional.ofNullable(value);
        System.out.println(op.isPresent());
    }

    public static void main (String[] args) {
        Optionals app = new Optionals();

        app.probar("JavoCrown");
        app.probar("JavierCorona");
        app.probar(null);

        app.orElse("JavoCrown");
        app.orElse(null);

        app.isPresent("JavoCrown");
        app.isPresent(null);

        app.orElseThrow("JavoCrown");
        app.orElseThrow(null);
    }

}