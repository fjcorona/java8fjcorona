package com.fjcorona.java8.DefaultMethod;

public interface PersonaA {
    public void camina();

    default public void habla () {
        System.out.println("Hola, es la PersonaA quien te habla.");
    }

    default public void canta () {
        System.out.println("Soy PersonaA y te canto con todo el corazón.");
    }
}
