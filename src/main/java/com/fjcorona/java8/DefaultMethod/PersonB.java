package com.fjcorona.java8.DefaultMethod;

public interface PersonB {

    public void sleep();

    default public void talk() {
        System.out.println("Hola, es la PersonaB quien te habla.");
    }

    default public void eat() {
        System.out.println("La PersonaB está comiendo.");
    }
}
