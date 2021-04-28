package com.fjcorona.java8.DefaultMethod;

public class DefaultMethod implements PersonA, PersonB {

    @Override
    public void walk() {
        System.out.println("Soy la PersonaA y estoy caminando.");
    }

    @Override
    public void sleep() {
        System.out.println("PersonaB se encuentra dormida.");
    }

    @Override
    public void talk() {
        /*
         * Al tener dos interfaces implementadas con metodos default
         * Que se llaman exactamente igual
         * Es necesario hacer la implementación en la clase
         * E indicar la interfaz de la cual iumplemntaremos dicho método.
         * Si no queremos usar ningún método podemos directamente sobreescribir
         * Su lógica.
         */
        PersonA.super.talk();
        // PersonB.super.talk();
    }

    public static void main (String[] args) {
        DefaultMethod app = new DefaultMethod();

        app.walk();
        app.talk();
        app.eat();
        app.sing();
        app.sleep();
    }
}
