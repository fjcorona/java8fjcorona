package com.fjcorona.java8.Optionals;

import java.util.Optional;

public class Optionals {

    public void test(String value) {
        // NullPointerException will be thrown if value = null
        // System.out.println(value.toLowerCase().contains("javo"));

        Optional<String> op = Optional.empty();
        // Since we have an empty optional, the method will thrown an exception
        // So we need to handle it wiath a try-catch
        try {
            op.get();
        } catch (Exception e) {
            System.out.println("No such value");
        }
    }

    public void orElse(String value) {
        // If value = null, it returns an exception
        // Optional<String> op = Optional.of(value);
        // System.out.println(op.get());

        // We must indicate that the value could be nullable
        // Optional<String> op = Optional.ofNullable(value);
        // System.out.println(op.get());

        // Indicating "nullable" it's not enough
        // We need to indicate a default value besides.
        Optional<String> op = Optional.ofNullable(value);
        System.out.println(op.orElse("No such element"));
    }

    public void orElseThrow(String value) {
        // The performance is very similar to the orElseThrow one
        // But we indicate an exception instead a default value.
        Optional<String> op = Optional.ofNullable(value);
        String myReturn = op.orElseThrow(NullPointerException::new);
        System.out.println(myReturn);
    }

    public void isPresent(String value) {
        // isPresent just indicates if value has been initialized.
        // Optional<String> op = Optional.of(value);
        // In order to be able to get "null" values, It must be nullable.
        Optional<String> op = Optional.ofNullable(value);
        System.out.println(op.isPresent());
    }

    public static void main (String[] args) {
        Optionals app = new Optionals();

        app.test("JavoCrown");
        app.test("JavierCorona");
        app.test(null);

        app.orElse("JavoCrown");
        app.orElse(null);

        app.isPresent("JavoCrown");
        app.isPresent(null);

        app.orElseThrow("JavoCrown");
        app.orElseThrow(null);
    }

}
