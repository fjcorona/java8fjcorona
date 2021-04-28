package com.fjcorona.java8.DefaultMethod;

public interface PersonB {

    public void duerme();

    default public void habla() {
        System.out.println("Hola, es la PersonaB quien te habla.");
    }

    default public void come() {
        System.out.println("La PersonaB está comiendo.");
    }
}
