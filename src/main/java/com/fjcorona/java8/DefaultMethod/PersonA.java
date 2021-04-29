package com.fjcorona.java8.DefaultMethod;

public interface PersonA {
    public void walk();

    default public void talk () {
        System.out.println("Hi, PersonA is talking to you.");
    }

    default public void sing () {
        System.out.println("PersonA is singing to you.");
    }
}
