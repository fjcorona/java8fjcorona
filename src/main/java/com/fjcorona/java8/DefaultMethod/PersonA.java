package com.fjcorona.java8.DefaultMethod;

public interface PersonA {
    public void walk();

    default public void talk () {
        System.out.println("Hola, es la PersonaA quien te habla.");
    }

    default public void sing () {
        System.out.println("Soy PersonaA y te canto con todo el corazón.");
    }
}
